package ramlakhan;
import java.sql.Connection;

public class Rank{
    
    //Properties of a Rank object:
    private String userPlayers [] = new String [5];
    private String userName;
    private String userTeamName;
    private String tournamentName;
    private String tournamentID;
    private int points;
    private String wins;
    private String draws;
    private String losses;
    private String goalsScored;
    private String leagueTableRankings [] = new String [6];
    private int teamPoints [] = new int [6];
    private Database db = new Database ();
    
    /*
    Rank Constructor: (post Tournament)
    * Creates a Rank after a Tournament has occured.
    * Essentially a modified League object.
    - Receives a League object and use League class accessor methods to set 
      the value of all the properties of a Rank object equal to the 
      relevant matching League property.
    - Stores all 6 team's points in an array. 
        > Order: User, AI1, AI2, AI3, AI4, AI5
        > Used to write to the database.
    */
    public Rank (League rankedLeague){
        userPlayers = rankedLeague.getTeam(0).getTeamPlayers();
        userTeamName = rankedLeague.getTeam(0).getTeamName();
        tournamentName = rankedLeague.getTeam(0).getTournamentName();
        tournamentID = rankedLeague.getTeam(0).getTournamentID();
        wins = rankedLeague.getTeam(0).getWins();
        draws = rankedLeague.getTeam(0).getDraws();
        losses = rankedLeague.getTeam(0).getLosses();
        goalsScored = rankedLeague.getTeam(0).getGoalsScored();
        
        leagueTableRankings = rankedLeague.getRankTable();
        
        for (int index = 0; index < 6; index++){
            teamPoints [index] = rankedLeague.getTeam(index).getPoints();
        }//end for loop
    }//Rank Object (In-Game)
    
    /*
    Rank Constructor: (creation from database)
    * Used to create a Rank from the database.
    - Receives the following properties:
        > Username
        > User Team's Name
        > Tournament Name
        > User's Goalkeeper Player ID
        > User's Centre Back Player ID
        > User's Central Defensive Midfielder Player ID
        > User's Central Attacking Midifelder Player ID
        > User's Striker Player ID
        > User's Amount of Wins
        > User's Amount of Draws
        > User's Amount of Losses
        > User's Amount of Goals Scored
        > AI Team 1's Points
        > AI Team 2's Points
        > AI Team 3's Points
        > AI Team 4's Points
        > AI Team 5's Points
    - Creates a temporary Team to use the method getTeamPlayers to get a 
      formatted list of the user team's players based on their player ID.
    - Example: [CAM] Lionel Messi 
    - Sets all the Rank properties to the corresponding parsed value.
    - Calls the method generateLeagueTable and parses the points acquired by the
      5 generated teams.
    */
    public Rank (String uN, String tN, String toN, String gkID, String cbID, 
            String cdmID, String camID, String stID, int pts, String wns, 
            String drws, String ls, String gS, int t1Pts, int t2Pts, int t3Pts, 
            int t4Pts, int t5Pts ){
        Team tempUserTeam = new Team (uN, tN, toN, gkID, cbID, cdmID, camID, stID);
        
        userPlayers = tempUserTeam.getTeamPlayers();
        userName = uN;
        userTeamName = tN;
        tournamentName = toN;
        points = pts;
        wins = wns;
        draws = drws;
        losses = ls;
        goalsScored = gS;
        leagueTableRankings = generateLeagueTable (t1Pts, t2Pts, t3Pts, t4Pts, t5Pts);
        
    }//Rank Object (From Database)
    
    /*
    generateLeagueTable Accessor and Mutator Method:
    * Creates and returns a rankings table of a Rank. (String)
    - Receives the 5 generated team points in the correct name order.
    - Uses a for loop to store the team names in a string array.
    - Sets the values of the points in a parallel integer array to the string
      array that stores the team names.
    - Uses a selection sort to sort the arrays in descending order of points 
      acquired.
    - Uses a for loop to neatly format the table in the new order.
    - Example: [2] Leonidas - 10000 Points
    */
    public String [] generateLeagueTable (int t1Pts, int t2Pts, int t3Pts, 
    int t4Pts, int t5Pts){
        String formattedRankings [] = new String [6];
        String teamNames [] = new String [6];
        
        //User team properties:
        teamNames [0] = userTeamName;
        teamPoints [0] = points;
        
        for (int index = 1; index < 6; index++){
            teamNames [index] = "AI Team " + index;
        }//end for loop
        teamPoints [1] = t1Pts;
        teamPoints [2] = t2Pts;
        teamPoints [3] = t3Pts;
        teamPoints [4] = t4Pts;
        teamPoints [5] = t5Pts;
        
        for (int x = 0; x < 5; x++){
            for (int y = x + 1; y < 6; y++){
                if (teamPoints [y] > teamPoints [x]){
                    int tempPoints = teamPoints [x];
                    teamPoints [x] = teamPoints [y];
                    teamPoints [y] = tempPoints;
                    
                    String tempName = teamNames [x];
                    teamNames [x] = teamNames [y];
                    teamNames [y] = tempName;
                }//if then (sort arrays)
            }//end for loop (sort y)
        }//end for loop (sort x)
        
        for (int position = 0; position < 6; position++){
            formattedRankings [position] = "[" + (position + 1) + "] " 
            + teamNames [position] + " - " + teamPoints [position] + " Points";
        }//end for loop
        
        return formattedRankings;
    }//generateLeagueTable
    
    /*
    getUserPlayer Accessor Method:
    * Returns a specific player of the user team. (String)
    - Receives the index of the player in the array.
        [0] - Goalkeeper
        [1] - Centre Back
        [2] - Central Defensive Midfielder
        [3] - Central Attacking Midfielder
        [4] - Striker
    */
    public String getUserPlayer (int index){
        return userPlayers [index];
    }//getUserPlayer
    
    /*
    getUserTeamName Accessor Method:
    * Returns the user's team name. (String)
    */
    public String getUserTeamName (){
        return userTeamName;
    }//getUserTeamName

    /*
    getTournamentName Accessor Method:
    * Returns the user's tournament name. (String)
    */
    public String getTournamentName() {
        return tournamentName;
    }//getTournamentName

    /*
    getTournamentID Accessor Method:
    * Returns the Tournament ID that will be used as the primary key in the
      database. (String)
    - This number has to be the same as the Teams, Opponent and Leaderboard 
      tables are all joined using the same primary key number.
    */
    public String getTournamentID() {
        return tournamentID;
    }//getTournamentID

    /*
    getWins Accessor Method:
    * Returns the user's amount of wins. (String)
    */
    public String getWins() {
        return wins;
    }//getWins

    /*
    getDraws Accessor Method:
    * Returns the user's amount of draws. (String)
    */
    public String getDraws() {
        return draws;
    }//getDraws

    /*
    getLosses Accessor Method:
    * Returns the user's amount of losses. (String)
    */
    public String getLosses() {
        return losses;
    }//getLosses

    /*
    getGoalsScored Accessor Method:
    * Returns the user team's goals scored. (String)
    */
    public String getGoalsScored() {
        return goalsScored;
    }//getGoalsScored

    /*
    getLeagueTableRankings Accessor Method:
    * Returns the formatted ranking of a team based on their position in the 
      table. (String)
    - Used to update JLabels when displaying the rankings table.
    */
    public String getLeagueTableRankings(int position) {
        return leagueTableRankings [position];
    }//getLeagueTableRankings

    /*
    //getTeamPoints Accessor Method:
    * Returns the points of a specific team. (Integer)
    - Receives the index of the team required.
    */
    public int getTeamPoints(int team) {
        return teamPoints [team];
    }//getTeamPoints
    
    /*
    getRankTitle Accessor Method:
    * Returns the rank title (String) that will be displayed on a leaderboard button.
    */
    public String getRankTitle (){
        String rank = " " + userName + " - [" + points + " Points]";
        return rank;
    }//getRankTitle
    
    /*
    addTournamentToDatabase Mutator Method:
    * Adds the tournament results to the database.
    - Calls the addOpponentsToDatabase and addTeamResultsToDatabase methods in
      the Database class.
    */
    public void addTournamentToDatabase (){
        db.addOpponentsToDatabase(this);
        db.addTeamResultsToDatabase(this);
    }//addTournamentToDatabase
    
}//Rank class

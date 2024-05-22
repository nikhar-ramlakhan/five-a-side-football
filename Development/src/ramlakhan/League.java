package ramlakhan;
import java.util.Random;
import javax.swing.JOptionPane;

public class League {
    
    //Properties of a League object:
    private Team [] teamsLeagueArr = new Team [6];
    private String rankingsTable [] = new String [6];

    /*
    League Constructor:
    * Creates an instance of the League class.
    * Essentially an array of 6 teams.
    - Uses an array of 6 teams to store each team.
    - Receives a user team and 5 generated teams to be put into the array.
    - Creates a Ranking Table in the correct format.
    */
    public League (Team uT, Team t1, Team t2, Team t3, Team t4, Team t5){
        teamsLeagueArr [0] = uT;
        teamsLeagueArr [1] = t1;
        teamsLeagueArr [2] = t2;
        teamsLeagueArr [3] = t3;
        teamsLeagueArr [4] = t4;
        teamsLeagueArr [5] = t5;
        
        for (int index = 0; index < 6; index++){
            rankingsTable [index] = "[" + (index + 1) + "] " + teamsLeagueArr 
            [index].getTeamName() + " - " + teamsLeagueArr [index].getPoints() 
            + " Points";
        }//end for loop
        
    }//League Constructor
    
    //Variables required for sorting and updating the Rankings Table:
    private int sortedPoints [] = new int [6];
    private String rankTeamNames [] = new String [6];
    
    /*
    updateTable Mutator Method:
    * Updates the Rankings Table of the League.
    - Gathers each teams name and points and stores them in two separate arrays
      of type String and int respectively.
    - Uses a selection sort to sort the array descending Team Points order.
    - Updates the Ranking Table in the correct format.
    - Example: [1] Leonidas - 10000 Points
    */
    public void updateTable (){
        for (int index = 0; index < 6; index++){
            sortedPoints [index] = teamsLeagueArr [index].getPoints();
            rankTeamNames [index] = teamsLeagueArr [index].getTeamName();
        }//end for loop
        
        for (int x = 0; x < 5; x++){
            for (int y = x + 1; y < 6; y++){
                
                if (sortedPoints [y] > sortedPoints [x]){
                    int pointTemp = sortedPoints [x];
                    sortedPoints [x] = sortedPoints [y];
                    sortedPoints [y] = pointTemp;
                    
                    String nameTemp = rankTeamNames [x];
                    rankTeamNames [x] = rankTeamNames [y];
                    rankTeamNames [y] = nameTemp;
                }//if then
            }//end for loop (sort inner)
        }//end for loop (sort outer)
        
        for (int rank = 0; rank < 6; rank++){
            rankingsTable [rank] = "[" + (rank + 1) + "] " + rankTeamNames 
                        [rank] + " - " + sortedPoints [rank] + " Points";
        }//end for loop
    }//updateTable
    
    /*
    getRankTable Accessor Method:
    * Returns the Rankings Table. (String)
    */
    public String [] getRankTable (){
        return rankingsTable;
    }//getRankTable accessor
    
    /*
    getTeam Accessor Method:
    * Returns a specfic Team object in the league.
    - Receives the index of the team in the main teamsLeagueArr array.
    */
    public Team getTeam (int index){
        Team find = teamsLeagueArr [index];
        return find;
    }
    
    /*
    enums have been used to make more logical sense in the program and remove
    the need of having to use chars and assign letters with them for specific
    tactics.
    */
    
    /*
    Mentality enum:
    * Possible selections when selecting a Mentality tactic.
    */
    enum Mentality {
        ATTACKING,
        DEFENSIVE,
        BALANCED
    }//Mentality enum
    
    /*
    InPossession enum:
    Possible selections when selecting an In Possession tactic.
    */
    enum InPossession {
        TikiTaka,
        ShortPassing,
        FastBuildUp
    }//InPossession enum
    
    /*
    OutOfPossession:
    * Possible selections when selecting an Out of Possession tactic.
    */
    enum OutOfPossession {
        TeamPress,
        CounterAttack,
        ParkTheBus
    }//GameOutcomes enum
    
    /*
    GamOutcomes enum:
    * Possible game outcomes.
    */
    enum GameOutcomes {
        Win,
        Draw,
        Loss
    }//GameOutComes enum
    
    //Variables required for simulating matchweeks
    private League.Mentality userMentality;
    private League.Mentality aiMentality;
    private League.InPossession userInPossession;
    private League.InPossession aiInPossession;
    private League.OutOfPossession userOutOfPossession;
    private League.OutOfPossession aiOutOfPossession;
    private String userResult;
    private String game2Result;
    private String game3Result;

    /*
    playMatchWeek Accessor and Mutator Method:
    * Runs all the methods required to simulate a specific matchweek.
    - Receives the matchweek number and the user's selected tactics (Mentality,
      InPossession and OutOfPossession),.
    - Overides the current local tactic enum variables.
    - Generates a random value for each enum tactic.
        > These enums will be used for the simulation of the other teams 
          matches as well.
    - Uses a switch statement which determines which matchweek to simulate.
        > Overides the userTeamResult String.
        > Does not require a default as matchweek cannot be any other case as it
          is program defined.
    - Runs the method updateTable to update the Rankings Table.
    - Displays a Message Dialog Box with the results of the 3 games simulated.
    - Returns the user teams result which is displayed on the Tournament Screen.
    */
    public String playMatchWeek (int matchweek, League.Mentality selMentality, 
    League.InPossession selInPossession, League.OutOfPossession selOutOfPossession){
        String userTeamResult = "";
        userMentality = selMentality;
        userInPossession = selInPossession;
        userOutOfPossession = selOutOfPossession;
        
        aiMentality = League.Mentality.values()
                [new Random().nextInt(League.Mentality.values().length)];
        aiInPossession = League.InPossession.values()
                [new Random().nextInt(League.InPossession.values().length)];
        aiOutOfPossession = League.OutOfPossession.values()
                [new Random().nextInt(League.OutOfPossession.values().length)];
        
        switch (matchweek){
            case 1:
                userTeamResult = matchWeek1 ();
            break;
            
            case 2:
                userTeamResult = matchWeek2 ();
            break;
            
            case 3:
                userTeamResult = matchWeek3 ();
            break;
            
            case 4:
                userTeamResult = matchWeek4 ();
            break;
            
            case 5:
                userTeamResult = matchWeek5 ();
            break;
        }//end switch
        updateTable ();
        
        JOptionPane.showMessageDialog(null, "Matchday " + matchweek + " Results: "
                    + "\n" + userResult + "\n"+ game2Result + "\n" + game3Result, 
                            "Matchday Results", JOptionPane.INFORMATION_MESSAGE);
        
        return userTeamResult;
    }//playMatchWeek
    
    /*
    matchWeek1 Accessor Method:
    * Returns the result of the user team. (String)
    * Simulates all the games for Matchweek 1.
        > User Team vs AI Team 1
        > AI Team 2 vs AI Team 3
        > AI Team 4 vs AI Team 5
    * Calls the method playMatch and parses the two teams and a boolean that
      indicates if it is a user team or not.
    - The first team parsed is the team on the left when a result is displayed.
    - Returns the result of the user's team.
    */
    public String matchWeek1 (){
        userResult = playMatch (teamsLeagueArr [0], teamsLeagueArr [1], true);
        game2Result = playMatch (teamsLeagueArr [2], teamsLeagueArr [3], false);
        game3Result = playMatch (teamsLeagueArr [4], teamsLeagueArr [5], false);
        
        return userResult;
    }//matchWeek1
    
    /*
    matchWeek2 Accessor Method:
    * Returns the result of the user team. (String)
    * Simulates all the games for Matchweek 2.
        > User Team vs AI Team 2
        > AI Team 1 vs AI Team 4
        > AI Team 3 vs AI Team 5
    * Calls the method playMatch and parses the two teams and a boolean that
      indicates if it is a user team or not.
    - The first team parsed is the team on the left when a result is displayed.
    - Returns the result of the user's team.
    */
    public String matchWeek2 (){
        userResult = playMatch (teamsLeagueArr [0], teamsLeagueArr [2], true);
        game2Result = playMatch (teamsLeagueArr [1], teamsLeagueArr [4], false);
        game3Result = playMatch (teamsLeagueArr [3], teamsLeagueArr [5], false);
        
        return userResult;
    }//matchWeek2  
    
    /*
    matchWeek3 Accessor Method:
    * Returns the result of the user team. (String)
    * Simulates all the games for Matchweek 3.
        > User Team vs AI Team 3
        > AI Team 1 vs AI Team 5
        > AI Team 2 vs AI Team 4
    * Calls the method playMatch and parses the two teams and a boolean that
      indicates if it is a user team or not.
    - The first team parsed is the team on the left when a result is displayed.
    - Returns the result of the user's team.
    */
    public String matchWeek3 (){
        userResult = playMatch (teamsLeagueArr [0], teamsLeagueArr [3], true);
        game2Result = playMatch (teamsLeagueArr [1], teamsLeagueArr [5], false);
        game3Result = playMatch (teamsLeagueArr [2], teamsLeagueArr [4], false);
        
        return userResult;
    }//matchWeek3  
    
    /*
    matchWeek4 Accessor Method:
    * Returns the result of the user team. (String)
    * Simulates all the games for Matchweek 4.
        > User Team vs AI Team 4
        > AI Team 1 vs AI Team 3
        > AI Team 2 vs AI Team 5
    * Calls the method playMatch and parses the two teams and a boolean that
      indicates if it is a user team or not.
    - The first team parsed is the team on the left when a result is displayed.
    - Returns the result of the user's team.
    */
    public String matchWeek4 (){
        userResult = playMatch (teamsLeagueArr [0], teamsLeagueArr [4], true);
        game2Result = playMatch (teamsLeagueArr [1], teamsLeagueArr [3], false);
        game3Result = playMatch (teamsLeagueArr [2], teamsLeagueArr [5], false);
        
        return userResult;
    }//matchWeek4  
    
    /*
    matchWeek5 Accessor Method:
    * Returns the result of the user team. (String)
    * Simulates all the games for Matchweek 5.
        > User Team vs AI Team 5
        > AI Team 1 vs AI Team 2
        > AI Team 3 vs AI Team 4
    * Calls the method playMatch and parses the two teams and a boolean that
      indicates if it is a user team or not.
    - The first team parsed is the team on the left when a result is displayed.
    - Returns the result of the user's team.
    */
    public String matchWeek5 (){
        userResult = playMatch (teamsLeagueArr [0], teamsLeagueArr [5], true);
        game2Result = playMatch (teamsLeagueArr [1], teamsLeagueArr [2], false);
        game3Result = playMatch (teamsLeagueArr [3], teamsLeagueArr [4], false);
        
        return userResult;
    }//matchWeek5   
    
    //Variables required for simulating individual matches:
    private int t1Goals;
    private int t2Goals;
    private double t1RunGoals;
    private double t2RunGoals;
    private double t1OffBoost;
    private double t2DefBoost;
    
    /*
    The following integer arrays store the values based on the tactics selected:
    [0] - Mentality Offensive Boost
    [1] - Mentality Defensive Boost
    [2] - In Possession Offensive Boost
    [3] - In Possession Defensive Boost
    [4] - Out of Possession Offensive Boost
    [5] - Out of Possession Defensive Boost
    */
    private int team1Tactics [] = new int [6];
    private int team2Tactics [] = new int [6];
    
    /*
    playMatch Accessor and Mutator Method:
    * Returns the result of the game. (String)
    * Runs all the processes involved in simulating a match between two teams.
    - Receives the two Teams that will play each other and a boolean indicating
      if it involves a user team.
    - Variables that keep track of goals are reset to 0.
        > There is an integer and double object that store goals.
        > This is because the goals are not rounded off until all player vs player
          methods have run.
    - The result and Game Outcome enum are reset.
    - Calls the determineBoosts accessor method to overide the team1Tactics and
      team2Tactics boost values. 
        > Parses the selected mentality, inPossession, outOfPossession and array
          of the specific team.
        > The tactics that a user team selects will be the same for other teams
          that are parsed as t1.
    - Runs the teamVSteam mutator method twice, changing the order of the teams
      to make both play offensive and defensive.
        > This is explain in the teamVSteam method.
    - Rounds off the goals and sets those values to the integers storing the goals.
    - Determines which team won the game using if statements.
        > Calls the updateMethod mutator method of the Team class to update
          each teams goals, wins, losses and draws.
        > Sets the GameOutcomes enum value based on the result.
    - Checks the received boolean user to determine if a message box needs to
      be displayed to indicate the match outcome to the user.
    - Calls the updatePoints mutator method of the Teams class to determine
      the points of the team based on their form.
    - Formats the result string to look aesthetic on the results board in the
      Tournament Screen.
    - Example: Leonidas | 17 - 13 | AI Team 2
    - Returns the formatted string result.
    */
    public String playMatch (Team t1, Team t2, boolean user){
        t1Goals = 0; 
        t2Goals = 0;
        t1RunGoals = 0;
        t2RunGoals = 0;
        String result = "";
        League.GameOutcomes outcome = null;
        
        determineBoosts (userMentality, userInPossession, userOutOfPossession, 
                        team1Tactics);
        determineBoosts (aiMentality, aiInPossession, aiOutOfPossession, 
                        team2Tactics);
        
        teamVSteam (t1, t2, team1Tactics, team2Tactics, 1, 2);
        teamVSteam (t2, t1, team2Tactics, team1Tactics, 2, 1);
        
        t1Goals = (int) Math.round(t1RunGoals);
        t2Goals = (int) Math.round(t2RunGoals);
        
        if (t1Goals > t2Goals){
            t1.updateForm(1, 0, 0, t1Goals);
            t2.updateForm(0, 0, 1, t2Goals);
            outcome = League.GameOutcomes.Win;
        }//if then
        else if (t1Goals == t2Goals){
            t1.updateForm(0, 1, 0, t1Goals);
            t2.updateForm(0, 1, 0, t2Goals);
            outcome = League.GameOutcomes.Draw;
        }//else if
        else if (t1Goals < t2Goals){
            t1.updateForm(0, 0, 1, t1Goals);
            t2.updateForm(1, 0, 0, t2Goals);
            outcome = League.GameOutcomes.Loss;
        }//else if 
        
        if (user == true){
            displayMatchOutcome (outcome);
        }//if then
        
        t1.updatePoints();
        t2.updatePoints();
        
        result = t1.getTeamName() + " | " + t1Goals + " - " + t2Goals + " | " 
                + t2.getTeamName();
        return result;
    }//playMacth
    
    /*
    teamVSteam Mutator Method:
    * Simulates a match between two teams.
    * It is critical that parsing is done correctly to determine which team is
      offensive and which team is defensive!
    - Receives the two team objects as well as their integer array of tactic
      boosts and a number that indicates which team is playing offensive and
      which team is playing defensive.
        offTeam - The offensive team
        defTeam - The defensve team
        team1Tac - the tactics array of the offensive team
        team2Tac - the tactics array of the defensive team
        team number of the offensive team
        team number of the defensive team
    - team1Player will be constantly overwritten and is just the offensive team player's
      offensive stat multiplied by the boost.
    - team2Player will be constantly overwritten and is just the defensive team player's
      defensive stat multiplied by the boost.
    - Sets the offensive team and defensive team MENTALITY boosts.
        > the offensive team gets their Offensive Mentality Boost 
        > the defensive team gets their Defensive Mentality Boost
    - [Algorithm]
    
    Algorithm Process:
    * All are simulated using the playerVSplayer method by parsing the offensive
      boosted stat and defensive boosted stat of each player respectfully. 
    1) Offensive Team's Goalkeeper plays against Defensive Teams's Striker
    2) Offensive Team's Centre Back plays against Defensive Teams's Attacking Mid
    3) Offensive Team's Defensive Mid plays against Defensive Teams's Defensive Mid
    4) Offensive Team's Attacking Mid plays against Defensive Teams's Centre Back
    5) Offensive Team's Striker plays against Defensive Teams's Goalkeeper
    */
    public void teamVSteam (Team offTeam, Team defTeam, int[] offTeamTactics, 
        int defTeamTactics [], int offTeamNumber, int defTeamNumber){
        int team1Player; 
        int team2Player;
        t1OffBoost = (double) offTeamTactics [0] / 100;
        t2DefBoost = (double) defTeamTactics [1] / 100;
        
        team1Player = (int) Math.round(offTeam.getGK().getOffStat() * t1OffBoost);
        team2Player = (int) Math.round(defTeam.getST().getDefStat() * t2DefBoost);
        playerVSplayer (team1Player, team2Player, offTeamTactics, defTeamTactics, 
                        offTeamNumber, defTeamNumber);
        
        team1Player = (int) Math.round(offTeam.getCB().getOffStat() * t1OffBoost);
        team2Player = (int) Math.round(defTeam.getCAM().getDefStat() * t2DefBoost);
        playerVSplayer (team1Player, team2Player, offTeamTactics, defTeamTactics, 
                        offTeamNumber, defTeamNumber);
        
        team1Player = (int) Math.round(offTeam.getCDM().getOffStat() * t1OffBoost);
        team2Player = (int) Math.round(defTeam.getCDM().getDefStat() * t2DefBoost);
        playerVSplayer (team1Player, team2Player, offTeamTactics, defTeamTactics,
                        offTeamNumber, defTeamNumber);
        
        team1Player = (int) Math.round(offTeam.getCAM().getOffStat() * t1OffBoost);
        team2Player = (int) Math.round(defTeam.getCB().getDefStat() * t2DefBoost);
        playerVSplayer (team1Player, team2Player, offTeamTactics, defTeamTactics,
                        offTeamNumber, defTeamNumber);
        
        team1Player = (int) Math.round(offTeam.getST().getOffStat() * t1OffBoost);
        team2Player = (int) Math.round(defTeam.getGK().getDefStat() * t2DefBoost);
        playerVSplayer (team1Player, team2Player, offTeamTactics, defTeamTactics, 
                        offTeamNumber, defTeamNumber);
    }//teamVSteam
    
    /*
    playerVSplayer Mutator Method:
    * Compares two players to determine the goals scored. 
    - Recives an offensive and defensive player stat as well as the tactic arrays
      for each team and a number to represent if they are attacking or defensive.
      This is a key to ensure that the correct team's points are added because
      the running goal total variables are local.
        > 1 - Offensive
        > 2 - Defensive
    
    Algorithm Process:
    - If the offensive player's stat is greater than the defensive player's stat:
        > Update the offensive team's boost by adding the In Possession offensive
          boost [2] with the Mentality offensive boost [0]
        > Update the defensive team's boost by adding the Out of Possession 
          defensive boost [5] with the Mentality defensive boost [1]
        > Work out the difference between the stats.
        > Update the goals for the correct team.
    
    - If the defensive player's stat is greater than the offensive player's stat:
        > Update the offensive team's boost by adding the Out of Possession offensive
          boost [4] with the Mentality offensive boost [0]
        > Update the defensive team's boost by adding the In Possession 
          defensive boost [3] with the Mentality defensive boost [1]
        > Work out the difference between the stats.
        > Update the goals for the correct team.
    */
    public void playerVSplayer (int p1Off, int p2Def, int t1Tac [], int t2Tac [], 
                                int offTeam, int defTeam){
        int difference;
        if (p1Off > p2Def){
            t1OffBoost = (double) (t1Tac [0] + t1Tac [2]) / 100;
            t2DefBoost = (double) (t2Tac [1] + t2Tac [5]) / 100;
            difference = p1Off - p2Def;
            
            if (offTeam == 1){
                t1RunGoals += (double) difference / 10;
            }//if then 
            else if (offTeam == 2){
                t2RunGoals += (double) difference / 10;
            }//else if 
        }//if then
        else if (p2Def > p1Off){
            t1OffBoost = (double) (t1Tac [0] + t1Tac [4]) / 100;
            t2DefBoost = (double) (t2Tac [1] + t2Tac [3]) / 100;
            difference = p2Def - p1Off;
            
            if (defTeam == 1){
                t1RunGoals += (double) difference / 10;
            }//if then 
            else if (defTeam == 2){
                t2RunGoals += (double) difference / 10;
            }//else if
        }//else if 
    }//playerVSplayer
    
    /*
    displayMatchOutcome Method:
    * Displays a message box to the user with the game outcome.
    - Receives the GameOutcome and uses a switch to determine what must be put 
      into the message box.
    - No default required as there are no other possible cases.
    */
    public void displayMatchOutcome (League.GameOutcomes outcome){
        String captainComment = "";
        String result = "";
        
        switch (outcome){
            case Win:
                result = "WON!";
                captainComment = "Team Captain: \nTactics worked well gaffer! "
                               + "A good victory!";
            break;
            
            case Draw:
                result = "DREW!";
                captainComment = "Team Captain: \nNo differences between the two"
                               + " teams but we'll take the draw and move on!";
            break;
            
            case Loss:
                result = "LOST!";
                captainComment = "Team Captain: \nTeam didn't give it their all!"
                               + " Sorry to let you down boss.";
            break;
        }//end switch
        
        JOptionPane.showMessageDialog(null, captainComment, "YOUR TEAM " + 
                                  result, JOptionPane.INFORMATION_MESSAGE);
    }//displayMatchOutcomes

    /*
    determineBoosts Mutator Method:
    * Sets the value of the different boosts of a team.
    - Receives the mentality, in possession, out of possession and team tactic
      array that will store the values.
    - Uses a switch to determine which enum values were chosen and updates the
      tactic accordingly using the correct index.
        [0] - Mentality Offensive Boost
        [1] - Mentality Defensive Boost
        [2] - In Possession Offensive Boost
        [3] - In Possession Defensive Boost
        [4] - Out of Possession Offensive Boost
        [5] - Out of Possession Defensive Boost
    */
    public void determineBoosts (League.Mentality mentality, League.InPossession 
          inPossession, League.OutOfPossession outOfPossession, int tactics []){
        
        switch (mentality){
            case ATTACKING:
                tactics [0] = 125;
                tactics [1] = 105;
            break;    
            
            case DEFENSIVE:
                tactics [0] = 105;
                tactics [1] = 125;
            break;
                
            case BALANCED:
                tactics [0] = 115;
                tactics [1] = 115;
            break;
        }//end switch
        
        switch (inPossession){
            case TikiTaka:
                tactics [2] = 15;
                tactics [3] = -5;
            break;
        
            case ShortPassing:
                tactics [2] = 10;
                tactics [3] = 5;
            break;
            
            case FastBuildUp:
                tactics [2] = 20;
                tactics [3] = -10;
            break;
        }//end switch
        
        switch (outOfPossession){
            case TeamPress:
                tactics [4] = -5;
                tactics [5] = 20;
            break;
            
            case CounterAttack:
                tactics [4] = 10;
                tactics [5] = 10;
            break;
            
            case ParkTheBus:
                tactics [4] = 5;
                tactics [5] = 15;
            break;
        }//end switch
        
    }//determineBoosts 
}//League Class

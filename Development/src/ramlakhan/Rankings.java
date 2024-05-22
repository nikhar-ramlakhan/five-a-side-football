package ramlakhan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Rankings {
    
    //Properties of the Rankings class:
    private Database db = new Database (); 
    private Connection connection = db.getConnection(); 
    private Rank leaderboard [] = new Rank [10];
            
    /*
    Rankings Constructor:
    * Creates an array of the top 10 user teams from the Database.
    - Creates a query to join the Teams, Opponents and Leaderboard Tables 
      together by matching the same Tournament ID (primary key).
    - Uses a ResultSet to get each value.
    - Stores each value separately in the correct typed variable.
    - Creates a Rank object with the relevant tournament data.
    */
    public Rankings (){
        String username, teamName, tournamentName, gkID, cbID, cdmID, camID, 
        stID, wins, draws, losses, goalsScored;
        int userPoints, ai1Points, ai2Points, ai3Points, ai4Points, ai5Points;
        int count = 0;
        
            try {
            Statement s = connection.createStatement();
            String qry = "SELECT TOP 10 Teams.Username, Teams.[Team Name], "
                    + "Teams.[Tournament Name], Teams.[GK ID], Teams.[CB ID], "
                    + "Teams.[CDM ID], Teams.[CAM ID], Teams.[ST ID], "
                    + "Leaderboard.Points, Leaderboard.Wins, Leaderboard.Draws, "
                    + "Leaderboard.Losses, Leaderboard.[Goals Scored], "
                    + "Opponents.[Team1 Points], Opponents.[Team2 Points], "
                    + "Opponents.[Team3 Points], Opponents.[Team4 Points], "
                    + "Opponents.[Team5 Points]\n" +
                     "FROM Teams, Leaderboard, Opponents\n" +
                     "WHERE  Teams.[Tournament ID] = Opponents.[Tournament ID] "
                    + "AND Teams.[Tournament ID] = Leaderboard.[Tournament ID]\n" 
                    + "ORDER BY Leaderboard.Points DESC;";
            ResultSet rs = s.executeQuery(qry);
            
            while (rs.next() && count < 10){
                username = rs.getString("Username");
                teamName = rs.getString("Team Name");
                tournamentName = rs.getString("Tournament Name");
                gkID = rs.getString("GK ID");
                cbID = rs.getString("CB ID");
                cdmID = rs.getString("CDM ID");
                camID = rs.getString("CAM ID");
                stID = rs.getString("ST ID");
                userPoints = rs.getInt("Points");
                wins = rs.getString("Wins");
                draws = rs.getString("Draws");
                losses = rs.getString("Losses");
                goalsScored = rs.getString("Goals Scored");
                ai1Points = rs.getInt("Team1 Points");
                ai2Points = rs.getInt("Team2 Points");
                ai3Points = rs.getInt("Team3 Points");
                ai4Points = rs.getInt("Team4 Points");
                ai5Points = rs.getInt("Team5 Points");
                
                leaderboard [count] = new Rank (username, teamName, tournamentName, 
                gkID, cbID, cdmID, camID, stID, userPoints, wins, draws, losses, 
                goalsScored, ai1Points, ai2Points, ai3Points, ai4Points, ai5Points);
                count++;
            }
            rs.close();
            s.close();
            //System.out.println ("Player Data was successfully accessed from the database.");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println ("Error transferring leaderboard data!");
        }//try-catch (access Players table and place data into array)
    }//Rankings constructor
    
    /*
    getRank Accessor Method:
    * Returns a single Rank object based on the position received.
    - Receives the position of the Rank to be returned.
    */
    public Rank getRank (int position){
        return leaderboard [position];
    }//getRank
    
}//Rankings Class

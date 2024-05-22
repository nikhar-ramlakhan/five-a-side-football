package ramlakhan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Database {
    
    //Variables required for Database object:
    private Connection connection;
    
    /*
    Database Constructor:
    * Connect with the database 'Five a Side Football' to allow for data transfer
      into the program.
    */
    public Database(){
        try{
            connection = DriverManager.getConnection
            ("jdbc:ucanaccess://Five_a_Side_Football.accdb");
        }//try
        catch (Exception e){
            System.out.println ("Connection NOT successful \n");
            e.printStackTrace();
        }//end try-catch
    }//Database Object
    
    /*
    getConnection Accessor Method:
    * Return the connection of the database which allows the database to be
      accessed from other classes.
    */
    public Connection getConnection (){
        return connection;
    }//getConnection
    
    /*
    runTeamInsertQuery Mutator Method:
    * Adds the User Team's details to the Teams Table in the Database.
    - Receives a Team object.
    - Creates a string with the values that will be transfered to the database.
    - Creates the query to write to the database.
    - Indicates if the transfer was successful or not.
    */
    public void runTeamInsertQuery (Team user){
        String values; 
        values = "'" + user.getUsername() + "', '" + user.getTeamName() + "', '" 
                                    + user.getTournamentName() + "', '" 
                                    + user.getGK().getPlayerID()+ "', '" 
                                    + user.getCB().getPlayerID() + "', '" 
                                    + user.getCDM().getPlayerID() + "', '" 
                                    + user.getCAM().getPlayerID() + "', '" 
                                    + user.getST().getPlayerID() + "'";
        
        int appended; //number of rows appended.
        try {
            Statement s = connection.createStatement();
            String qry = "INSERT INTO Teams (Username, [Team Name], "
                    + "[Tournament Name], [GK ID], [CB ID], [CDM ID], [CAM ID], "
                    + "[ST ID]) VALUES (" + values + ");";
            
            appended = s.executeUpdate(qry);
            System.out.print(appended);
            s.close();
            JOptionPane.showMessageDialog(null, "Your team has successfully saved!", 
            "SAVED!", JOptionPane.INFORMATION_MESSAGE);
        }//try 
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was a problem saving your"
            + "team!\nPlease contact the developer.", "TEAM WAS NOT SAVED!", 
            JOptionPane.ERROR_MESSAGE);
        }//end try-catch 
    }//runTeamInsertQuery
    
    /*
    getTop1StringRecord Accessor Method:
    * Used to access a single string value from the database.
    * Primarily used to get the most recent AutoNumber assigned with the 
      creation of a new Team record.
    - Receives the field, table, where and order statements of the field
      required to be returned.
    - Runs a query in the database based on the parameters.
    - Gets the cell when the value has been found.
    - A statement is printed to indicate if the value was successfully accessed.
    */
    public String getTop1StringRecord (String field, String table, String where, String order){
        String result = new String ();
        
        try {
            Statement s = connection.createStatement();
            String qry = "SELECT TOP 1 [" + field + "] FROM " + table + 
                    " WHERE " + where + "ORDER BY [" + field + "] " + order;
            ResultSet rs = s.executeQuery(qry);
            while (rs.next()){
                result = rs.getString(field);
                System.out.print(result);
            }//end while loop
            rs.close();
            s.close();
            System.out.println (field + " was successfully accessed by the database!");    
        }//try 
        catch (Exception e){
            e.printStackTrace();
            System.out.println (field + " was NOT accessed by the database!");
        }//end try-catch 
        return result;
    }//getTop1StringRecord 
    
    /*
    addOpponentsToDatabase Mutator Method:
    * Adds the Points acquired by the 5 opposition teams to the Opponents Table
      in the Database.
    - Receives a Rank Object.
    - Creates a string with the values that will be transfered to the database.
    - Creates the query to write to the database.
    - Indicates if the transfer was successful or not.
    */
    public void addOpponentsToDatabase (Rank tournament){
        String values = "'" + tournament.getTournamentID() + "', " 
                                    + tournament.getTeamPoints(1) + ", " 
                                    + tournament.getTeamPoints(2) + ", " 
                                    + tournament.getTeamPoints(3) + ", " 
                                    + tournament.getTeamPoints(4) + ", " 
                                    + tournament.getTeamPoints(5);
        
        int appended; //number of rows appended.
        try {
            Statement s = connection.createStatement();
            String qry = "INSERT INTO Opponents ([Tournament ID], "
                    + "[Team1 Points], [Team2 Points], [Team3 Points], "
                    + "[Team4 Points], [Team5 Points]) VALUES (" + values + ");";
            
            appended = s.executeUpdate(qry);
            System.out.print(appended);
            s.close();
            JOptionPane.showMessageDialog(null, "Opponents have been saved!", 
            "SAVED!", JOptionPane.INFORMATION_MESSAGE);     
        }//try
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was a problem saving the"
            + "opponents!\nPlease contact the developer.", "OPPONENTS WERE NOT SAVED!", 
            JOptionPane.ERROR_MESSAGE);
        }//end try-catch 
    }//addOpponentsToDatabase
    
    /*
    addTeamResultsToDatabase Mutator Method:
    * Adds the User Team's results to the Leaderboard Table of the Database.
    - Receives a Rank Object.
    - Creates a string with the values that will be transfered to the database.
    - Creates the query to write to the database.
    - Indicates if the transfer was successful or not.
    */
    public void addTeamResultsToDatabase (Rank tournament){
        String values = "'" + tournament.getTournamentID() + "', " 
                            + tournament.getTeamPoints(0) + ", '" 
                            + tournament.getWins() + "', '" 
                            + tournament.getDraws() + "', '" 
                            + tournament.getLosses() + "', '" 
                            + tournament.getGoalsScored();
        
        int appended; //number of rows appended.
        try {
            Statement s = connection.createStatement();
            String qry = "INSERT INTO Leaderboard ([Tournament ID], Points, "
                    + "Wins, Draws, Losses, [Goals Scored]) "
                    + "VALUES (" + values + "');";
            
            appended = s.executeUpdate(qry);
            System.out.print(appended);
            s.close();
            JOptionPane.showMessageDialog(null, "Leaderboard has been saved!", 
            "SAVED!", JOptionPane.INFORMATION_MESSAGE);
        }//try
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was a problem saving the"
            + "tournament!\nPlease contact the developer.", "TOURNAMENT WAS NOT SAVED!", 
            JOptionPane.ERROR_MESSAGE);
        }//end try-catch 
    }//addTeamResultsToDatabase
    
}//Database Class

package ramlakhan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PlayersArray {
    
    //Properties of a PlayersArray Object
    private Player playerArray [] = new Player [125]; 
    
    //Additional objects required:
    private Database db = new Database ();
    private Connection connection = db.getConnection();
    
    /*
    PlayersArray Constructor:
    * Creates an array of Player Objects by transferring the Players from the 
      Players Table of the Database.
    - Declares the temporary properties required to be parsed to create a Player.
    - Uses the ResultSet class to get each field from the Players Database Table.
    - Stores all 125 players and places them in order of their Player ID.
    */
    public PlayersArray (){
        String playerID, position, firstName, surname, loq, filePath;
        int overall, offStat, defStat;
        int count = 0;
        
        try {
            Statement s = connection.createStatement();
            String qry = "SELECT * FROM Players ORDER BY [Player ID] ASC";
            ResultSet rs = s.executeQuery(qry);
            while (rs.next() && count < 125){
                playerID = rs.getString("Player ID");
                position = rs.getString("Position");
                firstName = rs.getString("First Name");
                surname = rs.getString("Surname");
                loq = rs.getString("LOQ");
                overall = rs.getInt("Overall");
                offStat = rs.getInt("Off Stat");
                defStat = rs.getInt("Def Stat");
                filePath = rs.getString("Image Location");
                
                playerArray [count] = new Player (playerID, position, firstName, 
                       surname, loq, overall, offStat, defStat, filePath);
                
                count++;
            }//end while loop
            rs.close();
            s.close();
        }//try 
        catch (Exception e){
            e.printStackTrace();
            System.out.println ("Error transferring player data!");
        }//end try-catch
        
    }//PlayersArray Object
    
    /*
    findPlayer Accessor Method:
    * Returns the array index (Integer) of a player based off their Player ID.
    - Receives the Player ID of the player needed to be searched.
    */
    public int findPlayer (String searchID){
        int index = -1;
        
        for (int pos = 0; pos < 125; pos++){
            if (searchID.equals(playerArray [pos].getPlayerID())){
                index = pos;
            }//if then
        }
        return index;
    }//findPlayer
    
    /*
    getPlayer Accessor Method:
    * Returns a Player object based on the index received.
    - Primarily used in conjunction with the findPlayer method.
    */
    public Player getPlayer (int index){
        return playerArray [index];
    }//getPlayer
    
    /*
    formatSelectablePlayer Accessor and Mutator Method:
    * Formats and returns specific values of a Player that will be required for 
      use on the TeamSelection screen (String).
    - Example: "L.Messi (94).//imageResources//player faces//CAM//5//455.png"
    */
    public String formatSelectablePlayer (int index){
        return playerArray [index].getFirstName().charAt(0) + "." 
                + playerArray [index].getSurname() + " (" 
                + playerArray [index].getOverall() + ")" 
                + playerArray [index].getFilePath();
    }//formatSelectablePlayer
    
    /*
    pullPlayerDetails Accessor and Mutator Method:
    * Formats and returns specific details of a Player that will be displayed
      as the text of the JComboBoxes. (String)
    * Method is static as it needs to be accessed by the TeamSelection class 
      independently of having a PlayersArray object.
    - Receives the formatted player details done by the formatSelectablePlayer
      method.
    - Searches for the position of the final bracket and removes player details
      after the last bracket.
    - Example: "L.Messi (94)"
    */
    public static String pullPlayerDetails (String playerDetails){
        String formattedPlayer = new String ();
        int bracketPos = playerDetails.lastIndexOf(")");
        formattedPlayer = playerDetails.substring(0, bracketPos + 1);
        return formattedPlayer;
    }//pullPlayerDetails
    
    /*
    pullPlayerFilePath Accessor and Mutator Method:
    * Formats and returns specific file path of a Player that will be displayed
      as an image in the labels on the TeamSelection screen. (String)
    * Method is static as it needs to be accessed by the TeamSelection class 
      independently of having a PlayersArray object.
    - Receives the formatted player details done by the formatSelectablePlayer
      method.
    - Searches for the position of the final bracket and removes player details
      before the last bracket.
    - Example: ".//imageResources//player faces//CAM//5//455.png"
    */
    public static String pullPlayerFilePath (String playerDetails){
        String formattedPlayer = new String ();
        int bracketPos = playerDetails.lastIndexOf(")");
        formattedPlayer = playerDetails.substring(bracketPos + 1);
        return formattedPlayer;
    }//pullPlayerFilePath
    
    /*
    getPlayerFromFilePath Accessor Method:
    * Returns a Player object based on their File Path. (String)
    * Method is static as it needs to be accessed by the TeamSelection class 
      independently of having a PlayersArray object.
    - Receives the File Path of the Player.
    - Searches the PlayersArray and returns the player with matching File Path.
    */
    public static Player getPlayerFromFilePath (String filepath){
        PlayersArray tempPlayerArr = new PlayersArray ();
        Player result = null;
        
        for (int index = 0; index < 125; index++){
            if (tempPlayerArr.getPlayer(index).getFilePath().equals(filepath)){
                result = tempPlayerArr.getPlayer(index);
            }//if the player has been found
        }//end for loop (search array)
        return result; 
    }//getPlayerFromFilePath
    
}//PlayersArray Class

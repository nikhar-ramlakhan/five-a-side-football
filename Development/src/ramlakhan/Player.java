package ramlakhan;
public class Player {
    
    //Properties of a Player Object
    private String playerID;
    private String position;
    private String firstName;
    private String surname;
    private String loq;
    private int overall;
    private int offStat;
    private int defStat;
    private String filePath;
    
    /*
    Player Constructor:
    * Properties required to create a Player Object.
    */
    public Player (String id, String pos, String fN, String sN, String lvl, int ove, int off, int def, String fP){
        playerID = id;
        position = pos;
        firstName = fN;
        surname = sN;
        loq = lvl;
        overall = ove;
        offStat = off;
        defStat = def;
        filePath = fP;
    }//Player Object
    
    /*
    getPlayerID Accessor Method:
    * Return the Player ID (String) of a Player.
    */
    public String getPlayerID(){
        return playerID;
    }//getPlayerID
    
    /*
    getPosition Accessor Method:
    * Return the Position (String) of a Player.
    */
    public String getPosition(){
        return position;
    }//getPosition 
    
    /*
    getFirstName Accessor Method:
    * Return the First Name (String) of a Player.
    */
    public String getFirstName(){
        return firstName;
    }//getFirstName
    
    /*
    getSurname Accessor Method:
    * Return the Surname (String) of a Player.
    */
    public String getSurname(){
        return surname;
    }//getSurname
    
    /*
    getLOQ Accessor Method:
    * Return the Level of Quality (String) of a Player.
    */
    public String getLOQ(){
        return loq;
    }//getLOQ
    
    /*
    getOverall Accessor Method:
    * Return the Overall (Integer) of a Player.
    */
    public int getOverall(){
        return overall;
    }//getOverall
    
    /*
    getOffStat Accessor Method:
    * Return the Offensive Stat (Integer) of a Player.
    */
    public int getOffStat(){
        return offStat;
    }//getOffStat
    
    /*
    getDefStat Accessor Method:
    * Return the Defensive Stat (Integer) of a Player.
    */
    public int getDefStat(){
        return defStat;
    }//getDefStat
    
    /*
    getFilePath Accessor Method:
    * Return the File Path (String) of a Player.
    */
    public String getFilePath(){
        return filePath;
    }//getFilePath
}//Player Class

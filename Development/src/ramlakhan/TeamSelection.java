package ramlakhan;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TeamSelection extends javax.swing.JFrame {

    //Variables to customize looks:
    private Color comboBoxColour = new Color (246, 26, 156, 10);
    private ImageIcon playerFace;
    private Image scale;
     
    //Properties of the TeamSelection class:
    //These store the possible selectable players for each position.
    private String [] possibleGKs = new String [5];
    private String [] possibleCBs = new String [5];
    private String [] possibleCDMs = new String [5];
    private String [] possibleCAMs = new String [5];
    private String [] possibleSTs = new String [5];
     
    //Team object variables
    private String username = UserDetails.username; //static reference
    private String teamName = UserDetails.teamName; //static reference
    private String tournamentName = UserDetails.tournamentName; //static reference
    private String selectedGK = new String ();
    private String selectedCB = new String ();
    private String selectedCDM = new String ();
    private String selectedCAM = new String ();
    private String selectedST = new String ();
    private String gkID = new String ();
    private String cbID = new String ();
    private String cdmID = new String ();
    private String camID = new String ();
    private String stID = new String ();
    private Player tempPlayer;
    
    /*
    The following has been made static so that the Tournament class can easily
    access the user's team details:
    */
    public static Team selectedUserTeam;
    
    //Validation Variables:
    private boolean gkInput;
    private boolean cbInput;
    private boolean cdmInput;
    private boolean camInput;
    private boolean stInput;
    private boolean allInput;
    private String errorMessage = new String ();
    
    /*
    TeamSelection Construtor:
    * Initializes components.
    - Displays the user's name and team user name.
    - Runs the refreshPlayers method.
    */
    public TeamSelection() {
        initComponents();
        
        lblUsername.setText(username);
        lblTeamName.setText(teamName);
        refreshPlayers();

    }//TeamSelection 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblTeamName = new javax.swing.JLabel();
        jcbGK = new javax.swing.JComboBox<>();
        lblGKplayerFace = new javax.swing.JLabel();
        lblGKoffensiveStat = new javax.swing.JLabel();
        lblGKdefensiveStat = new javax.swing.JLabel();
        jcbCB = new javax.swing.JComboBox<>();
        lblCBplayerFace = new javax.swing.JLabel();
        lblCBoffensiveStat = new javax.swing.JLabel();
        lblCBdefensiveStat = new javax.swing.JLabel();
        jcbCDM = new javax.swing.JComboBox<>();
        lblCDMplayerFace = new javax.swing.JLabel();
        lblCDMoffensiveStat = new javax.swing.JLabel();
        lblCDMdefensiveStat = new javax.swing.JLabel();
        jcbCAM = new javax.swing.JComboBox<>();
        lblCAMplayerFace = new javax.swing.JLabel();
        lblCAMoffensiveStat = new javax.swing.JLabel();
        lblCAMdefensiveStat = new javax.swing.JLabel();
        jcbST = new javax.swing.JComboBox<>();
        lblSTplayerFace = new javax.swing.JLabel();
        lblSToffensiveStat = new javax.swing.JLabel();
        lblSTdefensiveStat = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five a Side Football - Team Selecction");
        setMaximumSize(new java.awt.Dimension(1280, 691));
        setMinimumSize(new java.awt.Dimension(1280, 691));
        setName("Team Selection"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        lblUsername.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(lblUsername);
        lblUsername.setBounds(100, 90, 250, 30);

        lblTeamName.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblTeamName.setForeground(new java.awt.Color(255, 255, 255));
        lblTeamName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(lblTeamName);
        lblTeamName.setBounds(920, 90, 250, 30);

        jcbGK.setBackground(new Color (246, 26, 156, 10));
        jcbGK.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbGK.setMaximumSize(new java.awt.Dimension(190, 30));
        jcbGK.setMinimumSize(new java.awt.Dimension(190, 30));
        jcbGK.setPreferredSize(new java.awt.Dimension(190, 30));
        jcbGK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGKItemStateChanged(evt);
            }
        });
        getContentPane().add(jcbGK);
        jcbGK.setBounds(90, 200, 190, 30);

        lblGKplayerFace.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblGKplayerFace.setForeground(new java.awt.Color(255, 255, 255));
        lblGKplayerFace.setMaximumSize(new java.awt.Dimension(128, 128));
        lblGKplayerFace.setMinimumSize(new java.awt.Dimension(128, 128));
        lblGKplayerFace.setName(""); // NOI18N
        lblGKplayerFace.setPreferredSize(new java.awt.Dimension(128, 128));
        getContentPane().add(lblGKplayerFace);
        lblGKplayerFace.setBounds(120, 300, 128, 128);

        lblGKoffensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblGKoffensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblGKoffensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKoffensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblGKoffensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblGKoffensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblGKoffensiveStat);
        lblGKoffensiveStat.setBounds(190, 480, 48, 40);

        lblGKdefensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblGKdefensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblGKdefensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKdefensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblGKdefensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblGKdefensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblGKdefensiveStat);
        lblGKdefensiveStat.setBounds(190, 500, 48, 40);

        jcbCB.setBackground(new Color (246, 26, 156, 10));
        jcbCB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbCB.setMaximumSize(new java.awt.Dimension(190, 30));
        jcbCB.setMinimumSize(new java.awt.Dimension(190, 30));
        jcbCB.setPreferredSize(new java.awt.Dimension(190, 30));
        jcbCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCBItemStateChanged(evt);
            }
        });
        getContentPane().add(jcbCB);
        jcbCB.setBounds(310, 200, 190, 30);

        lblCBplayerFace.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblCBplayerFace.setForeground(new java.awt.Color(255, 255, 255));
        lblCBplayerFace.setMaximumSize(new java.awt.Dimension(128, 128));
        lblCBplayerFace.setMinimumSize(new java.awt.Dimension(128, 128));
        lblCBplayerFace.setPreferredSize(new java.awt.Dimension(128, 128));
        getContentPane().add(lblCBplayerFace);
        lblCBplayerFace.setBounds(340, 300, 128, 128);

        lblCBoffensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCBoffensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblCBoffensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBoffensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblCBoffensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblCBoffensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblCBoffensiveStat);
        lblCBoffensiveStat.setBounds(420, 480, 48, 32);

        lblCBdefensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCBdefensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblCBdefensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBdefensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblCBdefensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblCBdefensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblCBdefensiveStat);
        lblCBdefensiveStat.setBounds(420, 500, 48, 40);

        jcbCDM.setBackground(new Color (246, 26, 156, 10));
        jcbCDM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbCDM.setMaximumSize(new java.awt.Dimension(190, 30));
        jcbCDM.setMinimumSize(new java.awt.Dimension(190, 30));
        jcbCDM.setPreferredSize(new java.awt.Dimension(190, 30));
        jcbCDM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCDMItemStateChanged(evt);
            }
        });
        getContentPane().add(jcbCDM);
        jcbCDM.setBounds(540, 200, 190, 30);

        lblCDMplayerFace.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblCDMplayerFace.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMplayerFace.setMaximumSize(new java.awt.Dimension(128, 128));
        lblCDMplayerFace.setMinimumSize(new java.awt.Dimension(128, 128));
        lblCDMplayerFace.setPreferredSize(new java.awt.Dimension(128, 128));
        getContentPane().add(lblCDMplayerFace);
        lblCDMplayerFace.setBounds(570, 300, 128, 128);

        lblCDMoffensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCDMoffensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMoffensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMoffensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblCDMoffensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblCDMoffensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblCDMoffensiveStat);
        lblCDMoffensiveStat.setBounds(640, 470, 60, 50);

        lblCDMdefensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCDMdefensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMdefensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMdefensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblCDMdefensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblCDMdefensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblCDMdefensiveStat);
        lblCDMdefensiveStat.setBounds(640, 500, 60, 32);

        jcbCAM.setBackground(new Color (246, 26, 156, 10));
        jcbCAM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbCAM.setMaximumSize(new java.awt.Dimension(190, 30));
        jcbCAM.setMinimumSize(new java.awt.Dimension(190, 30));
        jcbCAM.setPreferredSize(new java.awt.Dimension(190, 30));
        jcbCAM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCAMItemStateChanged(evt);
            }
        });
        getContentPane().add(jcbCAM);
        jcbCAM.setBounds(760, 200, 190, 30);

        lblCAMplayerFace.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblCAMplayerFace.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMplayerFace.setMaximumSize(new java.awt.Dimension(128, 128));
        lblCAMplayerFace.setMinimumSize(new java.awt.Dimension(128, 128));
        lblCAMplayerFace.setPreferredSize(new java.awt.Dimension(128, 128));
        getContentPane().add(lblCAMplayerFace);
        lblCAMplayerFace.setBounds(790, 300, 128, 128);

        lblCAMoffensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCAMoffensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMoffensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMoffensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblCAMoffensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblCAMoffensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblCAMoffensiveStat);
        lblCAMoffensiveStat.setBounds(870, 470, 48, 50);

        lblCAMdefensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCAMdefensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMdefensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMdefensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblCAMdefensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblCAMdefensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblCAMdefensiveStat);
        lblCAMdefensiveStat.setBounds(870, 500, 48, 30);

        jcbST.setBackground(new Color (246, 26, 156, 10));
        jcbST.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbST.setMaximumSize(new java.awt.Dimension(190, 30));
        jcbST.setMinimumSize(new java.awt.Dimension(190, 30));
        jcbST.setPreferredSize(new java.awt.Dimension(190, 30));
        jcbST.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbSTItemStateChanged(evt);
            }
        });
        getContentPane().add(jcbST);
        jcbST.setBounds(980, 200, 190, 30);

        lblSTplayerFace.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblSTplayerFace.setForeground(new java.awt.Color(255, 255, 255));
        lblSTplayerFace.setMaximumSize(new java.awt.Dimension(128, 128));
        lblSTplayerFace.setMinimumSize(new java.awt.Dimension(128, 128));
        lblSTplayerFace.setPreferredSize(new java.awt.Dimension(128, 128));
        getContentPane().add(lblSTplayerFace);
        lblSTplayerFace.setBounds(1020, 300, 128, 128);

        lblSToffensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSToffensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblSToffensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSToffensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblSToffensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblSToffensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblSToffensiveStat);
        lblSToffensiveStat.setBounds(1110, 470, 60, 50);

        lblSTdefensiveStat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSTdefensiveStat.setForeground(new java.awt.Color(255, 255, 255));
        lblSTdefensiveStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSTdefensiveStat.setMaximumSize(new java.awt.Dimension(48, 32));
        lblSTdefensiveStat.setMinimumSize(new java.awt.Dimension(48, 32));
        lblSTdefensiveStat.setPreferredSize(new java.awt.Dimension(48, 32));
        getContentPane().add(lblSTdefensiveStat);
        lblSTdefensiveStat.setBounds(1100, 500, 80, 30);

        btnRefresh.setBackground(new java.awt.Color(0,0,0,0));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh);
        btnRefresh.setBounds(70, 560, 290, 90);

        btnCancel.setBackground(new java.awt.Color(0,0,0,0));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(670, 580, 150, 50);

        btnHelp.setBackground(new java.awt.Color(0,0,0,0));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp);
        btnHelp.setBounds(840, 580, 130, 50);

        btnConfirm.setBackground(new java.awt.Color(0,0,0,0));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(1000, 580, 190, 50);

        lblBackground.setBackground(new java.awt.Color(0,0,0,0));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/4) Team Selection.jpg"))); // NOI18N
        lblBackground.setText("82");
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 672));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 672);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /*
    refreshPlayers Mutator Method:
    * Refreshes the possible player options and displays them.
    - Calls the generateLOQ method from the Teams class.
    - Calls the method getPossiblePlayers from the Teams class and parses the
      position, loq number and boolean indicating the format required.
    - Sets the label associated with the position to the loq generated.
    - Runs the displayTeamChoices method parsing the possible selections.
        > Discussed further in the displayTeamChoices method.
    */
    public void refreshPlayers (){
        int [] loq = Team.generateLOQ();
        
        possibleGKs = Team.getPossiblePlayers("GK", ("" + loq [0]), true);
        lblGKplayerFace.setText("Level " + loq [0]);
        
        possibleCBs = Team.getPossiblePlayers("CB", ("" + loq [1]), true);
        lblCBplayerFace.setText("Level " + loq [1]);
        
        possibleCDMs = Team.getPossiblePlayers("CDM", ("" + loq [2]), true);
        lblCDMplayerFace.setText("Level " + loq [2]);
        
        possibleCAMs = Team.getPossiblePlayers("CAM", ("" + loq [3]), true);
        lblCAMplayerFace.setText("Level " + loq [3]);
        
        possibleSTs = Team.getPossiblePlayers("ST", ("" + loq [4]), true);
        lblSTplayerFace.setText("Level " + loq [4]);
        
        displayTeamChoices (possibleGKs, possibleCBs, possibleCDMs, possibleCAMs, possibleSTs);
    }//refreshPlayers
    
    

    /*
    displayTeamChoices Mutator Method:
    * Displays the possible player selections into the associated combo box.
    - Receives the arrays containing the possible players for each position.
    - Runs the method displayInComboBox parsing the associated combo box
      and possible player array for the position.
    */
    public void displayTeamChoices (String [] possibleGK, String [] possibleCB, 
            String [] possibleCDM, String [] possibleCAM, String [] possibleST){
        displayInComboBox (jcbGK, possibleGK);
        displayInComboBox (jcbCB, possibleCB);
        displayInComboBox (jcbCDM, possibleCDM);
        displayInComboBox (jcbCAM, possibleCAM);
        displayInComboBox (jcbST, possibleST);
    }//displayTeamChoices

    /*
    * Adds the possible players into a specfic combo box.
    - Receives the position combo box and associated possible players array.
    - Adds the first item as a default which is "---SELECT---".
    - Uses a for loop to run through the array and append the combo box items
      with the players from the possible players array.
    */
    public void displayInComboBox (javax.swing.JComboBox jcb, String [] possiblePlayers){
        jcb.addItem("---SELECT---");
        
        for (int run = 0; run < 5; run++){
            jcb.addItem(PlayersArray.pullPlayerDetails(possiblePlayers [run]));
        }//endfor loop  
        
    }//displayInComboBox 
    
    
    /*
    btnRefresh Action Performed Event Method:
    * Disposes the open TeamSelection screen and starts a new one.
    - Used in order to reset the combo boxes and add new selections.
    */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        new TeamSelection ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRefreshActionPerformed

    /*
    btnCancel Action Performed Event Method:
    * Cancels team selections and takes the user back to the home screen.
    */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new Home ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /*
    btnConfirm Action Performed Event Method:
    * Checks that all positions have been selected and proceeds to the Tournament.
    - Performs a presence check validation to ensure that all players have been
      selected. 
    - If input is valid, a team is created and the team data is added to the 
      Teams table in the database. The program then proceeds to the Tournament
      screen.
    - If input is not valid, multiple if statements are used to determine which
      positions have not been entered. An error message box is also displayed
      informing the user of non selected positions.
    */
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        //validate that user has selected 5 playersS
        allInput = checkValidity ();
        errorMessage = "";
        if (allInput == true){
            //proceed to next tournament screen
            selectedUserTeam = new Team (username, teamName, tournamentName, 
                                            gkID, cbID, cdmID, camID, stID);
            selectedUserTeam.addTeamToDatabase();
            this.dispose();
            new Tournament().setVisible(true);
        }//if then
        
        else {
            if (gkInput == false){
                errorMessage += "- GK\n";
            }//if then 
            if (cbInput == false){
                errorMessage += "- CB\n";
            }//if then 
            if (cdmInput == false){
                errorMessage += "- CDM\n";
            }//if then 
            if (camInput == false){
                errorMessage += "- CAM\n";
            }//if then 
            if (stInput == false){
                errorMessage += "- ST\n";
            }//if then 
            
            JOptionPane.showMessageDialog(null, "Please select a player for: \n" 
            + errorMessage, "Missing Selections", JOptionPane.ERROR_MESSAGE);
        }//else 

    }//GEN-LAST:event_btnConfirmActionPerformed

    /*
    checkValidity Mutator Method:
    * Uses all the individual booleans to determine if the overall validation is
      false.
    */
    public boolean checkValidity (){
        boolean valid = true;
        
        if (gkInput == false || cbInput == false || cdmInput == false || camInput == false || stInput == false){
            valid = false;
        }//if one of the fields has not been selected

        return valid;
    }//checkValidity
    
    /*
    btnHelp Action Performed Event Method:
    * Opens the Help screen as a secondary screen.
    */
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        new Help ().setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    /*
    displayPlayer Accessor and Mutator Method:
    * Displays the player face image and their offensive and defensive stats 
      of the selected player and returns a boolean that determines if the player 
      is selected or not.
    * Performs presence validation and also accesses relevant information that
      is required to create the user's Team.
    - Receives the text from the combo box, the array of the possible players,
      a number that indicates the position and the various labels required for
      changing.
    - Checks if the combo box's selection is "---SELECT---" and returns false for
      the input.
    - If the combo box does not read "---SELECT---":
        > A for loop runs to display the selected players face image by using the
          pullPlayerDetails, getPlayerFromFilePath and pullPlayerFilePath methods
          from the PlayersArray class.
        > Displays the player face and offensive and defensive stats.
        > Gets the playerID of the player using the position number that is 
          received.
          0 - GK
          1 - CB
          2 - CDM
          3 - CAM
          4 - ST
        > Uses a switch with position number and sets the correct position
          ID string with the correct player ID. The switch doesn't require a 
          default as all possible cases are defines.
    */
    public boolean displayPlayer (String selected, String [] possiblePlayers, 
    int positionNumber, javax.swing.JLabel lblImage, javax.swing.JLabel lblOff, 
    javax.swing.JLabel lblDef){
        boolean input = true;
        Player selectedPlayer = null;
        
        if (selected.equals("---SELECT---")){
            lblImage.setIcon(null);
            input = false;
        }//if then
        else {
            for (int run = 0; run < 5; run++){
                if (selected.equals(PlayersArray.pullPlayerDetails
                    (possiblePlayers [run]))){
                    
                    selectedPlayer = PlayersArray.getPlayerFromFilePath(
                    PlayersArray.pullPlayerFilePath(possiblePlayers [run]));
                    
                    playerFace = new ImageIcon (selectedPlayer.getFilePath());
                    
                    scale = playerFace.getImage().getScaledInstance(128, 128, 
                                                        Image.SCALE_DEFAULT);
                    
                    playerFace = new ImageIcon (scale);
                    lblImage.setIcon(playerFace);
                    lblOff.setText("" + selectedPlayer.getOffStat());
                    lblDef.setText("" + selectedPlayer.getDefStat());
                    
                    switch (positionNumber){
                        case 0:
                            gkID = selectedPlayer.getPlayerID();
                        break;
                        
                        case 1:
                            cbID = selectedPlayer.getPlayerID();
                        break;
                        
                        case 2:
                            cdmID = selectedPlayer.getPlayerID();
                        break;
                        
                        case 3:
                            camID = selectedPlayer.getPlayerID();
                        break;
                        
                        case 4:
                            stID = selectedPlayer.getPlayerID();
                        break;    
                    }//end switch 
                }//if then
            }//end for loop
        }//else
        return input;
    }//displayPlayer
    
    /*
    jcbGK Item State Changed Event Method:
    * Displays the goalkeeper's player face and stats when combo box item has been 
      changed.
    - Gets the selected text.
    - Calls the displayPlayer method and parses the selected text, the possible
      Striker selections, the number indicating the position and the player face,
      offensive stat and defensive stat labels.
    */
    private void jcbGKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGKItemStateChanged
        selectedGK = jcbGK.getSelectedItem().toString();
        gkInput = displayPlayer (selectedGK, possibleGKs, 0, lblGKplayerFace, 
                                    lblGKoffensiveStat, lblGKdefensiveStat );
    }//GEN-LAST:event_jcbGKItemStateChanged

    /*
    jcB Item State Changed Event Method:
    * Displays the centre back's player face and stats when combo box item has been 
      changed.
    - Gets the selected text.
    - Calls the displayPlayer method and parses the selected text, the possible
      Striker selections, the number indicating the position and the player face,
      offensive stat and defensive stat labels.
    */
    private void jcbCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCBItemStateChanged
        selectedCB = jcbCB.getSelectedItem().toString();
        cbInput = displayPlayer (selectedCB, possibleCBs, 1, lblCBplayerFace, 
                                    lblCBoffensiveStat, lblCBdefensiveStat );
    }//GEN-LAST:event_jcbCBItemStateChanged

    /*
    jcbCDM Item State Changed Event Method:
    * Displays the central defensive midfielder's player face and stats when 
      combo box item has been changed.
    - Gets the selected text.
    - Calls the displayPlayer method and parses the selected text, the possible
      Striker selections, the number indicating the position and the player face,
      offensive stat and defensive stat labels.
    */
    private void jcbCDMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCDMItemStateChanged
        selectedCDM = jcbCDM.getSelectedItem().toString();
        cdmInput = displayPlayer (selectedCDM, possibleCDMs, 2, lblCDMplayerFace, 
                                    lblCDMoffensiveStat, lblCDMdefensiveStat );
    }//GEN-LAST:event_jcbCDMItemStateChanged

    /*
    jcbCAM Item State Changed Event Method:
    * Displays the central attacking midfielder's player face and stats when 
      combo box item has been changed.
    - Gets the selected text.
    - Calls the displayPlayer method and parses the selected text, the possible
      Striker selections, the number indicating the position and the player face,
      offensive stat and defensive stat labels.
    */
    private void jcbCAMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCAMItemStateChanged
        selectedCAM = jcbCAM.getSelectedItem().toString();
        camInput = displayPlayer (selectedCAM, possibleCAMs, 3, lblCAMplayerFace, 
                                    lblCAMoffensiveStat, lblCAMdefensiveStat );
    }//GEN-LAST:event_jcbCAMItemStateChanged

    /*
    jcbST Item State Changed Event Method:
    * Displays the striker's player face and stats when combo box item has been 
      changed.
    - Gets the selected text.
    - Calls the displayPlayer method and parses the selected text, the possible
      Striker selections, the number indicating the position and the player face,
      offensive stat and defensive stat labels.
    */
    private void jcbSTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbSTItemStateChanged
        selectedST = jcbST.getSelectedItem().toString();
        stInput = displayPlayer (selectedST, possibleSTs, 4, lblSTplayerFace, 
                                    lblSToffensiveStat, lblSTdefensiveStat );
    }//GEN-LAST:event_jcbSTItemStateChanged
    
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> jcbCAM;
    private javax.swing.JComboBox<String> jcbCB;
    private javax.swing.JComboBox<String> jcbCDM;
    private javax.swing.JComboBox<String> jcbGK;
    private javax.swing.JComboBox<String> jcbST;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCAMdefensiveStat;
    private javax.swing.JLabel lblCAMoffensiveStat;
    private javax.swing.JLabel lblCAMplayerFace;
    private javax.swing.JLabel lblCBdefensiveStat;
    private javax.swing.JLabel lblCBoffensiveStat;
    private javax.swing.JLabel lblCBplayerFace;
    private javax.swing.JLabel lblCDMdefensiveStat;
    private javax.swing.JLabel lblCDMoffensiveStat;
    private javax.swing.JLabel lblCDMplayerFace;
    private javax.swing.JLabel lblGKdefensiveStat;
    private javax.swing.JLabel lblGKoffensiveStat;
    private javax.swing.JLabel lblGKplayerFace;
    private javax.swing.JLabel lblSTdefensiveStat;
    private javax.swing.JLabel lblSToffensiveStat;
    private javax.swing.JLabel lblSTplayerFace;
    private javax.swing.JLabel lblTeamName;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}

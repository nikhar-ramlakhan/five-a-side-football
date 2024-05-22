package ramlakhan;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tournament extends javax.swing.JFrame {
    
    //Properties of the Tournament class:
    private Team userTeam = TeamSelection.selectedUserTeam; //static access
    private Team aiTeam1 = new Team (userTeam.getTournamentID(), "AI Team 1");
    private Team aiTeam2 = new Team (userTeam.getTournamentID(), "AI Team 2");
    private Team aiTeam3 = new Team (userTeam.getTournamentID(), "AI Team 3");
    private Team aiTeam4 = new Team (userTeam.getTournamentID(), "AI Team 4");
    private Team aiTeam5 = new Team (userTeam.getTournamentID(), "AI Team 5");
    private League tournament = new League (userTeam, aiTeam1, aiTeam2, aiTeam3, aiTeam4, aiTeam5);
    private int matchweek = 1;
    private String rankTable [] = tournament.getRankTable();
    private String result;
    private League.Mentality mentality;
    private League.InPossession inPossession;
    private League.OutOfPossession outPossession;
    private ImageIcon playerFace;
    private Image scale;
    

    //A Rank object is made static to be easily accessed by the Results screen:
    public static Rank tournamentRank;

    /*
    Tournament Constructor:
    * Initializes the various components and displays the user's team and the 
      first opponent team.
    - Two Message Boxes are displayed prompting the user of what to do.
    */
    public Tournament() {
        initComponents();
        lblTournamentName.setText(userTeam.getTournamentName());
        
        btnPlayMatch.setVisible(false);
        displayTeam (userTeam, true);
        JOptionPane.showMessageDialog(null, "You are about to play against other "
        + "teams in your tournament! \n\nPoints are acquired as follows: \n +1000 "
        + "points for a WIN \n +500 points for a DRAW \n +200 points for a LOSS \n "
        + "+100 per GOAL SCORED \n\nYou will play against 5 other teams in "
        + "simulation.", "WELCOME TO THE TOURNAMENT!", JOptionPane.INFORMATION_MESSAGE);
        
        displayTeam (aiTeam1, false);
        displayRankTable (rankTable);
        JOptionPane.showMessageDialog (null, "Before each game, you will be required "
        + "to select a tactic.\nMake sure you scout your opponent find their "
        + "strengths and \nweaknesses before selecting your tactics. \n\nPress the"
        + " 'Set Tactics' button located at the bottom of the screen. \nThe tactics "
        + "you choose will influence game outcomes. \n\nGood Luck Gaffer!", 
        "SETTING TACTICS", JOptionPane.INFORMATION_MESSAGE);

    }//Tournament

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTournamentName = new javax.swing.JLabel();
        lblUSERteamName = new javax.swing.JLabel();
        pnlUserST = new javax.swing.JPanel();
        lblSTnameUSER = new javax.swing.JLabel();
        lblSToverallUSER = new javax.swing.JLabel();
        lblSTstatsUSER = new javax.swing.JLabel();
        lblUserFaceST = new javax.swing.JLabel();
        pnlUserCAM = new javax.swing.JPanel();
        lblCAMnameUSER = new javax.swing.JLabel();
        lblCAMoverallUSER = new javax.swing.JLabel();
        lblCAMstatsUSER = new javax.swing.JLabel();
        lblUserFaceCAM = new javax.swing.JLabel();
        pnlUserCDM = new javax.swing.JPanel();
        lblCDMnameUSER = new javax.swing.JLabel();
        lblCDMoverallUSER = new javax.swing.JLabel();
        lblCDMstatsUSER = new javax.swing.JLabel();
        lblUserFaceCDM = new javax.swing.JLabel();
        pnlUserCB = new javax.swing.JPanel();
        lblCBnameUSER = new javax.swing.JLabel();
        lblCBoverallUSER = new javax.swing.JLabel();
        lblCBstatsUSER = new javax.swing.JLabel();
        lblUserFaceCB = new javax.swing.JLabel();
        pnlUserGK = new javax.swing.JPanel();
        lblGKnameUSER = new javax.swing.JLabel();
        lblGKoverallUSER = new javax.swing.JLabel();
        lblGKstatsUSER = new javax.swing.JLabel();
        lblUserFaceGK = new javax.swing.JLabel();
        lblAIteamName = new javax.swing.JLabel();
        pnlAIST = new javax.swing.JPanel();
        lblSTnameAI = new javax.swing.JLabel();
        lblSToverallAI = new javax.swing.JLabel();
        lblSTstatsAI = new javax.swing.JLabel();
        lblAIFaceST = new javax.swing.JLabel();
        pnlAICAM = new javax.swing.JPanel();
        lblCAMnameAI = new javax.swing.JLabel();
        lblCAMoverallAI = new javax.swing.JLabel();
        lblCAMstatsAI = new javax.swing.JLabel();
        lblAIFaceCAM = new javax.swing.JLabel();
        pnlAICDM = new javax.swing.JPanel();
        lblCDMnameAI = new javax.swing.JLabel();
        lblCDMoverallAI = new javax.swing.JLabel();
        lblCDMstatsAI = new javax.swing.JLabel();
        lblAIFaceCDM = new javax.swing.JLabel();
        pnlAICB = new javax.swing.JPanel();
        lblCBnameAI = new javax.swing.JLabel();
        lblCBoverallAI = new javax.swing.JLabel();
        lblCBstatsAI = new javax.swing.JLabel();
        lblAIFaceCB = new javax.swing.JLabel();
        pnlAIGK = new javax.swing.JPanel();
        lblGKnameAI = new javax.swing.JLabel();
        lblGKoverallAI = new javax.swing.JLabel();
        lblGKstatsAI = new javax.swing.JLabel();
        lblAIFaceGK = new javax.swing.JLabel();
        pnlTournamentRanks = new javax.swing.JPanel();
        lblRank1Team = new javax.swing.JLabel();
        lblRank2Team = new javax.swing.JLabel();
        lblRank3Team = new javax.swing.JLabel();
        lblRank4Team = new javax.swing.JLabel();
        lblRank5Team = new javax.swing.JLabel();
        lblRank6Team = new javax.swing.JLabel();
        pnlResults = new javax.swing.JPanel();
        lblResult1 = new javax.swing.JLabel();
        lblResult2 = new javax.swing.JLabel();
        lblResult3 = new javax.swing.JLabel();
        lblResult4 = new javax.swing.JLabel();
        lblResult5 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        btnSetTactics = new javax.swing.JButton();
        btnPlayMatch = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five a Side Football - Tournament");
        setMaximumSize(new java.awt.Dimension(1280, 691));
        setMinimumSize(new java.awt.Dimension(1280, 691));
        setName("Tournament"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTournamentName.setFont(new java.awt.Font("Century Gothic", 1, 42)); // NOI18N
        lblTournamentName.setForeground(new java.awt.Color(255, 255, 255));
        lblTournamentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTournamentName.setText("Tournament Name");
        getContentPane().add(lblTournamentName);
        lblTournamentName.setBounds(400, 0, 480, 60);

        lblUSERteamName.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        lblUSERteamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUSERteamName.setText("Team Name");
        getContentPane().add(lblUSERteamName);
        lblUSERteamName.setBounds(40, 30, 350, 30);

        pnlUserST.setBackground(new java.awt.Color(0,0,0,180));
        pnlUserST.setForeground(new java.awt.Color(255, 255, 255));
        pnlUserST.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlUserST.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlUserST.setLayout(null);

        lblSTnameUSER.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSTnameUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblSTnameUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSTnameUSER.setText("ST - ");
        lblSTnameUSER.setMaximumSize(new java.awt.Dimension(28, 18));
        lblSTnameUSER.setMinimumSize(new java.awt.Dimension(28, 18));
        lblSTnameUSER.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlUserST.add(lblSTnameUSER);
        lblSTnameUSER.setBounds(0, 0, 240, 30);

        lblSToverallUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblSToverallUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblSToverallUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSToverallUSER.setText("Overall: ");
        pnlUserST.add(lblSToverallUSER);
        lblSToverallUSER.setBounds(0, 30, 240, 30);

        lblSTstatsUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblSTstatsUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblSTstatsUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSTstatsUSER.setText("Offensive:  | Defensive:  ");
        pnlUserST.add(lblSTstatsUSER);
        lblSTstatsUSER.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlUserST);
        pnlUserST.setBounds(190, 90, 240, 80);

        lblUserFaceST.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUserFaceST.setMaximumSize(new java.awt.Dimension(80, 80));
        lblUserFaceST.setMinimumSize(new java.awt.Dimension(80, 80));
        lblUserFaceST.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblUserFaceST);
        lblUserFaceST.setBounds(80, 90, 80, 80);

        pnlUserCAM.setBackground(new java.awt.Color(0,0,0,180));
        pnlUserCAM.setForeground(new java.awt.Color(255, 255, 255));
        pnlUserCAM.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlUserCAM.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlUserCAM.setLayout(null);

        lblCAMnameUSER.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCAMnameUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMnameUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMnameUSER.setText("CAM -");
        lblCAMnameUSER.setMaximumSize(new java.awt.Dimension(28, 18));
        lblCAMnameUSER.setMinimumSize(new java.awt.Dimension(28, 18));
        lblCAMnameUSER.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlUserCAM.add(lblCAMnameUSER);
        lblCAMnameUSER.setBounds(0, 0, 240, 30);

        lblCAMoverallUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCAMoverallUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMoverallUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMoverallUSER.setText("Overall: ");
        pnlUserCAM.add(lblCAMoverallUSER);
        lblCAMoverallUSER.setBounds(0, 30, 240, 30);

        lblCAMstatsUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCAMstatsUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMstatsUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMstatsUSER.setText("Offensive:  | Defensive:  ");
        pnlUserCAM.add(lblCAMstatsUSER);
        lblCAMstatsUSER.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlUserCAM);
        pnlUserCAM.setBounds(190, 200, 240, 80);

        lblUserFaceCAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUserFaceCAM.setMaximumSize(new java.awt.Dimension(80, 80));
        lblUserFaceCAM.setMinimumSize(new java.awt.Dimension(80, 80));
        lblUserFaceCAM.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblUserFaceCAM);
        lblUserFaceCAM.setBounds(80, 200, 80, 80);

        pnlUserCDM.setBackground(new java.awt.Color(0,0,0,180));
        pnlUserCDM.setForeground(new java.awt.Color(255, 255, 255));
        pnlUserCDM.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlUserCDM.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlUserCDM.setLayout(null);

        lblCDMnameUSER.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCDMnameUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMnameUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMnameUSER.setText("CDM -");
        lblCDMnameUSER.setMaximumSize(new java.awt.Dimension(28, 18));
        lblCDMnameUSER.setMinimumSize(new java.awt.Dimension(28, 18));
        lblCDMnameUSER.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlUserCDM.add(lblCDMnameUSER);
        lblCDMnameUSER.setBounds(0, 0, 240, 30);

        lblCDMoverallUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCDMoverallUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMoverallUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMoverallUSER.setText("Overall: ");
        pnlUserCDM.add(lblCDMoverallUSER);
        lblCDMoverallUSER.setBounds(0, 30, 240, 30);

        lblCDMstatsUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCDMstatsUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMstatsUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMstatsUSER.setText("Offensive:  | Defensive:  ");
        pnlUserCDM.add(lblCDMstatsUSER);
        lblCDMstatsUSER.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlUserCDM);
        pnlUserCDM.setBounds(190, 310, 240, 80);

        lblUserFaceCDM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUserFaceCDM.setMaximumSize(new java.awt.Dimension(80, 80));
        lblUserFaceCDM.setMinimumSize(new java.awt.Dimension(80, 80));
        lblUserFaceCDM.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblUserFaceCDM);
        lblUserFaceCDM.setBounds(80, 310, 80, 80);

        pnlUserCB.setBackground(new java.awt.Color(0,0,0,180));
        pnlUserCB.setForeground(new java.awt.Color(255, 255, 255));
        pnlUserCB.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlUserCB.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlUserCB.setLayout(null);

        lblCBnameUSER.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCBnameUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCBnameUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBnameUSER.setText("CB -");
        lblCBnameUSER.setMaximumSize(new java.awt.Dimension(28, 18));
        lblCBnameUSER.setMinimumSize(new java.awt.Dimension(28, 18));
        lblCBnameUSER.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlUserCB.add(lblCBnameUSER);
        lblCBnameUSER.setBounds(0, 0, 240, 30);

        lblCBoverallUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCBoverallUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCBoverallUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBoverallUSER.setText("Overall: ");
        pnlUserCB.add(lblCBoverallUSER);
        lblCBoverallUSER.setBounds(0, 30, 240, 30);

        lblCBstatsUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCBstatsUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblCBstatsUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBstatsUSER.setText("Offensive:  | Defensive:  ");
        pnlUserCB.add(lblCBstatsUSER);
        lblCBstatsUSER.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlUserCB);
        pnlUserCB.setBounds(190, 420, 240, 80);

        lblUserFaceCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUserFaceCB.setMaximumSize(new java.awt.Dimension(80, 80));
        lblUserFaceCB.setMinimumSize(new java.awt.Dimension(80, 80));
        lblUserFaceCB.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblUserFaceCB);
        lblUserFaceCB.setBounds(80, 420, 80, 80);

        pnlUserGK.setBackground(new java.awt.Color(0,0,0,180));
        pnlUserGK.setForeground(new java.awt.Color(255, 255, 255));
        pnlUserGK.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlUserGK.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlUserGK.setLayout(null);

        lblGKnameUSER.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblGKnameUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblGKnameUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKnameUSER.setText("GK -");
        lblGKnameUSER.setMaximumSize(new java.awt.Dimension(28, 18));
        lblGKnameUSER.setMinimumSize(new java.awt.Dimension(28, 18));
        lblGKnameUSER.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlUserGK.add(lblGKnameUSER);
        lblGKnameUSER.setBounds(0, 0, 240, 30);

        lblGKoverallUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblGKoverallUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblGKoverallUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKoverallUSER.setText("Overall: ");
        pnlUserGK.add(lblGKoverallUSER);
        lblGKoverallUSER.setBounds(0, 30, 240, 30);

        lblGKstatsUSER.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblGKstatsUSER.setForeground(new java.awt.Color(255, 255, 255));
        lblGKstatsUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKstatsUSER.setText("Offensive:  | Defensive:  ");
        pnlUserGK.add(lblGKstatsUSER);
        lblGKstatsUSER.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlUserGK);
        pnlUserGK.setBounds(190, 530, 240, 80);

        lblUserFaceGK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUserFaceGK.setMaximumSize(new java.awt.Dimension(80, 80));
        lblUserFaceGK.setMinimumSize(new java.awt.Dimension(80, 80));
        lblUserFaceGK.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblUserFaceGK);
        lblUserFaceGK.setBounds(80, 530, 80, 80);

        lblAIteamName.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        lblAIteamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAIteamName.setText("AI Team");
        getContentPane().add(lblAIteamName);
        lblAIteamName.setBounds(890, 30, 350, 30);

        pnlAIST.setBackground(new java.awt.Color(0,0,0,180));
        pnlAIST.setForeground(new java.awt.Color(255, 255, 255));
        pnlAIST.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlAIST.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlAIST.setLayout(null);

        lblSTnameAI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSTnameAI.setForeground(new java.awt.Color(255, 255, 255));
        lblSTnameAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSTnameAI.setText("ST - ");
        lblSTnameAI.setMaximumSize(new java.awt.Dimension(28, 18));
        lblSTnameAI.setMinimumSize(new java.awt.Dimension(28, 18));
        lblSTnameAI.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlAIST.add(lblSTnameAI);
        lblSTnameAI.setBounds(0, 0, 240, 30);

        lblSToverallAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblSToverallAI.setForeground(new java.awt.Color(255, 255, 255));
        lblSToverallAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSToverallAI.setText("Overall: ");
        pnlAIST.add(lblSToverallAI);
        lblSToverallAI.setBounds(0, 30, 240, 30);

        lblSTstatsAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblSTstatsAI.setForeground(new java.awt.Color(255, 255, 255));
        lblSTstatsAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSTstatsAI.setText("Offensive:  | Defensive:  ");
        pnlAIST.add(lblSTstatsAI);
        lblSTstatsAI.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlAIST);
        pnlAIST.setBounds(860, 90, 240, 80);

        lblAIFaceST.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAIFaceST.setMaximumSize(new java.awt.Dimension(80, 80));
        lblAIFaceST.setMinimumSize(new java.awt.Dimension(80, 80));
        lblAIFaceST.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblAIFaceST);
        lblAIFaceST.setBounds(1130, 90, 80, 80);

        pnlAICAM.setBackground(new java.awt.Color(0,0,0,180));
        pnlAICAM.setForeground(new java.awt.Color(255, 255, 255));
        pnlAICAM.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlAICAM.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlAICAM.setLayout(null);

        lblCAMnameAI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCAMnameAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMnameAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMnameAI.setText("CAM -");
        lblCAMnameAI.setMaximumSize(new java.awt.Dimension(28, 18));
        lblCAMnameAI.setMinimumSize(new java.awt.Dimension(28, 18));
        lblCAMnameAI.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlAICAM.add(lblCAMnameAI);
        lblCAMnameAI.setBounds(0, 0, 240, 30);

        lblCAMoverallAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCAMoverallAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMoverallAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMoverallAI.setText("Overall: ");
        pnlAICAM.add(lblCAMoverallAI);
        lblCAMoverallAI.setBounds(0, 30, 240, 30);

        lblCAMstatsAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCAMstatsAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCAMstatsAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCAMstatsAI.setText("Offensive:  | Defensive:  ");
        pnlAICAM.add(lblCAMstatsAI);
        lblCAMstatsAI.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlAICAM);
        pnlAICAM.setBounds(860, 200, 240, 80);

        lblAIFaceCAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAIFaceCAM.setMaximumSize(new java.awt.Dimension(80, 80));
        lblAIFaceCAM.setMinimumSize(new java.awt.Dimension(80, 80));
        lblAIFaceCAM.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblAIFaceCAM);
        lblAIFaceCAM.setBounds(1130, 200, 80, 80);

        pnlAICDM.setBackground(new java.awt.Color(0,0,0,180));
        pnlAICDM.setForeground(new java.awt.Color(255, 255, 255));
        pnlAICDM.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlAICDM.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlAICDM.setLayout(null);

        lblCDMnameAI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCDMnameAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMnameAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMnameAI.setText("CDM -");
        lblCDMnameAI.setMaximumSize(new java.awt.Dimension(28, 18));
        lblCDMnameAI.setMinimumSize(new java.awt.Dimension(28, 18));
        lblCDMnameAI.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlAICDM.add(lblCDMnameAI);
        lblCDMnameAI.setBounds(0, 0, 240, 30);

        lblCDMoverallAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCDMoverallAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMoverallAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMoverallAI.setText("Overall: ");
        pnlAICDM.add(lblCDMoverallAI);
        lblCDMoverallAI.setBounds(0, 30, 240, 30);

        lblCDMstatsAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCDMstatsAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCDMstatsAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDMstatsAI.setText("Offensive:  | Defensive:  ");
        pnlAICDM.add(lblCDMstatsAI);
        lblCDMstatsAI.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlAICDM);
        pnlAICDM.setBounds(860, 310, 240, 80);

        lblAIFaceCDM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAIFaceCDM.setMaximumSize(new java.awt.Dimension(80, 80));
        lblAIFaceCDM.setMinimumSize(new java.awt.Dimension(80, 80));
        lblAIFaceCDM.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblAIFaceCDM);
        lblAIFaceCDM.setBounds(1130, 310, 80, 80);

        pnlAICB.setBackground(new java.awt.Color(0,0,0,180));
        pnlAICB.setForeground(new java.awt.Color(255, 255, 255));
        pnlAICB.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlAICB.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlAICB.setLayout(null);

        lblCBnameAI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCBnameAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCBnameAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBnameAI.setText("CB -");
        lblCBnameAI.setMaximumSize(new java.awt.Dimension(28, 18));
        lblCBnameAI.setMinimumSize(new java.awt.Dimension(28, 18));
        lblCBnameAI.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlAICB.add(lblCBnameAI);
        lblCBnameAI.setBounds(0, 0, 240, 30);

        lblCBoverallAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCBoverallAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCBoverallAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBoverallAI.setText("Overall: ");
        pnlAICB.add(lblCBoverallAI);
        lblCBoverallAI.setBounds(0, 30, 240, 30);

        lblCBstatsAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCBstatsAI.setForeground(new java.awt.Color(255, 255, 255));
        lblCBstatsAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCBstatsAI.setText("Offensive:  | Defensive:  ");
        pnlAICB.add(lblCBstatsAI);
        lblCBstatsAI.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlAICB);
        pnlAICB.setBounds(860, 420, 240, 80);

        lblAIFaceCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAIFaceCB.setMaximumSize(new java.awt.Dimension(80, 80));
        lblAIFaceCB.setMinimumSize(new java.awt.Dimension(80, 80));
        lblAIFaceCB.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblAIFaceCB);
        lblAIFaceCB.setBounds(1130, 420, 80, 80);

        pnlAIGK.setBackground(new java.awt.Color(0,0,0,180));
        pnlAIGK.setForeground(new java.awt.Color(255, 255, 255));
        pnlAIGK.setMaximumSize(new java.awt.Dimension(240, 80));
        pnlAIGK.setMinimumSize(new java.awt.Dimension(240, 80));
        pnlAIGK.setLayout(null);

        lblGKnameAI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblGKnameAI.setForeground(new java.awt.Color(255, 255, 255));
        lblGKnameAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKnameAI.setText("GK -");
        lblGKnameAI.setMaximumSize(new java.awt.Dimension(28, 18));
        lblGKnameAI.setMinimumSize(new java.awt.Dimension(28, 18));
        lblGKnameAI.setPreferredSize(new java.awt.Dimension(28, 18));
        pnlAIGK.add(lblGKnameAI);
        lblGKnameAI.setBounds(0, 0, 240, 30);

        lblGKoverallAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblGKoverallAI.setForeground(new java.awt.Color(255, 255, 255));
        lblGKoverallAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKoverallAI.setText("Overall: ");
        pnlAIGK.add(lblGKoverallAI);
        lblGKoverallAI.setBounds(0, 30, 240, 30);

        lblGKstatsAI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblGKstatsAI.setForeground(new java.awt.Color(255, 255, 255));
        lblGKstatsAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGKstatsAI.setText("Offensive:  | Defensive:  ");
        pnlAIGK.add(lblGKstatsAI);
        lblGKstatsAI.setBounds(0, 60, 240, 20);

        getContentPane().add(pnlAIGK);
        pnlAIGK.setBounds(860, 530, 240, 80);

        lblAIFaceGK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAIFaceGK.setMaximumSize(new java.awt.Dimension(80, 80));
        lblAIFaceGK.setMinimumSize(new java.awt.Dimension(80, 80));
        lblAIFaceGK.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(lblAIFaceGK);
        lblAIFaceGK.setBounds(1130, 530, 80, 80);

        pnlTournamentRanks.setBackground(new java.awt.Color(0,0,0,0));
        pnlTournamentRanks.setLayout(new java.awt.GridBagLayout());

        lblRank1Team.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblRank1Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRank1Team.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlTournamentRanks.add(lblRank1Team, gridBagConstraints);

        lblRank2Team.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblRank2Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlTournamentRanks.add(lblRank2Team, gridBagConstraints);

        lblRank3Team.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblRank3Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlTournamentRanks.add(lblRank3Team, gridBagConstraints);

        lblRank4Team.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblRank4Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlTournamentRanks.add(lblRank4Team, gridBagConstraints);

        lblRank5Team.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblRank5Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlTournamentRanks.add(lblRank5Team, gridBagConstraints);

        lblRank6Team.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblRank6Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlTournamentRanks.add(lblRank6Team, gridBagConstraints);

        getContentPane().add(pnlTournamentRanks);
        pnlTournamentRanks.setBounds(470, 130, 340, 160);

        pnlResults.setBackground(new java.awt.Color(0,0,0,0));
        pnlResults.setLayout(new java.awt.GridBagLayout());

        lblResult1.setFont(new java.awt.Font("Consolas", 0, 17)); // NOI18N
        lblResult1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlResults.add(lblResult1, new java.awt.GridBagConstraints());

        lblResult2.setFont(new java.awt.Font("Consolas", 0, 17)); // NOI18N
        lblResult2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlResults.add(lblResult2, gridBagConstraints);

        lblResult3.setFont(new java.awt.Font("Consolas", 0, 17)); // NOI18N
        lblResult3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pnlResults.add(lblResult3, gridBagConstraints);

        lblResult4.setFont(new java.awt.Font("Consolas", 0, 17)); // NOI18N
        lblResult4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        pnlResults.add(lblResult4, gridBagConstraints);

        lblResult5.setFont(new java.awt.Font("Consolas", 0, 17)); // NOI18N
        lblResult5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        pnlResults.add(lblResult5, gridBagConstraints);

        getContentPane().add(pnlResults);
        pnlResults.setBounds(470, 370, 340, 150);

        btnHelp.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp);
        btnHelp.setBounds(580, 640, 140, 30);

        btnSetTactics.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnSetTactics.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        btnSetTactics.setForeground(new java.awt.Color(255, 255, 255));
        btnSetTactics.setText("Set Tactics");
        btnSetTactics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetTacticsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSetTactics);
        btnSetTactics.setBounds(500, 580, 300, 49);

        btnPlayMatch.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnPlayMatch.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        btnPlayMatch.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayMatch.setText("Play Match");
        btnPlayMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayMatchActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayMatch);
        btnPlayMatch.setBounds(500, 580, 300, 49);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/5) Tournament.jpg"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 672));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 672);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    displayTeam Mutator Method:
    * Displays a team in the Tournament
    - Receives the team to display and a boolean that indicates if it is a 
      user team or opponent team to be updated.
        > This ensures that the correct components are updated.
    - Displays the name of the team.
    - Runs the displayPlayer method for each position and parses the the player
      object and the 4 associated labels that will be updated.
        > Face Image label
        > Name label
        > Overall label
        > Stats label
    */
    public void displayTeam (Team dTeam, boolean user){
        //Updates an Opponent Team:
        if (user == false){
            lblAIteamName.setText(dTeam.getTeamName());
            displayPlayer (dTeam.getGK(), lblAIFaceGK, lblGKnameAI, 
            lblGKoverallAI, lblGKstatsAI);
            displayPlayer (dTeam.getCB(), lblAIFaceCB, lblCBnameAI, 
            lblCBoverallAI, lblCBstatsAI);
            displayPlayer (dTeam.getCDM(), lblAIFaceCDM, lblCDMnameAI,
            lblCDMoverallAI, lblCDMstatsAI);
            displayPlayer (dTeam.getCAM(), lblAIFaceCAM, lblCAMnameAI,
            lblCAMoverallAI, lblCAMstatsAI);
            displayPlayer (dTeam.getST(), lblAIFaceST, lblSTnameAI,
            lblSToverallAI, lblSTstatsAI);
        }//if then 
        
        //Updates a User Team:
        else if (user == true){
            lblUSERteamName.setText(dTeam.getTeamName());
            displayPlayer (dTeam.getGK(), lblUserFaceGK, lblGKnameUSER, 
            lblGKoverallUSER, lblGKstatsUSER);
            displayPlayer (dTeam.getCB(), lblUserFaceCB, lblCBnameUSER, 
            lblCBoverallUSER, lblCBstatsUSER);
            displayPlayer (dTeam.getCDM(), lblUserFaceCDM, lblCDMnameUSER, 
            lblCDMoverallUSER, lblCDMstatsUSER);
            displayPlayer (dTeam.getCAM(), lblUserFaceCAM, lblCAMnameUSER, 
            lblCAMoverallUSER, lblCAMstatsUSER);
            displayPlayer (dTeam.getST(), lblUserFaceST, lblSTnameUSER, 
            lblSToverallUSER, lblSTstatsUSER);
        }//else if
    }//displayTeam 
    
    /*
    displayPlayer Mutator Method:
    * Updates the labels of a specfic player block.
    - Receives the Player object and the labels assocaiated with the player.
    - Sets the various labels with the correct data.
    - Scales the face image and reduces it's size to 80x80.
    */
    public void displayPlayer (Player dPlayer, JLabel lblFaceImage,
    JLabel lblName, JLabel lblOverall, JLabel lblStats){
        
        lblName.setText(dPlayer.getPosition() + " - " + dPlayer.getFirstName() 
        + " " + dPlayer.getSurname());
        
        lblOverall.setText("Overall: " + dPlayer.getOverall());
        
        lblStats.setText("Offensive: " + dPlayer.getOffStat() + " | Defensive: " 
        + dPlayer.getDefStat());
        
        playerFace = new ImageIcon (dPlayer.getFilePath());
        scale = playerFace.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        playerFace = new ImageIcon (scale);
        lblFaceImage.setIcon(playerFace);
    }//displayPlayer
    
    /*
    displayRankTable Mutator Method:
    * Updates the rank table.
    - Receives the array that contains the sorted rankings.
    - Sets each label to the text from the array in the sorted array.
        [0] - Top Team (First)
        [5] - Bottom Team (Sixth)
    */
    public void displayRankTable (String [] formattedRankings){
        lblRank1Team.setText(formattedRankings [0]);
        lblRank2Team.setText(formattedRankings [1]);
        lblRank3Team.setText(formattedRankings [2]);
        lblRank4Team.setText(formattedRankings [3]);
        lblRank5Team.setText(formattedRankings [4]);
        lblRank6Team.setText(formattedRankings [5]);
        
    }//displayRankTable 
    
    /*
    btnHelp Action Performed Event Method:
    * Opens the Help screen as a secondary screen.
    */
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        new Help().setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    /*
    btnSetTactics Action Performed Event Method:
    * Opens the Tactic screen.
    - Checks that the amount of matches occured is less than or equal to 5.
        > Opens the Tactics screen and hides the setTactics button.
    - If matchweek is 6:
        > The static tournament Rank is initialized and the Results screen is
          opened. The Tournament screen closes.
    */
    private void btnSetTacticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetTacticsActionPerformed
        if (matchweek <= 5){
            new Tactics ().setVisible(true);
            btnSetTactics.setVisible(false); 
        }
        else if (matchweek == 6){
            tournamentRank = new Rank (tournament);
            new Results ().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSetTacticsActionPerformed

    /*
    btnPlayMatch Action Performed Event Method:
    * Runs the necessary process required to simulate the matches of a matchweek
      and update the screens.
    * This button is static as it needs to be chnaged from the Tactics class.
    - Calls the playMatchWeek method from the League class, parsing the matchweek,
      User's selected Mentality, In Possession and Out of Possession Tactics.
        > Return's the User's team result of the specific matchweek.
    - Hides the playMatch button.
    - Uses a switch statement to determine which macthweek was played and what
      visual screen elements need to be updated.
        > Default is not required as all cases are code defined.
    - Updates the Rank Table.
    - Increments the matchweek.
    - Makes the setTactics button visible again.
    */
    private void btnPlayMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayMatchActionPerformed
        mentality = Tactics.mentality;
        inPossession = Tactics.inPossession;
        outPossession = Tactics.outOfPossession;
        
        result = tournament.playMatchWeek(matchweek, mentality, inPossession, outPossession);
        btnPlayMatch.setVisible(false);
        
        switch (matchweek){
            case 1:
                lblResult1.setText(result);
                displayTeam (aiTeam2, false);
            break;    
                
            case 2:
                lblResult2.setText(result);
                displayTeam (aiTeam3, false);
            break;
            
            case 3:
                lblResult3.setText(result);
                displayTeam (aiTeam4, false);
            break;
            
            case 4:
                lblResult4.setText(result);
                displayTeam (aiTeam5, false);
            break;
            
            case 5:
                lblResult5.setText(result);
                btnSetTactics.setText("End Tournament");
            break;
        }//end switch
        
        rankTable = tournament.getRankTable();
        displayRankTable (rankTable);
        matchweek++;
        btnSetTactics.setVisible(true);
    }//GEN-LAST:event_btnPlayMatchActionPerformed
   
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tournament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    public static javax.swing.JButton btnPlayMatch;
    private javax.swing.JButton btnSetTactics;
    private javax.swing.JLabel lblAIFaceCAM;
    private javax.swing.JLabel lblAIFaceCB;
    private javax.swing.JLabel lblAIFaceCDM;
    private javax.swing.JLabel lblAIFaceGK;
    private javax.swing.JLabel lblAIFaceST;
    private javax.swing.JLabel lblAIteamName;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCAMnameAI;
    private javax.swing.JLabel lblCAMnameUSER;
    private javax.swing.JLabel lblCAMoverallAI;
    private javax.swing.JLabel lblCAMoverallUSER;
    private javax.swing.JLabel lblCAMstatsAI;
    private javax.swing.JLabel lblCAMstatsUSER;
    private javax.swing.JLabel lblCBnameAI;
    private javax.swing.JLabel lblCBnameUSER;
    private javax.swing.JLabel lblCBoverallAI;
    private javax.swing.JLabel lblCBoverallUSER;
    private javax.swing.JLabel lblCBstatsAI;
    private javax.swing.JLabel lblCBstatsUSER;
    private javax.swing.JLabel lblCDMnameAI;
    private javax.swing.JLabel lblCDMnameUSER;
    private javax.swing.JLabel lblCDMoverallAI;
    private javax.swing.JLabel lblCDMoverallUSER;
    private javax.swing.JLabel lblCDMstatsAI;
    private javax.swing.JLabel lblCDMstatsUSER;
    private javax.swing.JLabel lblGKnameAI;
    private javax.swing.JLabel lblGKnameUSER;
    private javax.swing.JLabel lblGKoverallAI;
    private javax.swing.JLabel lblGKoverallUSER;
    private javax.swing.JLabel lblGKstatsAI;
    private javax.swing.JLabel lblGKstatsUSER;
    private javax.swing.JLabel lblRank1Team;
    private javax.swing.JLabel lblRank2Team;
    private javax.swing.JLabel lblRank3Team;
    private javax.swing.JLabel lblRank4Team;
    private javax.swing.JLabel lblRank5Team;
    private javax.swing.JLabel lblRank6Team;
    private javax.swing.JLabel lblResult1;
    private javax.swing.JLabel lblResult2;
    private javax.swing.JLabel lblResult3;
    private javax.swing.JLabel lblResult4;
    private javax.swing.JLabel lblResult5;
    private javax.swing.JLabel lblSTnameAI;
    private javax.swing.JLabel lblSTnameUSER;
    private javax.swing.JLabel lblSToverallAI;
    private javax.swing.JLabel lblSToverallUSER;
    private javax.swing.JLabel lblSTstatsAI;
    private javax.swing.JLabel lblSTstatsUSER;
    private javax.swing.JLabel lblTournamentName;
    private javax.swing.JLabel lblUSERteamName;
    private javax.swing.JLabel lblUserFaceCAM;
    private javax.swing.JLabel lblUserFaceCB;
    private javax.swing.JLabel lblUserFaceCDM;
    private javax.swing.JLabel lblUserFaceGK;
    private javax.swing.JLabel lblUserFaceST;
    private javax.swing.JPanel pnlAICAM;
    private javax.swing.JPanel pnlAICB;
    private javax.swing.JPanel pnlAICDM;
    private javax.swing.JPanel pnlAIGK;
    private javax.swing.JPanel pnlAIST;
    private javax.swing.JPanel pnlResults;
    private javax.swing.JPanel pnlTournamentRanks;
    private javax.swing.JPanel pnlUserCAM;
    private javax.swing.JPanel pnlUserCB;
    private javax.swing.JPanel pnlUserCDM;
    private javax.swing.JPanel pnlUserGK;
    private javax.swing.JPanel pnlUserST;
    // End of variables declaration//GEN-END:variables
}

package ramlakhan;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Leaderboard extends javax.swing.JFrame {

    //Customization variables:
    private Border selected = new LineBorder (Color.WHITE, 5);
    private Border unselected = new LineBorder (Color.BLACK, 0);
    
    //Leaderboard Properties:
    private Rankings leaderboard = new Rankings ();
    
    /*
    Leaderboard Constructor:
    * Initializes components and runs the refreshLeaderboard method.
    */
    public Leaderboard() {
        initComponents();
        refreshLeaderboard();
        
    }//Leaderboard

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnBack = new javax.swing.JButton();
        lblTeamAndTournament = new javax.swing.JLabel();
        pnlFormAndStats = new javax.swing.JPanel();
        lblStatWins = new javax.swing.JLabel();
        lblStatLosses = new javax.swing.JLabel();
        lblStatDraws = new javax.swing.JLabel();
        lblStatGoalsScored = new javax.swing.JLabel();
        pnlTeamSquad = new javax.swing.JPanel();
        lblPlayerGK = new javax.swing.JLabel();
        lblPlayerCB = new javax.swing.JLabel();
        lblPlayerCDM = new javax.swing.JLabel();
        lblPlayerCAM = new javax.swing.JLabel();
        lblPlayerST = new javax.swing.JLabel();
        pnlTournament = new javax.swing.JPanel();
        lblRank1Team = new javax.swing.JLabel();
        lblRank2Team = new javax.swing.JLabel();
        lblRank3Team = new javax.swing.JLabel();
        lblRank4Team = new javax.swing.JLabel();
        lblRank5Team = new javax.swing.JLabel();
        lblRank6Team = new javax.swing.JLabel();
        btnRank1 = new javax.swing.JButton();
        btnRank2 = new javax.swing.JButton();
        btnRank3 = new javax.swing.JButton();
        btnRank4 = new javax.swing.JButton();
        btnRank5 = new javax.swing.JButton();
        btnRank6 = new javax.swing.JButton();
        btnRank7 = new javax.swing.JButton();
        btnRank8 = new javax.swing.JButton();
        btnRank9 = new javax.swing.JButton();
        btnRank10 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five a Side Football - Leaderboard");
        setMaximumSize(new java.awt.Dimension(1280, 691));
        setMinimumSize(new java.awt.Dimension(1280, 691));
        setName("Leaderboard"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        btnBack.setBackground(new Color (0,0,0,0));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 3, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 10, 140, 40);

        lblTeamAndTournament.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        lblTeamAndTournament.setForeground(new java.awt.Color(255, 255, 255));
        lblTeamAndTournament.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTeamAndTournament);
        lblTeamAndTournament.setBounds(630, 100, 500, 40);

        pnlFormAndStats.setBackground(new java.awt.Color(0, 0, 0));
        pnlFormAndStats.setLayout(new java.awt.GridBagLayout());

        lblStatWins.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatWins.setForeground(new java.awt.Color(255, 255, 255));
        lblStatWins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlFormAndStats.add(lblStatWins, gridBagConstraints);

        lblStatLosses.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatLosses.setForeground(new java.awt.Color(255, 255, 255));
        lblStatLosses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlFormAndStats.add(lblStatLosses, gridBagConstraints);

        lblStatDraws.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatDraws.setForeground(new java.awt.Color(255, 255, 255));
        lblStatDraws.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pnlFormAndStats.add(lblStatDraws, gridBagConstraints);

        lblStatGoalsScored.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatGoalsScored.setForeground(new java.awt.Color(255, 255, 255));
        lblStatGoalsScored.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        pnlFormAndStats.add(lblStatGoalsScored, gridBagConstraints);

        getContentPane().add(pnlFormAndStats);
        pnlFormAndStats.setBounds(935, 475, 260, 110);

        pnlTeamSquad.setBackground(new java.awt.Color(0, 0, 0));
        pnlTeamSquad.setLayout(new java.awt.GridBagLayout());

        lblPlayerGK.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblPlayerGK.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerGK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTeamSquad.add(lblPlayerGK, new java.awt.GridBagConstraints());

        lblPlayerCB.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblPlayerCB.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerCB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlTeamSquad.add(lblPlayerCB, gridBagConstraints);

        lblPlayerCDM.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblPlayerCDM.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pnlTeamSquad.add(lblPlayerCDM, gridBagConstraints);

        lblPlayerCAM.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblPlayerCAM.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerCAM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        pnlTeamSquad.add(lblPlayerCAM, gridBagConstraints);

        lblPlayerST.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblPlayerST.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        pnlTeamSquad.add(lblPlayerST, gridBagConstraints);

        getContentPane().add(pnlTeamSquad);
        pnlTeamSquad.setBounds(520, 470, 350, 150);

        pnlTournament.setBackground(new java.awt.Color(0, 0, 0));
        pnlTournament.setLayout(new java.awt.GridBagLayout());

        lblRank1Team.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        lblRank1Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank1Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRank1Team.setText("Select a player");
        lblRank1Team.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true));
        pnlTournament.add(lblRank1Team, new java.awt.GridBagConstraints());

        lblRank2Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank2Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank2Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRank2Team.setText("from the Leaderboard");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlTournament.add(lblRank2Team, gridBagConstraints);

        lblRank3Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank3Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank3Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRank3Team.setText("to view their stats");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pnlTournament.add(lblRank3Team, gridBagConstraints);

        lblRank4Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank4Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank4Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        pnlTournament.add(lblRank4Team, gridBagConstraints);

        lblRank5Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank5Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank5Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        pnlTournament.add(lblRank5Team, gridBagConstraints);

        lblRank6Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank6Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank6Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        pnlTournament.add(lblRank6Team, gridBagConstraints);

        getContentPane().add(pnlTournament);
        pnlTournament.setBounds(690, 200, 390, 190);

        btnRank1.setBackground(new java.awt.Color(0, 255, 102));
        btnRank1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank1);
        btnRank1.setBounds(22, 140, 480, 40);

        btnRank2.setBackground(new java.awt.Color(102, 51, 255));
        btnRank2.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank2.setForeground(new java.awt.Color(255, 255, 255));
        btnRank2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank2);
        btnRank2.setBounds(22, 190, 480, 40);

        btnRank3.setBackground(new java.awt.Color(102, 51, 255));
        btnRank3.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank3.setForeground(new java.awt.Color(255, 255, 255));
        btnRank3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank3);
        btnRank3.setBounds(22, 240, 480, 40);

        btnRank4.setBackground(new java.awt.Color(102, 51, 255));
        btnRank4.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank4.setForeground(new java.awt.Color(255, 255, 255));
        btnRank4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank4);
        btnRank4.setBounds(22, 290, 480, 40);

        btnRank5.setBackground(new java.awt.Color(102, 51, 255));
        btnRank5.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank5.setForeground(new java.awt.Color(255, 255, 255));
        btnRank5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank5);
        btnRank5.setBounds(22, 340, 480, 40);

        btnRank6.setBackground(new java.awt.Color(102, 51, 255));
        btnRank6.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank6.setForeground(new java.awt.Color(255, 255, 255));
        btnRank6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank6);
        btnRank6.setBounds(22, 390, 480, 40);

        btnRank7.setBackground(new java.awt.Color(102, 51, 255));
        btnRank7.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank7.setForeground(new java.awt.Color(255, 255, 255));
        btnRank7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank7);
        btnRank7.setBounds(22, 440, 480, 40);

        btnRank8.setBackground(new java.awt.Color(255, 0, 153));
        btnRank8.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank8.setForeground(new java.awt.Color(255, 255, 255));
        btnRank8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank8);
        btnRank8.setBounds(22, 490, 480, 40);

        btnRank9.setBackground(new java.awt.Color(255, 0, 153));
        btnRank9.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank9.setForeground(new java.awt.Color(255, 255, 255));
        btnRank9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank9);
        btnRank9.setBounds(22, 540, 480, 40);

        btnRank10.setBackground(new java.awt.Color(255, 0, 153));
        btnRank10.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRank10.setForeground(new java.awt.Color(255, 255, 255));
        btnRank10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRank10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRank10);
        btnRank10.setBounds(22, 590, 480, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/7) Leaderboard.jpg"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 672));
        lblBackground.setRequestFocusEnabled(false);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 672);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    refreshLeaderboard Mutator Method:
    * Displays the rankings onto the relevant button texts.
    */
    public void refreshLeaderboard (){
        btnRank1.setText("|#1|" + leaderboard.getRank(0).getRankTitle());
        btnRank2.setText("|#2|" + leaderboard.getRank(1).getRankTitle());
        btnRank3.setText("|#3|" + leaderboard.getRank(2).getRankTitle());
        btnRank4.setText("|#4|" + leaderboard.getRank(3).getRankTitle());
        btnRank5.setText("|#5|" + leaderboard.getRank(4).getRankTitle());
        btnRank6.setText("|#6|" + leaderboard.getRank(5).getRankTitle());
        btnRank7.setText("|#7|" + leaderboard.getRank(6).getRankTitle());
        btnRank8.setText("|#8|" + leaderboard.getRank(7).getRankTitle());
        btnRank9.setText("|#9|" + leaderboard.getRank(8).getRankTitle());
        btnRank10.setText("|#10|" + leaderboard.getRank(9).getRankTitle());
        
    }//refreshLeaderboard method
    
    /*
    The following methods are used to change the data shown on the right hand 
    side of the screen.
    The method will first remove any borders visible around any buttons and put 
    a border on the selected button [or ranking].
    The action proceeded will then pull off data from the database and display 
    the information required of the team.
    */
    
    /*
    btnRank Action Performed Event Method:
    * Goes to the Home screen and closes the Leaderboard.
    */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /*
    btnRank1 Action Performed Event Method:
    * Displays the Team data of the Top 1 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 1 Team.
    */
    private void btnRank1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank1ActionPerformed
        unselectButtons ();
        btnRank1.setBorder(selected);
        displayRank (leaderboard.getRank(0));
    }//GEN-LAST:event_btnRank1ActionPerformed
    
    /*
    btnRank4 Action Performed Event Method:
    * Displays the Team data of the Top 4 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 4 Team.
    */
    private void btnRank4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank4ActionPerformed
        unselectButtons ();
        btnRank4.setBorder(selected);
        displayRank (leaderboard.getRank(3));
    }//GEN-LAST:event_btnRank4ActionPerformed

    /*
    btnRank2 Action Performed Event Method:
    * Displays the Team data of the Top 2 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 2 Team.
    */
    private void btnRank2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank2ActionPerformed
        unselectButtons ();
        btnRank2.setBorder(selected);
        displayRank (leaderboard.getRank(1));
    }//GEN-LAST:event_btnRank2ActionPerformed

    /*
    btnRank5 Action Performed Event Method:
    * Displays the Team data of the Top 5 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 5 Team.
    */
    private void btnRank5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank5ActionPerformed
        unselectButtons ();
        btnRank5.setBorder(selected);
        displayRank (leaderboard.getRank(4));
    }//GEN-LAST:event_btnRank5ActionPerformed

    /*
    btnRank6 Action Performed Event Method:
    * Displays the Team data of the Top 6 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 6 Team.
    */
    private void btnRank6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank6ActionPerformed
        unselectButtons ();
        btnRank6.setBorder(selected);
        displayRank (leaderboard.getRank(5));
    }//GEN-LAST:event_btnRank6ActionPerformed

    /*
    btnRank7 Action Performed Event Method:
    * Displays the Team data of the Top 7 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 7 Team.
    */
    private void btnRank7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank7ActionPerformed
        unselectButtons ();
        btnRank7.setBorder(selected);
        displayRank (leaderboard.getRank(6));
    }//GEN-LAST:event_btnRank7ActionPerformed

    /*
    btnRank8 Action Performed Event Method:
    * Displays the Team data of the Top 8 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 8 Team.
    */
    private void btnRank8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank8ActionPerformed
        unselectButtons ();
        btnRank8.setBorder(selected);
        displayRank (leaderboard.getRank(7));
    }//GEN-LAST:event_btnRank8ActionPerformed

    /*
    btnRank10 Action Performed Event Method:
    * Displays the Team data of the Top 10 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 10 Team.
    */
    private void btnRank10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank10ActionPerformed
        unselectButtons ();
        btnRank10.setBorder(selected);
        displayRank (leaderboard.getRank(9));
    }//GEN-LAST:event_btnRank10ActionPerformed

    /*
    btnRank3 Action Performed Event Method:
    * Displays the Team data of the Top 3 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 3 Team.
    */
    private void btnRank3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank3ActionPerformed
        unselectButtons ();
        btnRank3.setBorder(selected);
        displayRank (leaderboard.getRank(2));
    }//GEN-LAST:event_btnRank3ActionPerformed

    /*
    btnRank9 Action Performed Event Method:
    * Displays the Team data of the Top 9 Team.
    - Shows the selection of the team button by removing borders for all
      other buttons and only showing a border for that rank button.
    - Runs the method displayRank and parses the Top 9 Team.
    */
    private void btnRank9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRank9ActionPerformed
        unselectButtons ();
        btnRank9.setBorder(selected);
        displayRank (leaderboard.getRank(8));
    }//GEN-LAST:event_btnRank9ActionPerformed

    /*
    unselectButtons Mutator Method:
    * Removes borders around all buttons.
    */
    public void unselectButtons (){
        btnRank1.setBorder(unselected);
        btnRank2.setBorder(unselected);
        btnRank3.setBorder(unselected);
        btnRank4.setBorder(unselected);
        btnRank5.setBorder(unselected);
        btnRank6.setBorder(unselected);
        btnRank7.setBorder(unselected);
        btnRank8.setBorder(unselected);
        btnRank9.setBorder(unselected);
        btnRank10.setBorder(unselected);
    }//unselectButtons
    
    /*
    displayRank Mutator Method:
    * Displays the Team's data on the right hand side of the screen.
    - Receives a Rank object and breaks it down to display the relevant
      information on the screens.
    */
    public void displayRank (Rank display){
        lblTeamAndTournament.setText(display.getUserTeamName() + " - " 
        + display.getTournamentName());
        
        //Rankings Table:
        lblRank1Team.setText(display.getLeagueTableRankings(0));
        lblRank2Team.setText(display.getLeagueTableRankings(1));
        lblRank3Team.setText(display.getLeagueTableRankings(2));
        lblRank4Team.setText(display.getLeagueTableRankings(3));
        lblRank5Team.setText(display.getLeagueTableRankings(4));
        lblRank6Team.setText(display.getLeagueTableRankings(5));
        
        //Team Players:
        lblPlayerGK.setText(display.getUserPlayer(0));
        lblPlayerCB.setText(display.getUserPlayer(1));
        lblPlayerCDM.setText(display.getUserPlayer(2));
        lblPlayerCAM.setText(display.getUserPlayer(3));
        lblPlayerST.setText(display.getUserPlayer(4));
        
        //Form:
        lblStatWins.setText(display.getWins() + " Wins");
        lblStatDraws.setText(display.getDraws()+ " Draws");
        lblStatLosses.setText(display.getLosses()+ " Losses");
        lblStatGoalsScored.setText(display.getGoalsScored()+ " Goals Scored");
        
    }//displayRank
    
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
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leaderboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRank1;
    private javax.swing.JButton btnRank10;
    private javax.swing.JButton btnRank2;
    private javax.swing.JButton btnRank3;
    private javax.swing.JButton btnRank4;
    private javax.swing.JButton btnRank5;
    private javax.swing.JButton btnRank6;
    private javax.swing.JButton btnRank7;
    private javax.swing.JButton btnRank8;
    private javax.swing.JButton btnRank9;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPlayerCAM;
    private javax.swing.JLabel lblPlayerCB;
    private javax.swing.JLabel lblPlayerCDM;
    private javax.swing.JLabel lblPlayerGK;
    private javax.swing.JLabel lblPlayerST;
    private javax.swing.JLabel lblRank1Team;
    private javax.swing.JLabel lblRank2Team;
    private javax.swing.JLabel lblRank3Team;
    private javax.swing.JLabel lblRank4Team;
    private javax.swing.JLabel lblRank5Team;
    private javax.swing.JLabel lblRank6Team;
    private javax.swing.JLabel lblStatDraws;
    private javax.swing.JLabel lblStatGoalsScored;
    private javax.swing.JLabel lblStatLosses;
    private javax.swing.JLabel lblStatWins;
    private javax.swing.JLabel lblTeamAndTournament;
    private javax.swing.JPanel pnlFormAndStats;
    private javax.swing.JPanel pnlTeamSquad;
    private javax.swing.JPanel pnlTournament;
    // End of variables declaration//GEN-END:variables
}

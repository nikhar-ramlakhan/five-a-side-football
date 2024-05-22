package ramlakhan;

public class Results extends javax.swing.JFrame {

    //Properties of the Results class
    private Rank finalRank = Tournament.tournamentRank;
    
    /*
    Results Constructor:
    * Initalizes components and sets the labels to all it's necessary
      data.
    */
    public Results() {
        initComponents();
        
        //Basic Details:
        lblTournamentName.setText(finalRank.getTournamentName());
        lblTeamName.setText(finalRank.getUserTeamName());
        
        //Team Players:
        lblPlayerGK.setText(finalRank.getUserPlayer(0));
        lblPlayerCB.setText(finalRank.getUserPlayer(1));
        lblPlayerCDM.setText(finalRank.getUserPlayer(2));
        lblPlayerCAM.setText(finalRank.getUserPlayer(3));
        lblPlayerST.setText(finalRank.getUserPlayer(4));
        
        //Ranking Table:
        lblRank1Team.setText(finalRank.getLeagueTableRankings(0));
        lblRank2Team.setText(finalRank.getLeagueTableRankings(1));
        lblRank3Team.setText(finalRank.getLeagueTableRankings(2));
        lblRank4Team.setText(finalRank.getLeagueTableRankings(3));
        lblRank5Team.setText(finalRank.getLeagueTableRankings(4));
        lblRank6Team.setText(finalRank.getLeagueTableRankings(5));
        
        //Form Table:
        lblStatWins.setText(finalRank.getWins() + " Wins");
        lblStatDraws.setText(finalRank.getDraws() + " Draws");
        lblStatLosses.setText(finalRank.getLosses() + " Losses");
        lblStatGoalsScored.setText(finalRank.getGoalsScored() + " Goals Scored");
    }//Results

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTeamName = new javax.swing.JLabel();
        pnlTeamSquad = new javax.swing.JPanel();
        lblPlayerGK = new javax.swing.JLabel();
        lblPlayerCB = new javax.swing.JLabel();
        lblPlayerCDM = new javax.swing.JLabel();
        lblPlayerCAM = new javax.swing.JLabel();
        lblPlayerST = new javax.swing.JLabel();
        lblTournamentName = new javax.swing.JLabel();
        pnlTournament = new javax.swing.JPanel();
        lblRank1Team = new javax.swing.JLabel();
        lblRank2Team = new javax.swing.JLabel();
        lblRank3Team = new javax.swing.JLabel();
        lblRank4Team = new javax.swing.JLabel();
        lblRank5Team = new javax.swing.JLabel();
        lblRank6Team = new javax.swing.JLabel();
        pnlFormAndStats = new javax.swing.JPanel();
        lblStatWins = new javax.swing.JLabel();
        lblStatLosses = new javax.swing.JLabel();
        lblStatDraws = new javax.swing.JLabel();
        lblStatGoalsScored = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five a Side Football - Results");
        setMaximumSize(new java.awt.Dimension(1280, 691));
        setMinimumSize(new java.awt.Dimension(1280, 691));
        setName("Results"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTeamName.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblTeamName.setForeground(new java.awt.Color(255, 255, 255));
        lblTeamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTeamName);
        lblTeamName.setBounds(370, 20, 560, 40);

        pnlTeamSquad.setBackground(new java.awt.Color(0, 0, 0));

        lblPlayerGK.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblPlayerGK.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerGK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTeamSquad.add(lblPlayerGK);

        lblPlayerCB.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblPlayerCB.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerCB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTeamSquad.add(lblPlayerCB);

        lblPlayerCDM.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblPlayerCDM.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTeamSquad.add(lblPlayerCDM);

        lblPlayerCAM.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblPlayerCAM.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerCAM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTeamSquad.add(lblPlayerCAM);

        lblPlayerST.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblPlayerST.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTeamSquad.add(lblPlayerST);

        getContentPane().add(pnlTeamSquad);
        pnlTeamSquad.setBounds(70, 200, 390, 150);

        lblTournamentName.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblTournamentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTournamentName);
        lblTournamentName.setBounds(640, 230, 390, 40);

        pnlTournament.setBackground(new java.awt.Color(0, 0, 0));

        lblRank1Team.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        lblRank1Team.setForeground(new java.awt.Color(204, 204, 0));
        lblRank1Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRank1Team.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        pnlTournament.add(lblRank1Team);

        lblRank2Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank2Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank2Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTournament.add(lblRank2Team);

        lblRank3Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank3Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank3Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTournament.add(lblRank3Team);

        lblRank4Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank4Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank4Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTournament.add(lblRank4Team);

        lblRank5Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank5Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank5Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTournament.add(lblRank5Team);

        lblRank6Team.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblRank6Team.setForeground(new java.awt.Color(255, 255, 255));
        lblRank6Team.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTournament.add(lblRank6Team);

        getContentPane().add(pnlTournament);
        pnlTournament.setBounds(640, 280, 390, 190);

        pnlFormAndStats.setBackground(new java.awt.Color(0, 0, 0));

        lblStatWins.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatWins.setForeground(new java.awt.Color(255, 255, 255));
        lblStatWins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatLosses.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatLosses.setForeground(new java.awt.Color(255, 255, 255));
        lblStatLosses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatDraws.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatDraws.setForeground(new java.awt.Color(255, 255, 255));
        lblStatDraws.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatGoalsScored.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatGoalsScored.setForeground(new java.awt.Color(255, 255, 255));
        lblStatGoalsScored.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlFormAndStatsLayout = new javax.swing.GroupLayout(pnlFormAndStats);
        pnlFormAndStats.setLayout(pnlFormAndStatsLayout);
        pnlFormAndStatsLayout.setHorizontalGroup(
            pnlFormAndStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStatLosses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblStatWins, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblStatDraws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblStatGoalsScored, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        pnlFormAndStatsLayout.setVerticalGroup(
            pnlFormAndStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormAndStatsLayout.createSequentialGroup()
                .addComponent(lblStatWins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatLosses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatDraws)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatGoalsScored)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFormAndStats);
        pnlFormAndStats.setBounds(100, 500, 320, 110);

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSave.setText("Save and Proceed");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(1010, 610, 220, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/6) Results.jpg"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 672));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 672);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    btnSave Action Performed Event Method:
    * Saves the tournament to the databas and proceeds to the Leaderboard.
    */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        finalRank.addTournamentToDatabase();
        new Leaderboard ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
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
    private javax.swing.JLabel lblTeamName;
    private javax.swing.JLabel lblTournamentName;
    private javax.swing.JPanel pnlFormAndStats;
    private javax.swing.JPanel pnlTeamSquad;
    private javax.swing.JPanel pnlTournament;
    // End of variables declaration//GEN-END:variables
}

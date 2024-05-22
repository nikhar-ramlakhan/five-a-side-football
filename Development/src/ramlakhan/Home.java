package ramlakhan;
public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlayGame = new javax.swing.JButton();
        btnLeaderboard = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five a Side Football - Home");
        setMaximumSize(new java.awt.Dimension(1280, 691));
        setMinimumSize(new java.awt.Dimension(1280, 691));
        setName("Main Menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        btnPlayGame.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayGame);
        btnPlayGame.setBounds(640, 160, 420, 90);

        btnLeaderboard.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnLeaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaderboardActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeaderboard);
        btnLeaderboard.setBounds(630, 300, 430, 90);

        btnHelp.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp);
        btnHelp.setBounds(640, 450, 420, 100);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/2) Home Screen.jpg"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 672));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 672);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* 
    btnPlayGame Action Perfomed Event Method:
    * Open the UserDetails screen and close the Home screen.
    */
    private void btnPlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayGameActionPerformed
        new UserDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPlayGameActionPerformed

    /* 
    btnLeaderboard Action Perfomed Event Method:
    * Open the Leaderboard screen and close the Home screen.
    */
    private void btnLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaderboardActionPerformed
        new Leaderboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLeaderboardActionPerformed

    /*
    btnHelp Action Perfomed Event Method:
    * Open the Help screen as a secondary screen.
    */
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        new Help ().setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLeaderboard;
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}

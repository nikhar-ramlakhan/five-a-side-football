package ramlakhan;
import java.awt.Color;
public class Start extends javax.swing.JFrame {
    
    public Start() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStartGame = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        lblBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five a Side Football");
        setMaximumSize(new java.awt.Dimension(768, 432));
        setMinimumSize(new java.awt.Dimension(768, 432));
        setName("Start-up"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(768, 432));
        setResizable(false);
        getContentPane().setLayout(null);

        btnStartGame.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnStartGame.setBorder(null);
        btnStartGame.setMaximumSize(new java.awt.Dimension(272, 77));
        btnStartGame.setMinimumSize(new java.awt.Dimension(272, 77));
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnStartGame);
        btnStartGame.setBounds(250, 300, 270, 70);

        btnQuit.setBackground(new Color (0,0,0,0));
        btnQuit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(0, 255, 153));
        btnQuit.setText("QUIT");
        btnQuit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 153)));
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuit);
        btnQuit.setBounds(340, 390, 90, 30);

        lblBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/1) Start Screen.jpg"))); // NOI18N
        getContentPane().add(lblBackgroundImage);
        lblBackgroundImage.setBounds(0, 0, 770, 432);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /* 
    btnStartGame Action Perfomed Event Method:
    * Proceeds to the Home screen.
    */
    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        new Home ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStartGameActionPerformed
    
    /*
    btnQuit Action Perfomed Event Method:
    * Closes the program.
    */
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuitActionPerformed


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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JLabel lblBackgroundImage;
    // End of variables declaration//GEN-END:variables
}

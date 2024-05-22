package ramlakhan;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Help extends javax.swing.JFrame {
    
    //Customization Properties:
    Border selected = new LineBorder (Color.WHITE, 3);
    Border unselected = new LineBorder (Color.BLACK, 0);
    private ImageIcon helpContent;
    
    /*
    Help Constructor:
    * Intitialize components.
    */
    public Help() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHelpContentImage = new javax.swing.JLabel();
        btnBasicsHelp = new javax.swing.JButton();
        btnTeamSelectionHelp = new javax.swing.JButton();
        btnPointsAndRanksHelp = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Five a Side Football - Help Menu");
        setMaximumSize(new java.awt.Dimension(1280, 691));
        setMinimumSize(new java.awt.Dimension(1280, 691));
        setName("Help"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        lblHelpContentImage.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        lblHelpContentImage.setForeground(new java.awt.Color(255, 0, 204));
        lblHelpContentImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHelpContentImage.setText("PLEASE SELECT A HELP CATEGORY");
        lblHelpContentImage.setMaximumSize(new java.awt.Dimension(957, 373));
        lblHelpContentImage.setMinimumSize(new java.awt.Dimension(957, 373));
        lblHelpContentImage.setPreferredSize(new java.awt.Dimension(957, 373));
        getContentPane().add(lblHelpContentImage);
        lblHelpContentImage.setBounds(130, 210, 970, 373);

        btnBasicsHelp.setBackground(new Color (0,0,0,0));
        btnBasicsHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasicsHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnBasicsHelp);
        btnBasicsHelp.setBounds(20, 130, 340, 70);

        btnTeamSelectionHelp.setBackground(new Color (0,0,0,0));
        btnTeamSelectionHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamSelectionHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeamSelectionHelp);
        btnTeamSelectionHelp.setBounds(440, 130, 330, 70);

        btnPointsAndRanksHelp.setBackground(new Color (0,0,0,0));
        btnPointsAndRanksHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointsAndRanksHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnPointsAndRanksHelp);
        btnPointsAndRanksHelp.setBounds(860, 130, 340, 60);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/8) Help.jpg"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 672));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 672);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    btnPointsAndRanksHelp Action Performed Event Method:
    * Displays the Points And Ranks Help Image.
    - Shows button selection and displays the help image.
    */
    private void btnPointsAndRanksHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointsAndRanksHelpActionPerformed
        selectionDisplay();
        btnPointsAndRanksHelp.setBorder(selected);
        
        //display help content image
        helpContent = new ImageIcon (".//imageResources//help//pointsAndRanks.png");
        lblHelpContentImage.setIcon (helpContent);
    }//GEN-LAST:event_btnPointsAndRanksHelpActionPerformed
    
    /*
    btnTeamSelectionHelp Action Performed Event Method:
    * Displays the Team Selection Help Image.
    - Shows button selection and displays the help image.
    */
    private void btnTeamSelectionHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamSelectionHelpActionPerformed
        selectionDisplay();
        btnTeamSelectionHelp.setBorder(selected);
        
        //display help content image
        helpContent = new ImageIcon (".//imageResources//help//teamSelection.png");
        lblHelpContentImage.setIcon (helpContent);
    }//GEN-LAST:event_btnTeamSelectionHelpActionPerformed
   
    /*
    btnBasicsHelp Action Performed Event Method:
    * Displays the Basics Help Image.
    - Shows button selection and displays the help image.
    */
    private void btnBasicsHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasicsHelpActionPerformed
       selectionDisplay();
        btnBasicsHelp.setBorder(selected);
        
        //display help content image
        helpContent = new ImageIcon (".//imageResources//help//basic.png");
        lblHelpContentImage.setIcon (helpContent);
    }//GEN-LAST:event_btnBasicsHelpActionPerformed

    /*
    selectionDisplay Mutator Method:
    * Clears borders on all buttons and removes the initial text.
    */
    public void selectionDisplay (){
        btnTeamSelectionHelp.setBorder(unselected);
        btnPointsAndRanksHelp.setBorder(unselected);
        btnBasicsHelp.setBorder(unselected);
        lblHelpContentImage.setText("");
    }//selectionDisplay

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBasicsHelp;
    private javax.swing.JButton btnPointsAndRanksHelp;
    private javax.swing.JButton btnTeamSelectionHelp;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblHelpContentImage;
    // End of variables declaration//GEN-END:variables
}

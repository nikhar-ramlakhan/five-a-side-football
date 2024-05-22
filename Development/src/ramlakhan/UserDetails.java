package ramlakhan;
import java.awt.Color;
import javax.swing.JOptionPane;

public class UserDetails extends javax.swing.JFrame {
    
    //Variables used for customization:
    private Color errorColour = new Color (255, 0, 0, 30);
    private Color validColour = new Color (0, 255, 0, 30);
     
    //Variables used for valdiation:
    private boolean validCheck;
    private boolean isLength;
    private boolean isLetter;
    private boolean input;
    private boolean nameValid;
    private boolean teamValid;
    private boolean tournamentValid;
    private boolean allValid;
    private String errorMessage = new String ();
     
    /*
    Input Variables:
    - These variables are static so that they can be accessed easily by the 
      TeamSelection screen.
    */
    public static String username = new String ();
    public static String teamName = new String ();
    public static String tournamentName = new String ();
     
    public UserDetails() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jtfUsername = new javax.swing.JTextField();
        jtfTeamName = new javax.swing.JTextField();
        jtfTournamentName = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five a Side Football - User Details");
        setMaximumSize(new java.awt.Dimension(1280, 691));
        setMinimumSize(new java.awt.Dimension(1280, 691));
        setName("User Details"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        btnStart.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnStart.setBorder(null);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(1060, 620, 160, 40);

        btnHelp.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp);
        btnHelp.setBounds(0, 570, 160, 40);

        btnCancel.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(10, 620, 150, 40);

        jtfUsername.setBackground(new java.awt.Color(0, 0, 0, 10));
        jtfUsername.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jtfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jtfUsername);
        jtfUsername.setBounds(620, 220, 550, 80);

        jtfTeamName.setBackground(new java.awt.Color(0, 0, 0, 10));
        jtfTeamName.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jtfTeamName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jtfTeamName);
        jtfTeamName.setBounds(620, 360, 550, 80);

        jtfTournamentName.setBackground(new java.awt.Color(0, 0, 0, 10));
        jtfTournamentName.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jtfTournamentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jtfTournamentName);
        jtfTournamentName.setBounds(620, 490, 550, 80);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/3) User Details.jpg"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 672));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 672);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* 
    btnHelp Action Performed Event Method:
    * Open the Help screen as a secondary screen.
    */
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        new Help ().setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    /* 
    btnCancel Action Performed Event Method:
    * Return to the Home screen and close the UserDetails screen.
    */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /* 
    btnStart Action Performed Event Method:
    * Ensures that data input is valid and proceeds to the TeamSelection screen.
    - Gets the username, team name and tournament name from the text fields and
      performs validation on each of them.
    - Determines which fields had valdiation issues and turns them red.
    - If the validation is false, an error message is displayed.
    - If validation is true, the user is taken to the TeamSelection screen and
      is prompted with a message box explaining the TeamSelection process.
    */
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        jtfUsername.setBackground(validColour);
        jtfTeamName.setBackground(validColour);
        jtfTournamentName.setBackground(validColour);
        
        username = jtfUsername.getText();
        teamName = jtfTeamName.getText();
        tournamentName = jtfTournamentName.getText();
        
        nameValid = true;
        teamValid = true;
        tournamentValid = true;
        allValid = true;
        errorMessage = "";
        
        nameValid = validateText (username);
        teamValid = validateText (teamName);
        tournamentValid = validateText (tournamentName);
        
        if (nameValid == false || teamValid == false || tournamentValid == false){
            allValid = false;
        }//if then
        
        if (allValid == false){
            if (nameValid == false){
                jtfUsername.setBackground(errorColour);
                errorMessage = errorMessage + " - Username \n";
            }//if username is invalid
            if (teamValid == false){
                jtfTeamName.setBackground(errorColour);
                errorMessage = errorMessage + " - Team Name \n";
            }//if team name is invalid
            if (tournamentValid == false){
                jtfTournamentName.setBackground(errorColour);
                errorMessage = errorMessage + " - Tournament \n";
            } //if tournament name is invalid
            JOptionPane.showMessageDialog(null, "The following entries did not \n"
            + "meet the validation requirments:\n" + errorMessage + "\nPlease "
            + "ensure that validation rules \nhave been followed or that \nthere"
            + " is input!", "Error Starting Game", JOptionPane.ERROR_MESSAGE);
        }//if then
        else if (allValid == true){
            new TeamSelection().setVisible(true);
            JOptionPane.showMessageDialog(null, "Welcome " + username + "! "
            + "(aka Gaffer)\nYou are about to select to your team. \nWhen "
            + "selecting a team, you will see that \neach position has a level "
            + "followed by a number.\nThis number represents the level of quality "
            + "of \nthe players you can select for that position.\n\nUnhappy with "
            + "the quality for a position?\nHit the refresh button at the bottom left!"
            + "\n\nHINT: Use players that have a good balance offensively and defensively.", 
            "YOU ARE ABOUT TO SELECT TO YOUR TEAM!", JOptionPane.WARNING_MESSAGE);
            this.dispose();
        }//else if
       
    }//GEN-LAST:event_btnStartActionPerformed
    
    /*
    valdiateText Accessor and Mutator Method:
    * Validates the inputs made by the user.
    - Receives the text required to validate.
    - Trims spaces that may be present at the end of the string.
    - Performs a length check to check that the length is not longer thant 15.
    - Performs a presence check to ensure that data has been input.
    - Performs a isLetter check to make sure no numbers or special characters
      were used.
    - Returns if the text is valid as a boolean.
    */
    public boolean validateText (String transfer){
        validCheck = true;
        isLength = true;
        isLetter = true;
        input = true;
        
        transfer.trim();
        
        int length = transfer.length();
        char currentLetter;
        
        if (length == 0){
            input = false;
            validCheck = false;
        }//if then
        else if (length > 15){
            isLength = false;
            validCheck = false;
        }//else if
        
        for (int pos = 0; pos < length; pos++){
            currentLetter = transfer.charAt(pos);
            if (!Character.isLetter(currentLetter)){
                if (currentLetter == ' '){
                    isLetter = true;
                }//if
                else {
                    isLetter = false;
                    validCheck = false;  
                }//else
            }//if then
        }//end for loop 
        
        return validCheck;
    }//validateText
    
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
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnStart;
    private javax.swing.JTextField jtfTeamName;
    private javax.swing.JTextField jtfTournamentName;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}

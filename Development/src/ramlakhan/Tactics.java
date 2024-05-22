package ramlakhan;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class Tactics extends javax.swing.JFrame {
    
    /*
    The following enums are made to be static so that the Tournmanet class can
    get the values easily.
    */
    public static League.Mentality mentality = null;
    public static League.InPossession inPossession = null;
    public static League.OutOfPossession outOfPossession = null;
    
    private boolean primaryValidation = true;
    private boolean mentalityVal = false;
    private boolean inPosVal = false;
    private boolean outOfPosVal = false;
    
    /*
    Tactics Constructor:
    * Initializes the components of the Tactics screen.
    - Prompts the user to select a tactic for each element through the text
      on the label.
    */
    public Tactics() {
        initComponents();
        
        txaMentalityDetails.setText("Please select your team Mentality. "
        + "Details of the mentality phase will appear here when it has been selected.");
        
        txaInPossessionDetails.setText("Please select a tactic to use when your "
        + "team is In Possession. Details of the tactic will appear here when it "
        + "has been selected.");
        
        txaOutOfPossessionDetails.setText("Please select a tactic to use when "
        + "your team is Out of Possession. Details of the tactic will appear "
        + "here when it has been selected.");
        
    }//Tactics

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngMentality = new javax.swing.ButtonGroup();
        btngInPossession = new javax.swing.ButtonGroup();
        btngOutOfPossession = new javax.swing.ButtonGroup();
        rbtnAttacking = new javax.swing.JRadioButton();
        rbtnDefensive = new javax.swing.JRadioButton();
        rbtnBalanced = new javax.swing.JRadioButton();
        txaMentalityDetails = new javax.swing.JTextArea();
        rbtnTikiTaka = new javax.swing.JRadioButton();
        rbtnShortPassing = new javax.swing.JRadioButton();
        rbtnFastBuildUp = new javax.swing.JRadioButton();
        txaInPossessionDetails = new javax.swing.JTextArea();
        rbtnTeamPress = new javax.swing.JRadioButton();
        rbtnCounterAttack = new javax.swing.JRadioButton();
        rbtnParkTheBus = new javax.swing.JRadioButton();
        txaOutOfPossessionDetails = new javax.swing.JTextArea();
        btnConfirm = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Tactics");
        setMaximumSize(new java.awt.Dimension(816, 691));
        setMinimumSize(new java.awt.Dimension(816, 691));
        setName("Tactics"); // NOI18N
        setPreferredSize(new java.awt.Dimension(816, 691));
        setResizable(false);
        getContentPane().setLayout(null);

        rbtnAttacking.setBackground(new java.awt.Color(0,0,0,0));
        btngMentality.add(rbtnAttacking);
        rbtnAttacking.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnAttacking.setText("Attacking");
        rbtnAttacking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAttackingActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnAttacking);
        rbtnAttacking.setBounds(40, 150, 160, 31);

        rbtnDefensive.setBackground(new java.awt.Color(0,0,0,0));
        btngMentality.add(rbtnDefensive);
        rbtnDefensive.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnDefensive.setText("Defensive");
        rbtnDefensive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDefensiveActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnDefensive);
        rbtnDefensive.setBounds(40, 180, 160, 31);

        rbtnBalanced.setBackground(new java.awt.Color(0,0,0,0));
        btngMentality.add(rbtnBalanced);
        rbtnBalanced.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnBalanced.setText("Balanced");
        rbtnBalanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBalancedActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnBalanced);
        rbtnBalanced.setBounds(40, 210, 160, 31);

        txaMentalityDetails.setEditable(false);
        txaMentalityDetails.setBackground(new Color (0, 0, 0, 0));
        txaMentalityDetails.setColumns(20);
        txaMentalityDetails.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txaMentalityDetails.setLineWrap(true);
        txaMentalityDetails.setRows(5);
        txaMentalityDetails.setWrapStyleWord(true);
        txaMentalityDetails.setBorder(null);
        txaMentalityDetails.setMaximumSize(new java.awt.Dimension(500, 100));
        txaMentalityDetails.setMinimumSize(new java.awt.Dimension(500, 100));
        getContentPane().add(txaMentalityDetails);
        txaMentalityDetails.setBounds(220, 160, 540, 80);

        rbtnTikiTaka.setBackground(new java.awt.Color(0,0,0,0));
        btngInPossession.add(rbtnTikiTaka);
        rbtnTikiTaka.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnTikiTaka.setText("Tiki-Taka");
        rbtnTikiTaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTikiTakaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnTikiTaka);
        rbtnTikiTaka.setBounds(40, 320, 160, 31);

        rbtnShortPassing.setBackground(new java.awt.Color(0,0,0,0));
        btngInPossession.add(rbtnShortPassing);
        rbtnShortPassing.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnShortPassing.setText("Short Passing ");
        rbtnShortPassing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnShortPassingActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnShortPassing);
        rbtnShortPassing.setBounds(40, 350, 160, 31);

        rbtnFastBuildUp.setBackground(new java.awt.Color(0,0,0,0));
        btngInPossession.add(rbtnFastBuildUp);
        rbtnFastBuildUp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnFastBuildUp.setText("Fast Build Up");
        rbtnFastBuildUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFastBuildUpActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnFastBuildUp);
        rbtnFastBuildUp.setBounds(40, 380, 160, 31);

        txaInPossessionDetails.setEditable(false);
        txaInPossessionDetails.setBackground(new Color (0, 0, 0, 0));
        txaInPossessionDetails.setColumns(20);
        txaInPossessionDetails.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txaInPossessionDetails.setLineWrap(true);
        txaInPossessionDetails.setRows(5);
        txaInPossessionDetails.setWrapStyleWord(true);
        txaInPossessionDetails.setBorder(null);
        txaInPossessionDetails.setMaximumSize(new java.awt.Dimension(500, 100));
        txaInPossessionDetails.setMinimumSize(new java.awt.Dimension(500, 100));
        getContentPane().add(txaInPossessionDetails);
        txaInPossessionDetails.setBounds(220, 330, 540, 80);

        rbtnTeamPress.setBackground(new java.awt.Color(0,0,0,0));
        btngOutOfPossession.add(rbtnTeamPress);
        rbtnTeamPress.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnTeamPress.setText("Team Press");
        rbtnTeamPress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTeamPressActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnTeamPress);
        rbtnTeamPress.setBounds(40, 490, 160, 31);

        rbtnCounterAttack.setBackground(new java.awt.Color(0,0,0,0));
        btngOutOfPossession.add(rbtnCounterAttack);
        rbtnCounterAttack.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnCounterAttack.setText("Counter Attack");
        rbtnCounterAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCounterAttackActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnCounterAttack);
        rbtnCounterAttack.setBounds(40, 520, 160, 31);

        rbtnParkTheBus.setBackground(new java.awt.Color(0,0,0,0));
        btngOutOfPossession.add(rbtnParkTheBus);
        rbtnParkTheBus.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        rbtnParkTheBus.setText("Park The Bus");
        rbtnParkTheBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnParkTheBusActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnParkTheBus);
        rbtnParkTheBus.setBounds(40, 550, 160, 31);

        txaOutOfPossessionDetails.setEditable(false);
        txaOutOfPossessionDetails.setBackground(new Color (0, 0, 0, 0));
        txaOutOfPossessionDetails.setColumns(20);
        txaOutOfPossessionDetails.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txaOutOfPossessionDetails.setLineWrap(true);
        txaOutOfPossessionDetails.setRows(5);
        txaOutOfPossessionDetails.setWrapStyleWord(true);
        txaOutOfPossessionDetails.setBorder(null);
        txaOutOfPossessionDetails.setMaximumSize(new java.awt.Dimension(500, 100));
        txaOutOfPossessionDetails.setMinimumSize(new java.awt.Dimension(500, 100));
        getContentPane().add(txaOutOfPossessionDetails);
        txaOutOfPossessionDetails.setBounds(220, 500, 540, 80);

        btnConfirm.setBackground(new java.awt.Color(153, 0, 255));
        btnConfirm.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm Tactics");
        btnConfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(290, 610, 250, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/9) Tactics.jpg"))); // NOI18N
        lblBackground.setRequestFocusEnabled(false);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 816, 672);
        lblBackground.getAccessibleContext().setAccessibleName("lblBackground");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    rbtnAttacking Action Performed Event:
    * Updates the Mentality Tactic.
    - Displays the relevant details of the Attacking Mentality.
    - Part of the radio button group Mentality.
    */
    private void rbtnAttackingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAttackingActionPerformed
        mentalityVal = true;
        mentality = League.Mentality.ATTACKING;
        txaMentalityDetails.setText("Your team will dominate the game when in "
        + "possession of the ball but can be vulnerable to strong offensive "
        + "opposition players.");
    }//GEN-LAST:event_rbtnAttackingActionPerformed
    
    /*
    rbtnDefensive Action Performed Event:
    * Updates the Mentality Tactic.
    - Displays the relevant details of the Defensive Mentality.
    - Part of the radio button group Mentality.
    */
    private void rbtnDefensiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDefensiveActionPerformed
        mentalityVal = true;
        mentality = League.Mentality.DEFENSIVE;
        txaMentalityDetails.setText("Your team will be stronger defensively but "
        + "may lack composure when attacking.");
    }//GEN-LAST:event_rbtnDefensiveActionPerformed
    
    /*
    rbtnBalanced Action Performed Event:
    * Updates the Mentality Tactic.
    - Displays the relevant details of the Balanced Mentality.
    - Part of the radio button group Mentality.
    */
    private void rbtnBalancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBalancedActionPerformed
        mentalityVal = true;
        mentality = League.Mentality.BALANCED;
        txaMentalityDetails.setText("Your team will profit offensively and "
        + "defensively and maintain a good balance between them.");
    }//GEN-LAST:event_rbtnBalancedActionPerformed

    /*
    rbtnTikiTaka Action Performed Event:
    * Updates the In Possession Tactic.
    - Displays the relevant details of the Tiki Taka In Possession Tactic.
    - Part of the radio button group InPossession.
    */
    private void rbtnTikiTakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTikiTakaActionPerformed
        inPosVal = true;
        inPossession = League.InPossession.TikiTaka;
        txaInPossessionDetails.setText("Players will be more expressive and "
        + "creative which can consequently result in defensive woes.");
    }//GEN-LAST:event_rbtnTikiTakaActionPerformed

    /*
    rbtnShortPassing Action Performed Event:
    * Updates the In Possession Tactic.
    - Displays the relevant details of the Short Passing In Possession Tactic.
    - Part of the radio button group InPossession.
    */
    private void rbtnShortPassingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnShortPassingActionPerformed
        inPosVal = true;
        inPossession = League.InPossession.ShortPassing;
        txaInPossessionDetails.setText("Composed and simple build up play that "
        + "will allow your team to attack efficiently and intelligently, "
        + "resulting in less mistakes and defensive errors.");
    }//GEN-LAST:event_rbtnShortPassingActionPerformed

    /*
    rbtnFastBuildUp Action Performed Event:
    * Updates the In Possession Tactic.
    - Displays the relevant details of the Fast Build Up In Possession Tactic.
    - Part of the radio button group InPossession.
    */
    private void rbtnFastBuildUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFastBuildUpActionPerformed
        inPosVal = true;
        inPossession = League.InPossession.FastBuildUp;
        txaInPossessionDetails.setText("An all out attack system where players "
        + "will dominate offensively but are extremely vulnerable when"
        + " possession is lost.");
    }//GEN-LAST:event_rbtnFastBuildUpActionPerformed

    /*
    rbtnTeamPress Action Performed Event:
    * Updates the Out of Possession Tactic.
    - Displays the relevant details of the Team Press Out of Possession Tactic.
    - Part of the radio button group OutOfPossession.
    */
    private void rbtnTeamPressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTeamPressActionPerformed
        outOfPosVal = true;
        outOfPossession = League.OutOfPossession.TeamPress;
        txaOutOfPossessionDetails.setText("Players will press opposition with "
        + "more intensity while being slightly less offensively minded.");
    }//GEN-LAST:event_rbtnTeamPressActionPerformed

    /*
    rbtnCounterAttack Action Performed Event:
    * Updates the Out of Possession Tactic.
    - Displays the relevant details of the Counter Attack Out of Possession Tactic.
    - Part of the radio button group OutOfPossession.
    */
    private void rbtnCounterAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCounterAttackActionPerformed
        outOfPosVal = true;
        outOfPossession = League.OutOfPossession.CounterAttack;
        txaOutOfPossessionDetails.setText("Players will use their own defensive "
        + "abilities to exploit the opposition's offensive weaknesses but will "
        + "be stronger in attack when possession is regained.");
    }//GEN-LAST:event_rbtnCounterAttackActionPerformed

    /*
    rbtnParkTheBus Action Performed Event:
    * Updates the Out of Possession Tactic.
    - Displays the relevant details of the Park The Bus Out of Possession Tactic.
    - Part of the radio button group OutOfPossession.
    */
    private void rbtnParkTheBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnParkTheBusActionPerformed
        outOfPosVal = true;
        outOfPossession = League.OutOfPossession.ParkTheBus;
        txaOutOfPossessionDetails.setText("The team will set up in a way that "
        + "prevents the opposing team to get through while keeping composure "
        + "when regaining possession.");
    }//GEN-LAST:event_rbtnParkTheBusActionPerformed

    /*
    btnConfirm Action Performed Event Method:
    * Performs a presence validity check and ensures that a selection has been
      made for all 3 tactics.
        > First level is also done by using button group components to
          ensure that only one option is selected for each tactic.
    - Validates selections and prompts the user where selections have not been
      made.
    - If validity is fine, the Tournament playMatch btn is made visible and
      the Tactics screen closes.
    */
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        //Validation:
        String unselectedTactic = "";
        
        if (mentalityVal == false || inPosVal == false || outOfPosVal == false){
            primaryValidation = false;
            
            if (mentalityVal == false){
                unselectedTactic += " - Mentality \n";
            }//if then
            if (inPosVal == false){
                unselectedTactic += " - In Possession Tactic \n";
            }//if then
            if (outOfPosVal == false){
                unselectedTactic += " - Out of Possession Tactic \n";
            }//if then
        } else{
            primaryValidation = true;
        }//else 
        
        if (primaryValidation == true){
            Tournament.btnPlayMatch.setVisible(true);
            this.dispose();
        }//if then
        else if (primaryValidation == false){
            JOptionPane.showMessageDialog (null, "The following tactics have not "
            + "been selected: \n" + unselectedTactic, "Unselected Tactics!", 
            JOptionPane.ERROR_MESSAGE );
        }//else if
    }//GEN-LAST:event_btnConfirmActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tactics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tactics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tactics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tactics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tactics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.ButtonGroup btngInPossession;
    private javax.swing.ButtonGroup btngMentality;
    private javax.swing.ButtonGroup btngOutOfPossession;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JRadioButton rbtnAttacking;
    private javax.swing.JRadioButton rbtnBalanced;
    private javax.swing.JRadioButton rbtnCounterAttack;
    private javax.swing.JRadioButton rbtnDefensive;
    private javax.swing.JRadioButton rbtnFastBuildUp;
    private javax.swing.JRadioButton rbtnParkTheBus;
    private javax.swing.JRadioButton rbtnShortPassing;
    private javax.swing.JRadioButton rbtnTeamPress;
    private javax.swing.JRadioButton rbtnTikiTaka;
    private javax.swing.JTextArea txaInPossessionDetails;
    private javax.swing.JTextArea txaMentalityDetails;
    private javax.swing.JTextArea txaOutOfPossessionDetails;
    // End of variables declaration//GEN-END:variables
}

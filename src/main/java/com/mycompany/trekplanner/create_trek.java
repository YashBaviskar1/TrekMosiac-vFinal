/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author main
 */
public class create_trek extends javax.swing.JFrame {

    
    public create_trek() {
        initComponents();
        
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcreate_trek = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        jtextlast_name = new javax.swing.JTextField();
        jtextemail = new javax.swing.JTextField();
        jtextuser_name = new javax.swing.JTextField();
        jtextpass_word = new javax.swing.JTextField();
        jbtregister = new javax.swing.JButton();
        jtextfirstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        jtextpassword = new javax.swing.JTextField();
        jtextusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, null));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcreate_trek.setText("fg");
        jPanel1.add(jcreate_trek, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 75, 314, 388));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 177, 176, 275));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 8, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregister.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        lblregister.setText("     Registeration");
        lblregister.setToolTipText("");
        jPanel2.add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 14, 163, 37));

        jtextlast_name.setText("Last Name");
        jtextlast_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextlast_nameActionPerformed(evt);
            }
        });
        jPanel2.add(jtextlast_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 271, 41));

        jtextemail.setText("Email");
        jPanel2.add(jtextemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 216, 271, 44));

        jtextuser_name.setText("Username");
        jPanel2.add(jtextuser_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 287, 271, 43));

        jtextpass_word.setText("password");
        jPanel2.add(jtextpass_word, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 357, 271, 43));

        jbtregister.setText("register");
        jPanel2.add(jbtregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 418, 124, 43));

        jtextfirstname.setText("first name");
        jtextfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfirstnameActionPerformed(evt);
            }
        });
        jPanel2.add(jtextfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 63, 273, 47));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/trekplanner/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 540));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 390, 480));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 8, true));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogin.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(255, 255, 255));
        lbllogin.setText("       login");
        jPanel3.add(lbllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 98, 41));

        lblpassword.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Password :");
        jPanel3.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 109, 41));

        lblusername.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Username :");
        jPanel3.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 109, 41));
        jPanel3.add(jtextpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 127, 41));
        jPanel3.add(jtextusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 112, 127, 41));

        jButton1.setText("jButton1");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 135, 51));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 8, -1, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/trekplanner/bgmtresizeddddd.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trek_planner/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(1080, 720));
        jLabel6.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel6.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 370, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/trekplanner/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1190, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextlast_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextlast_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextlast_nameActionPerformed

    private void jtextfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfirstnameActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(create_trek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create_trek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create_trek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create_trek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create_trek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtregister;
    private javax.swing.JLabel jcreate_trek;
    private javax.swing.JTextField jtextemail;
    private javax.swing.JTextField jtextfirstname;
    private javax.swing.JTextField jtextlast_name;
    private javax.swing.JTextField jtextpass_word;
    private javax.swing.JTextField jtextpassword;
    private javax.swing.JTextField jtextuser_name;
    private javax.swing.JTextField jtextusername;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregister;
    private javax.swing.JLabel lblusername;
    // End of variables declaration//GEN-END:variables
}

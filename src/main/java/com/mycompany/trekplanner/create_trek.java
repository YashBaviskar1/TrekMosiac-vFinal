/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trekplanner;

import javax.swing.JOptionPane;

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
        jbtregister = new javax.swing.JButton();
        jtextfirstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        jtextusername = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtextpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(null);

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
        lblregister.setForeground(new java.awt.Color(255, 255, 255));
        lblregister.setText("     Registeration");
        lblregister.setToolTipText("");
        jPanel2.add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 14, 163, 37));

        jtextlast_name.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jtextlast_name.setForeground(new java.awt.Color(204, 204, 204));
        jtextlast_name.setText("Last Name");
        jtextlast_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextlast_nameActionPerformed(evt);
            }
        });
        jPanel2.add(jtextlast_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 271, 41));

        jtextemail.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jtextemail.setForeground(new java.awt.Color(204, 204, 204));
        jtextemail.setText("someone@example.com\n");
        jtextemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextemailActionPerformed(evt);
            }
        });
        jPanel2.add(jtextemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 271, 44));

        jtextuser_name.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jtextuser_name.setForeground(new java.awt.Color(204, 204, 204));
        jtextuser_name.setText("Username");
        jPanel2.add(jtextuser_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 271, 43));

        jbtregister.setBackground(new java.awt.Color(153, 153, 153));
        jbtregister.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jbtregister.setForeground(new java.awt.Color(255, 255, 255));
        jbtregister.setText("register");
        jbtregister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtregisterActionPerformed(evt);
            }
        });
        jPanel2.add(jbtregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 418, 124, 43));

        jtextfirstname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jtextfirstname.setForeground(new java.awt.Color(204, 204, 204));
        jtextfirstname.setText("First Name ");
        jtextfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfirstnameActionPerformed(evt);
            }
        });
        jPanel2.add(jtextfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 273, 47));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email :\n");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, -1));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 270, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgmtresizeddddd.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -70, 1100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 390, 480));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 8, true));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        lbllogin.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(255, 255, 255));
        lbllogin.setText("       login");
        jPanel3.add(lbllogin);
        lbllogin.setBounds(130, 40, 98, 41);

        lblpassword.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Password :");
        jPanel3.add(lblpassword);
        lblpassword.setBounds(40, 170, 109, 41);

        lblusername.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Username :");
        jPanel3.add(lblusername);
        lblusername.setBounds(40, 110, 109, 41);

        jtextusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextusernameActionPerformed(evt);
            }
        });
        jPanel3.add(jtextusername);
        jtextusername.setBounds(140, 110, 130, 41);

        loginButton.setBackground(new java.awt.Color(153, 153, 153));
        loginButton.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("login");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel3.add(loginButton);
        loginButton.setBounds(140, 240, 110, 50);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(311, 8, 0, 32);
        jPanel3.add(jtextpassword);
        jtextpassword.setBounds(140, 170, 130, 40);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(1080, 720));
        jLabel6.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel6.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 1000, 630);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(250, 140, 390, 540);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 370, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgmtresizeddddd.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1080, 740));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextlast_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextlast_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextlast_nameActionPerformed

    private void jtextfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfirstnameActionPerformed

    private void jtextemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextemailActionPerformed

    private void jtextusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextusernameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtextusernameActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = jtextusername.getText();
        String password = jtextpassword.getText();
        if("user".equals(username) && "123456".equals(password))
        {
        create_trek.this.dispose();
        createtrekA join_trek = new createtrekA();
        join_trek.setLocationRelativeTo(null); 
        join_trek.setVisible(true);
        } 
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jbtregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtregisterActionPerformed
        // TODO add your handling code here:
        create_trek.this.dispose();
        createtrek new_trek = new createtrek();
        new_trek.setLocationRelativeTo(null);
        new_trek.setVisible(true); 
    }//GEN-LAST:event_jbtregisterActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbtregister;
    private javax.swing.JLabel jcreate_trek;
    private javax.swing.JTextField jtextemail;
    private javax.swing.JTextField jtextfirstname;
    private javax.swing.JTextField jtextlast_name;
    private javax.swing.JPasswordField jtextpassword;
    private javax.swing.JTextField jtextuser_name;
    private javax.swing.JTextField jtextusername;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregister;
    private javax.swing.JLabel lblusername;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}

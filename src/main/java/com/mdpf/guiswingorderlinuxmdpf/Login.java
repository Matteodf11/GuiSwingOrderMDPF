/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mdpf.guiswingorderlinuxmdpf;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author matdipfor
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private ArrayList<User> users = new ArrayList();
    private boolean loginSuccessful = false;

    public Login() {
        super("Login");
        users.add(new User("admin", "admin"));
        setLocationRelativeTo(null);
        setUndecorated(true);
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(245, 222, 179));

    }

    public boolean isLoginSuccessful() {
        return loginSuccessful;
    }

    public void setLoginSuccessful(boolean loginSuccessful) {
        this.loginSuccessful = loginSuccessful;
    }

    public void addUser(User newUser) {
        users.add(newUser);
    }

    public ArrayList<User> usuarios() {
        return users;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernametextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordtextfield = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(139, 69, 19));
        jLabel1.setText("LOG IN");

        jLabel2.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        jLabel2.setText("UserName");

        jLabel3.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        btnlogin.setFont(new java.awt.Font("Noto Mono", 1, 14)); // NOI18N
        btnlogin.setFont(new java.awt.Font("Noto Mono", 0, 12)); // NOI18N
        btnlogin.setFocusPainted(false);
        btnlogin.setBackground(new java.awt.Color(255, 165, 0));
        btnlogin.setForeground(new java.awt.Color(0, 0, 0));
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.setText("LOG IN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnsignup.setFont(new java.awt.Font("Noto Mono", 1, 14)); // NOI18N
        btnsignup.setFont(new java.awt.Font("Noto Mono", 0, 12)); // NOI18N
        btnsignup.setFocusPainted(false);
        btnsignup.setBackground(new java.awt.Color(204, 119, 34));
        btnsignup.setForeground(new java.awt.Color(0, 0, 0));
        btnsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignup.setText("SIGN UP");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(usernametextfield)
                            .addComponent(jLabel3)
                            .addComponent(passwordtextfield)
                            .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(btnsignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnsignup)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        for (User user : users) {
            if (user.getUser().equals(this.usernametextfield.getText()) && user.getPassword().equals(passwordtextfield.getText())) {
                setLoginSuccessful(true);
                this.dispose();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "This user does not exist", "Unexisting User", JOptionPane.ERROR_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:this.setAlwaysOnTop(false);
        SignUp signUp = new SignUp(this);
        signUp.setLocationRelativeTo(this);
        signUp.setVisible(true);
        signUp.setAlwaysOnTop(Boolean.TRUE);

    }//GEN-LAST:event_btnsignupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame mainFrame = new JFrame("Main Frame");
            mainFrame.setSize(400, 300);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);

            Login login = new Login();
            login.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField passwordtextfield;
    private javax.swing.JTextField usernametextfield;
    // End of variables declaration//GEN-END:variables
}

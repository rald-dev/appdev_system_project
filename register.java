
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }
Connection con;
PreparedStatement pst;
ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_reg = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        txt_confirm = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Confirm Pass");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 166, -1, -1));

        btn_reg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reg.setText("REGISTER");
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("x");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 11, -1, -1));

        txt_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 140, -1));

        txt_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 140, -1));

        txt_confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\HMS ICON\\registerbackfinal.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed
        String username = txt_user.getText();
        String password = txt_pass.getText();
        
        if (txt_user.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Please Enter the Username!");
        } else if (txt_pass.getText().length()==0){
             JOptionPane.showMessageDialog(null, "Please Enter the Password!");
        } else if (txt_pass.getText().equals(txt_confirm.getText())== false)  {
             JOptionPane.showMessageDialog(null, "Password doest not matched!");
        } else {
          
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/patientrecord","root","");
                    pst = con.prepareStatement("insert into user(username,password)values(?,?)");
                    pst = con.prepareStatement("insert into user(username,password)values(?,?)");
                    pst.setString(1, username);
                    pst.setString(2, password);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "User Created..!");
                    txt_user.setText("");
                    txt_pass.setText("");
                    txt_confirm.setText("");
                    txt_user.requestFocus();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
    }//GEN-LAST:event_btn_regActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
       
                txt_user.setText("");
                txt_pass.setText(""); 
                txt_confirm.setText("");
                txt_user.requestFocus();
        
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_reg;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txt_confirm;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}

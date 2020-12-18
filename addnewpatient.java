
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class addnewpatient extends javax.swing.JFrame {

Connection con;
PreparedStatement pst;

    public addnewpatient() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        cbox = new javax.swing.JComboBox<>();
        txt_address = new javax.swing.JTextField();
        txt_illness = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 83, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 124, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sex");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 206, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 247, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Illness");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 281, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        txt_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 80, 159, -1));

        txt_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 121, 159, -1));

        txt_age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 162, 46, -1));

        cbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 203, 95, -1));

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 244, 232, -1));

        txt_illness.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_illness, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 278, 159, -1));

        txt_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 37, -1));

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 332, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 332, -1, -1));

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_save.setText("SAVE UPDATE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        btn_home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 0, 0));
        btn_home.setText("X");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 21, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\HMS ICON\\addnewback.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
    try {
        String fname = txt_fname.getText();
        String lname = txt_lname.getText();
        String age = txt_age.getText();
        String sex = (String)cbox.getSelectedItem();
        String address = txt_address.getText();
        String illness = txt_illness.getText();
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/patientrecord","root","");
        //down here its okay if we only get the name since it is the first data we need to fill-up     
        if (txt_fname.getText().length()==0 || txt_lname.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter atleast name Data !");
               txt_fname.setText("");
               txt_lname.setText("");
               txt_age.setText("");
               cbox.setSelectedIndex(0);
               txt_address.setText("");
               txt_illness.setText("");
               txt_fname.requestFocus();
        } else {
        pst = con.prepareStatement("insert into addpatient(fname,lname,age,sex,address,illness)values(?,?,?,?,?,?)");
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, age);
                pst.setString(4, sex);
                pst.setString(5, address);
                pst.setString(6, illness);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "New Patient Record Created");
                setVisible(false);
                new home().setVisible(true);              
               
        } 
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(addnewpatient.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(addnewpatient.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        
        txt_fname.setText("");
        txt_lname.setText("");
        txt_age.setText("");
        cbox.setSelectedIndex(0);
        txt_address.setText("");
        txt_illness.setText("");
        txt_fname.requestFocus();
        
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
       
        setVisible(false);
        new home().setVisible(true);
        
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
         try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/patientrecord","root","");
         String sql = ("UPDATE addpatient SET fname=?,lname=?,age=?,sex=?,address=?,illness=? WHERE id=?");
              pst = con.prepareStatement(sql);
              pst.setString(1,  txt_fname.getText());
              pst.setString(2, txt_lname.getText());
              pst.setString(3,  txt_age.getText());
              pst.setString(4, (String) cbox.getSelectedItem());
              pst.setString(5, txt_address.getText());
              pst.setString(6, txt_illness.getText());
              pst.setString(7, txt_id.getText());
              
              pst.executeUpdate();
               JOptionPane.showMessageDialog(null, "Updated Patient Record !");
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(addnewpatient.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(addnewpatient.class.getName()).log(Level.SEVERE, null, ex);
    }
        setVisible(false);
        new patient_table().setVisible(true);
        
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_illness;
    private javax.swing.JTextField txt_lname;
    // End of variables declaration//GEN-END:variables
}

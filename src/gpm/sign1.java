/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author raj
 */
public class sign1 extends javax.swing.JFrame {

    /**
     * Creates new form sign1
     */
    public sign1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        q8 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        q5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        q9 = new javax.swing.JTextField();
        q6 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        q4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 245, 245));
        jPanel2.setLayout(null);

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, 14));
        jLabel2.setText("Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 100, 38, 16);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Aadhar number");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 140, 122, 17);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(108, 184, 66, 17);

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(427, 322, 0, 0);
        jPanel2.add(q2);
        q2.setBounds(260, 80, 154, 30);
        jPanel2.add(q1);
        q1.setBounds(260, 130, 154, 30);
        jPanel2.add(q8);
        q8.setBounds(261, 176, 154, 30);
        jPanel2.add(q3);
        q3.setBounds(261, 229, 154, 30);
        jPanel2.add(q7);
        q7.setBounds(260, 480, 154, 30);

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(383, 597, 56, 32);

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(108, 237, 59, 17);

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel10.setText("age");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(110, 340, 29, 17);
        jPanel2.add(q5);
        q5.setBounds(260, 330, 154, 30);

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel12.setText("Income");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(100, 380, 57, 17);

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 1, 1));
        jLabel16.setText("Occupation");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(90, 430, 89, 31);
        jPanel2.add(q9);
        q9.setBounds(260, 430, 154, 30);

        q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q6ActionPerformed(evt);
            }
        });
        jPanel2.add(q6);
        q6.setBounds(260, 380, 154, 30);

        jLabel18.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel18.setText("Number of dependents");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 490, 183, 17);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 290, 33, 16);
        jPanel2.add(q4);
        q4.setBounds(260, 280, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpm/0144-01_users_sign_up_thumbnail.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-40, 0, 490, 60);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 460, 670));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpm/cow.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-430, 10, 860, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a1=q1.getText();
        String a2=q2.getText();
        String a3=q3.getText();
        String a4=q4.getText();
        String a5=q5.getText();
        String a6=q6.getText();
        String a7=q7.getText();
        String a8=q8.getText();
        String a9=q9.getText();
        

        //  int a=pass.compareTo(rpass);
        //System.out.println(a);
        // if(a==0)
        //  {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/villagedb","sachin","NeverSettle!97");
                Statement stmt=(Statement) con.createStatement();
                String query="INSERT INTO villager VALUES('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"');";
                stmt.executeUpdate(query);
                int i=Integer.parseInt(a5);
                if(i < 14)
                {
                    under_14 t1=new under_14();
                    t1.setVisible(true);
                    
                }
              

            }catch(Exception e)
            {
                System.out.println(e);
            }
            setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(sign1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JTextField q7;
    private javax.swing.JTextField q8;
    private javax.swing.JTextField q9;
    // End of variables declaration//GEN-END:variables
}

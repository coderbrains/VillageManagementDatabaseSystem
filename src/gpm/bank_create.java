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
public class bank_create extends javax.swing.JFrame {

    /**
     * Creates new form bank_create
     */
    public bank_create() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 531));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(40, 26, 68));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Create");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel9)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel9)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 345, 531);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setLayout(null);

        jLabel1.setText("Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(83, 48, 46, 20);

        jLabel2.setText("Aadhar no");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(83, 91, 80, 20);

        jLabel3.setText("loan type");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(83, 137, 90, 20);

        jLabel4.setText("Account Type");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 180, 90, 20);

        jLabel5.setText("Loan intrest");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(83, 236, 90, 20);

        jLabel6.setText("SB Account Money");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(83, 286, 120, 20);

        jLabel7.setText("FD Account Money");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 340, 120, 20);

        jLabel8.setText("RD Account Type ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(80, 390, 110, 20);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(220, 43, 120, 30);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(220, 90, 120, 30);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(220, 130, 120, 30);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(220, 180, 120, 30);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(220, 230, 120, 30);
        jPanel2.add(jTextField6);
        jTextField6.setBounds(220, 280, 120, 30);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(220, 330, 120, 30);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(220, 380, 120, 30);

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(290, 470, 56, 32);

        jLabel10.setText("Time On Loan");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(80, 430, 100, 20);
        jPanel2.add(jTextField9);
        jTextField9.setBounds(220, 430, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(335, -1, 390, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        String name=jTextField1.getText();
        String aadhar=jTextField2.getText();
        String loantype=jTextField3.getText();
        String accounttype=jTextField4.getText();
        String loani=jTextField5.getText();
        String sb=jTextField6.getText();
        String fd=jTextField7.getText();
        String rd=jTextField8.getText();
        String tol=jTextField9.getText();
        
        try
       {
            int a=0;
           Class.forName("java.sql.DriverManager");
          Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/villagedb","sachin","NeverSettle!97");
           Statement stmt=(Statement) con.createStatement();
           String query="INSERT INTO bank VALUES('"+name+"','"+aadhar+"','"+loantype+"','"+accounttype+"','"+loani+"','"+sb+"','"+fd+"','"+rd+"','"+tol+"');";
           stmt.executeUpdate(query);
           
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
            java.util.logging.Logger.getLogger(bank_create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bank_create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bank_create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bank_create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bank_create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

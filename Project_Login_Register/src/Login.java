
import java.awt.Frame;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Pj
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //setSize(588,370);
        //setLocation(380,180);
        setBounds(380,180,575,360);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setForeground(new java.awt.Color(102, 0, 102));
        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(295, 101, 183, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(295, 187, 181, 30);

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sigh Up");
        getContentPane().add(jButton1);
        jButton1.setBounds(326, 237, 100, 27);

        jLabel2.setBackground(new java.awt.Color(153, 0, 153));
        jLabel2.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(336, 60, 80, 23);

        jLabel5.setBackground(new java.awt.Color(102, 0, 102));
        jLabel5.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(337, 146, 73, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user-32.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(298, 60, 32, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-password-32.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(299, 139, 32, 30);

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel7.setText("Forgot Username/Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(295, 282, 217, 23);

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel6.setText("Create an new account");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(36, 241, 179, 23);

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sigh In");
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 281, 100, 27);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 0));
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(271, 0, 300, 36);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/697561.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 570, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

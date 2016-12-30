/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.attendance;

import client.attendance.manualAttendanceClient;
import middle.attendance.manualAttendanceMiddle;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;


import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Nuwan-PC
 */
public class manualAttendanceClient extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    String satt;

    /**
     * Creates new form manualAttendanceClient
     */
    public manualAttendanceClient() {
        initComponents();
        JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
        timeSpinner.setEditor(timeEditor);
        timeSpinner.setValue(new Date());
      
      
          

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateComponentFormatter1 = new org.jdatepicker.impl.DateComponentFormatter();
        buttonGroup1 = new javax.swing.ButtonGroup();
        headerLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        dateJpicker = new org.jdesktop.swingx.JXDatePicker();
        inH = new javax.swing.JSpinner();
        inM = new javax.swing.JSpinner();
        oH = new javax.swing.JSpinner();
        oM = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("MANUAL ATTENDANCE");
        getContentPane().add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        getContentPane().add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 102, -1));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel5.setText("IN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel6.setText("OUT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        nameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sri", "pasan", "nimal", "kamal", "ksun" }));
        getContentPane().add(nameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 142, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));
        getContentPane().add(dateJpicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        inH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        inH.setEnabled(false);
        inH.setMaximumSize(new java.awt.Dimension(59, 59));
        inH.setMinimumSize(new java.awt.Dimension(0, 0));
        getContentPane().add(inH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 50, -1));

        inM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        inM.setEnabled(false);
        getContentPane().add(inM, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 50, -1));

        oH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        oH.setEnabled(false);
        getContentPane().add(oH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 50, -1));

        oM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        oM.setEnabled(false);
        getContentPane().add(oM, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 50, -1));

        jLabel7.setText("H");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel8.setText("Min");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel9.setText("H");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel10.setText("Min");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jCheckBox1.setText("IN");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jCheckBox2.setText("OUT");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = idText.getText();
        String name = nameCombo.getName();
        Date dateT = dateJpicker.getDate();
        
                
        //in out time 
        int inHour = (Integer) inH.getValue();
        int inMinute = (Integer) inM.getValue();
    int outHour = (Integer) oH.getValue();
        int outMinute = (Integer) oM.getValue();
        
        //appending
        String inTime = inHour +":"+ inMinute;
        String outTime = outHour +":"+ outMinute;
        
        
        
        manualAttendanceMiddle m = new manualAttendanceMiddle();
        m.manualAttendance(id, name, dateT, inTime, outTime);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
          inH.setEnabled(true);
          inM.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
          oH.setEnabled(true);
          oM.setEnabled(true);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(manualAttendanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manualAttendanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manualAttendanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manualAttendanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manualAttendanceClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private org.jdesktop.swingx.JXDatePicker dateJpicker;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JSpinner inH;
    private javax.swing.JSpinner inM;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> nameCombo;
    private javax.swing.JSpinner oH;
    private javax.swing.JSpinner oM;
    // End of variables declaration//GEN-END:variables
}
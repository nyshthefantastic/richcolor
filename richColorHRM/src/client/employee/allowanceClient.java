/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.employee;

import middle.employee.allowanceMiddle;
import common.helperFunctions;
import common.validations;
import common.message;
import java.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Achala Kavinda
 */
public class allowanceClient extends javax.swing.JFrame {

    /**
     * Creates new form allowanceClient
     */
    allowanceMiddle allowanceMiddle;
    Date dt;
    boolean tabletype;
    SimpleDateFormat Formater;
    helperFunctions hp;
    validations validater;
    
    public allowanceClient() {
        initComponents();
        tabletype=true;
        feildIntialization();
        allowanceMiddle = new allowanceMiddle();
        dt = new Date();
        Formater = new SimpleDateFormat("yyyy-MM-dd");
        hp = new helperFunctions();
        validater = new validations();
        InitialEmployeeTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        epfNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        employeeName = new javax.swing.JTextField();
        showAllAllowance = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        amountAllowance = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchTextFeild = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Tab = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        allowanceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("EPF Number");

        jLabel3.setText("Employee Name");

        jLabel4.setText("Date");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel1.setText("Type");

        jLabel5.setText("Amount");

        edit.setText("Edit");

        reset.setText("Rest");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        showAllAllowance.setText("Show All Allowance");
        showAllAllowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllAllowanceActionPerformed(evt);
            }
        });

        jLabel7.setText("Totall Amount of Allowance :");

        amountAllowance.setText("0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(epfNo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(employeeName))))
                    .addComponent(showAllAllowance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(amountAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reset)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountAllowance))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(edit)
                            .addComponent(reset)
                            .addComponent(showAllAllowance))))
                .addContainerGap())
        );

        searchTextFeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFeildKeyReleased(evt);
            }
        });

        SearchBtn.setText("Search");

        jLabel6.setText("Search by Customer or EPF Number");

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EPF", "First Name", "Surname", "NIC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeTable);
        if (EmployeeTable.getColumnModel().getColumnCount() > 0) {
            EmployeeTable.getColumnModel().getColumn(0).setResizable(false);
            EmployeeTable.getColumnModel().getColumn(1).setResizable(false);
            EmployeeTable.getColumnModel().getColumn(2).setResizable(false);
            EmployeeTable.getColumnModel().getColumn(3).setResizable(false);
        }

        Tab.addTab("Employee", jScrollPane1);

        allowanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Type", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(allowanceTable);
        if (allowanceTable.getColumnModel().getColumnCount() > 0) {
            allowanceTable.getColumnModel().getColumn(0).setResizable(false);
            allowanceTable.getColumnModel().getColumn(1).setResizable(false);
            allowanceTable.getColumnModel().getColumn(2).setResizable(false);
        }

        Tab.addTab("Allowance", jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tab)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(searchTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tab, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        boolean addValidator=false;
        if(!amount.getText().isEmpty()){
            if(validater.NumberValidatiion(amount.getText())){
                addValidator=true;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Amount Input Feild Empty","ALERT",JOptionPane.WARNING_MESSAGE);
        }
        if(addValidator){
                 if(insertAllowance()){    
                     JOptionPane.showMessageDialog(null,"New record added successfully","ALERT",JOptionPane.WARNING_MESSAGE);
                     InitialAllowanceTable();
                     Tab.setSelectedIndex(1);
                 }
        }
        
        
    }//GEN-LAST:event_addActionPerformed

    private void searchTextFeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFeildKeyReleased
        Tab.setSelectedIndex(0);
        String value = searchTextFeild.getText();
        if(tabletype){
            if(value.isEmpty()){
            System.out.println("empty");
            InitialEmployeeTable();
            }else{
                searchEmployee(value);
            }
        }
    }//GEN-LAST:event_searchTextFeildKeyReleased

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked
        int selectedRow=EmployeeTable.getSelectedRow();
        if(tabletype){
            if(selectedRow!=-1){
                selectEmployeeInitial(selectedRow); 
                InitialAllowanceTable();
            }
        }
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void showAllAllowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllAllowanceActionPerformed
        InitialAllowanceTable();
        Tab.setSelectedIndex(1);
    }//GEN-LAST:event_showAllAllowanceActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        epfNo.setText("");
        employeeName.setText("");
        amount.setText("");
        datePicker.setDate(dt);
        searchTextFeild.setText("");
        Tab.setSelectedIndex(0);
        amountAllowance.setText("0000");
        allowanceMiddle.removeTableRow(allowanceTable);
        InitialEmployeeTable();
        reset.setEnabled(false);
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(allowanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allowanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allowanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allowanceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allowanceClient().setVisible(true);
            }
        });
    }
    
    
    
   
    
    // Initializing feilds
    private void feildIntialization(){
        //intial feild to empty
        employeeName.setText("");
        epfNo.setText("");
        amount.setText("");
        
        //intial feild to uneditable       
        employeeName.setEditable(false);
        epfNo.setEditable(false);
        amount.setEditable(false);
        datePicker.setEditable(false);
        typeComboBox.setEnabled(false);
        typeComboBox.setEditable(false);
        add.setEnabled(false);
        edit.setEnabled(false);
        reset.setEnabled(false);    
        showAllAllowance.setEnabled(false);
    }
    
    //initialize employee table when startup
    private void InitialEmployeeTable(){
       String sql ="SELECT * FROM employee";
       ResultSet rs=allowanceMiddle.rs(sql);
       String [] dbCols={"epfNo","fName","lName","nic"};
       allowanceMiddle.Table(EmployeeTable, sql,dbCols);
    }
    
    //initialize allowance table
    public void InitialAllowanceTable(){
        int id = 0;
        String empNo = epfNo.getText();
        String sql="Select id from employee where epfNo="+empNo+"";
        ResultSet rs = allowanceMiddle.rs(sql);
        try{
            while(rs.next()){
                id = Integer.parseInt(rs.getString("id"));
                break;
            }
            sql="Select date,type,amount from allowance where employeeId="+id+" ORDER BY id DESC";
            String [] col={"date","type","amount"};
            allowanceMiddle.Table(allowanceTable,sql,col);
        }catch(Exception e){
            System.out.println("initial allowance table :" +e);
        }
    }
    
    //Employee Search
    private void searchEmployee(String elmVal){
       String sql ="SELECT * FROM employee where epfNo like '"+elmVal+"%' "
               + "or fName like '"+elmVal+"%'"
               + "or lName like '"+elmVal+"%'";
       
       ResultSet rs=allowanceMiddle.rs(sql);
       String [] dbCols={"epfNo","fName","lName","nic"};
       allowanceMiddle.Table(EmployeeTable, sql,dbCols);
    }
    
    //select employee
    private void selectEmployeeInitial(int selectedRow){
            String empfNo = EmployeeTable.getValueAt(selectedRow, 0).toString();
            String Name = EmployeeTable.getValueAt(selectedRow, 1).toString()
                    +" "+EmployeeTable.getValueAt(selectedRow, 2).toString();
            epfNo.setText("");
            employeeName.setText("");
            amount.setText("");            
            datePicker.setDate(dt);            
            typeCombo(true);
            
            epfNo.setText(empfNo);
            employeeName.setText(Name);
            add.setEnabled(true);
            reset.setEnabled(true);
            datePicker.setEditable(true);
            showAllAllowance.setEnabled(true);
            amount.setEditable(true);
            totalAmountAllowance();
    }
    
    //initial type selecting combo box
    private void typeCombo(boolean status){
        typeComboBox.removeAllItems();
        if(status){
            typeComboBox.addItem("Travelling");
            typeComboBox.addItem("Production");
            typeComboBox.addItem("Festival");
            typeComboBox.addItem("Attendence");
            typeComboBox.setEnabled(true);
        }else{            
            typeComboBox.setEnabled(false);
        }
    }
    
    //inserting allowance to data base
    private boolean insertAllowance(){
        boolean status=false;
        int id=0;
        String sql = "Select id from employee where epfNo='"+epfNo.getText()+"'";
        String date = Formater.format(datePicker.getDate());
        String type = typeComboBox.getSelectedItem().toString();
        String amount =this.amount.getText();
        ResultSet rs = allowanceMiddle.rs(sql);
        try{
            while(rs.next()){
                id=Integer.parseInt(rs.getString("id"));
                break;
            }
        }catch(Exception e){
            System.out.println(e);
        }
       String Insertsql="INSERT INTO `allowance` (`date`, `type`, `amount`, `employeeId`) VALUES ('"+date+"', '"+type+"', '"+amount+"', '"+id+"');";
        status=allowanceMiddle.insertQuery(Insertsql);
        totalAmountAllowance();
       return status;
    }
    
    
    //get total amount of allowance of selected employee
    private void totalAmountAllowance(){
        int id=0;
        String sql = "Select id from employee where epfNo='"+epfNo.getText()+"'";
        ResultSet rs = allowanceMiddle.rs(sql);
        try{
            while(rs.next()){
                id=Integer.parseInt(rs.getString("id"));
                break;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        sql ="SELECT SUM(amount)  AS total  FROM allowance WHERE employeeId='"+id+" ' ";
        amountAllowance.setText("0000");
    try{
        rs =allowanceMiddle.rs(sql);
            while(rs.next()){
                if(rs.getString(1)!=null){
                 amountAllowance.setText(rs.getString(1));
                }               
            }
            }catch(Exception e){
              System.out.println("totalAmountAllowance"+e);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JButton add;
    private javax.swing.JTable allowanceTable;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amountAllowance;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JButton edit;
    private javax.swing.JTextField employeeName;
    private javax.swing.JTextField epfNo;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JTextField searchTextFeild;
    private javax.swing.JButton showAllAllowance;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables
}

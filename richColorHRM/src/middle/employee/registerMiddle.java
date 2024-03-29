/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middle.employee;

import client.employee.registerClient;
import common.dbconnct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import common.validations;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author U Computers
 */
public class registerMiddle {

    Connection con = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;

    public registerMiddle() {

        con = dbconnct.connect();
    }

    public void registerEmployee(String fName, String lName, String cNum, String nic, String dob, String gender, String bank, String acNum, double bSalary, String category, String designation, String department, String year, String status) {

        String nyear = getAge(year);

        Date date = new Date();
        String modifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        boolean valid = validateRegister(fName, lName, cNum, nic, dob, gender, bank, acNum, bSalary, category, designation, department, nyear);

        if (valid == true) {
            try {
                String q = "INSERT INTO employeeregister(fName,lName,contactNo,nic,dob,gender,bank,accountNo,bSalary,category,designation,department,age,joinDate,status) VALUES ('" + fName + "','" + lName + "','" + cNum + "','" + nic + "','" + dob + "','" + gender + "','" + bank + "','" + acNum + "','" + bSalary + "','" + category + "','" + designation + "','" + department + "','" + nyear + "','" + modifiedDate + "','" + status + "')";

                pst = con.prepareStatement(q);
                pst.execute();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

   

    public String getAge(String year) {

        Calendar now = Calendar.getInstance();
        int yeare = now.get(Calendar.YEAR);
        String yearInString = String.valueOf(yeare);

        int x = Integer.parseInt(yearInString) - Integer.parseInt(year);
        String xyear = String.valueOf(x);
        return xyear;
    }

    public boolean validateRegister(String fName, String lName, String cNum, String nic, String dob, String gender, String bank, String acNum, double bSalary, String category, String designation, String department, String nyear) {
        validations v = new validations();
        boolean fieldEmpty = v.checkEmptyField(fName, lName, cNum, nic, dob, bank, acNum, bSalary, nyear);
        boolean fieldText = v.checkFieldText(fName, lName, bank);
        boolean fieldContactNo = v.validateContactNumber(cNum);
        boolean fieldnic = v.validateNIC(nic);

        boolean fielddob = v.validatedob(nyear);
        boolean fieldnumerics = v.fieldNumberValidatiion(acNum, bSalary);
        boolean bsalaryvalid = v.salaryValidatiion(bSalary);

        if ((fieldEmpty == true) && (fieldText == true) && (fieldContactNo == true) && (fieldnic == true) && (fielddob == true) && (fieldnumerics == true) && (bsalaryvalid == true)) {
            return true;
        } else {
            return false;
        }

    }

}

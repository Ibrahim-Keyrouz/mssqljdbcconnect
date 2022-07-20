package com.application.connect;

import com.application.connect.utilities.DBCnxManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass {

public static void main(String[] args) {
    DBCnxManager dbCnxManager = new DBCnxManager();
    Statement stmt = null;
    ResultSet rs = null;
    Connection con = dbCnxManager.getCon();
    try {


    // Execute SQL and return data results.
    String SQL = "SELECT * FROM Student";
    stmt = con.createStatement();
    rs = stmt.executeQuery(SQL);
        // Loop the data result and display the data.
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

    }catch (Exception ex) {
        ex.printStackTrace();
    }finally {
        if (rs != null)
        {
            try {
                rs.close();
            }catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        if (stmt != null)
        {
            try {
                stmt.close();
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }

        if (con != null)
        {
            try {
                con.close();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

}




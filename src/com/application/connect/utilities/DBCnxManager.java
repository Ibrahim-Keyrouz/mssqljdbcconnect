/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.connect.utilities;

import java.sql.*;


public class DBCnxManager {

    // Main Variable
    private Connection con ;// Connection
    private final String sqlServerConnectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;user=sa;password=008632";
   

    /**
     * Default parameters
     */
	public DBCnxManager()  {
    	try {
            // Load jdbc driver class.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Get connection.
			con =  DriverManager.getConnection(sqlServerConnectionUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public Connection getCon() {
        return con;
    }


 
    
}

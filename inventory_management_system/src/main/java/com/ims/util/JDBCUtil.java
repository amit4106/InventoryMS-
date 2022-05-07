package com.ims.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error occur while class loading");
			e.printStackTrace();
		}
	}

	public static Connection getMySQLConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/imsdb?verifyServerCertificate=false&useSSL=true";
		String userName = "root";
		String pswd = "Patna@123";
		try {
			con = DriverManager.getConnection(url, userName, pswd);
		} catch (SQLException e) {
			System.out.println("Exception occur while creating connection");
			e.printStackTrace();
		}

		return con;
	}

	public static void closeConnection(Connection con, Statement st) {
		if(con!=null)
			try {
				con.close();
				if(st!=null)
					st.close();
			} catch (SQLException e) {
				System.out.println("Exception occur while closing the connection");
				e.printStackTrace();
			}
	
	}
}

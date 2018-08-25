package com.heapdump.analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// The connection is not closed for the DB resulting in Open DB connection
public class UnclosedDBConnection {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			// con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}
	}
}

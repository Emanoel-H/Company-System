package br.com.company.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useTimezone=true&serverTimezone=UTC",
				"user" , "password");
		
		System.out.println("It Worked!!!");
		
		connection.close();
	}

}

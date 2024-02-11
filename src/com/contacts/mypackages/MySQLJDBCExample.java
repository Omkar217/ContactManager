package com.contacts.mypackages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLJDBCExample {
	
	private static final String url = "jdbc:mysql://localhost:3306/contacts";
	private static final String username = "examstuds";
	private static final String password = "examstuds";
	
	public static void main(String args[])
	{
		 try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        }catch (ClassNotFoundException e){
	            e.printStackTrace();
	        }
	        Scanner scanner = new Scanner(System.in);
	        try{
	            Connection connection = DriverManager.getConnection(url, username, password);
	            System.out.print("Enter Contact name: ");
	            String contactName = scanner.nextLine();
	            System.out.print("Enter Contact email : ");
	            String contactEmail = scanner.nextLine();
	            System.out.print("Enter Contact phone : ");
	            long contactPhoneNo = scanner.nextLong();
	            String query = "INSERT INTO Data(name, phone_number, email) VALUES(?, ?, ?)";
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setCursorName(contactName);
	            preparedStatement.setInt(2, age);
	            preparedStatement.setString(3, gender);
	            int affectedRows = preparedStatement.executeUpdate();
	            
	        }catch (SQLException e){
	            e.printStackTrace();
	        }
	}

}
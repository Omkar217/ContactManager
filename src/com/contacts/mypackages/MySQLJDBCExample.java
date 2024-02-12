package com.contacts.mypackages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLJDBCExample {
	
	private static final String url = "jdbc:mysql://localhost:3306/contacts";
	private static final String username = "examstuds";
	private static final String password = "examstuds";
	
	public static void main(String args[])
	{
		//Contact contact =  new Contact();
	
		
	        try{
	        	 Class.forName("com.mysql.cj.jdbc.Driver");
	 	        Scanner scanner = new Scanner(System.in);
	            Connection connection = DriverManager.getConnection(url, username, password);
	            System.out.print("Enter Contact name: ");
	            String contactName = scanner.nextLine();
	            System.out.print("Enter Contact email : ");
	            String contactEmail = scanner.nextLine();
	            System.out.print("Enter Contact phone : ");
	            long contactPhoneNo = scanner.nextLong();
	            String query = "INSERT INTO Data(phone_number, email, name) VALUES(?, ?, ?)";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                	preparedStatement.setString(3,contactName);
                	preparedStatement.setString(2,contactEmail);
                	preparedStatement.setLong(1,contactPhoneNo);
                	int rowsInserted = preparedStatement.executeUpdate();
                	if (rowsInserted > 0) {
                	        System.out.println("Data inserted successfully.");
                	    }
//	                while(rs.next())
//	        		{
//	        			System.out.println(reservationId);
//	        		}
	    
	            }
	            scanner.close();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
	       
	            
	}

}

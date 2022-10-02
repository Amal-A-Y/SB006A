package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteStatementExample {

	public static void main(String[] args) {
		
		try {
			
			//1. Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Get the Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb006","root","root12345");
			
			//3. Create the Statement
			Statement stmt=con.createStatement();
			
			//4. Prepare the Query & Execute
			 int record= stmt.executeUpdate("DELETE from Employees where id=107");
			
			 if(record>0) {
				 System.out.println("data deleted Successfully in to Employees table");
			 }else {
				 System.err.println("Error occured while deleted the data in to Employees table");
			 }
			
		
			//5. Close the Resource 
			con.close();
			stmt.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Exception Occcured"+e);
		}
	
		
		
		
		
		
	}
}
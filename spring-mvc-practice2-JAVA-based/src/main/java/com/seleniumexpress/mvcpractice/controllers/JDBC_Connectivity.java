package com.seleniumexpress.mvcpractice.controllers;//it is a model classs 

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_Connectivity {
//	    String Name;
//	    int mobile_num;
//	    String address;
//	    JDBC_Connectivity(String name,int number,String address){
//	        this.Name= name;
//	        this.mobile_num=number;
//	        this.address=address;
//	    }
	
	public static void main(String [] args) {
		
		JDBC_Connectivity obj =new JDBC_Connectivity();
		obj.createConnection(null, null, null);
		
	}
	  
	static Connection con; //the type of con is Connection which belong to the sql package
	public void  createConnection(String name, String mobile, String city) {
		
		try {
			//load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			String user ="root";
			String password = "root";
			String url="jdbc:mysql://localhost:3306/student_manage";
			
			con=DriverManager.getConnection(url, user, password);	
			//String query="select * from students";
			//String query2="insert into students values('lmn',1234567789,'xyz')";
			String query2="insert into students(sname,sphone, scity) values(?,?,?)";
			
			PreparedStatement st= con.prepareStatement(query2);
			//st.executeQuery(query);
			
			//dynamic insertion
			st.setString(1, name);
			st.setString(2, mobile);
			st.setString(3, city);
			

			st.executeUpdate();
			System.out.print("Successfully executed!!");
		}catch(Exception e) {
			//handle exception
			e.printStackTrace();
			
		}
		
		
		
	}

}

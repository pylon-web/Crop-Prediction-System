package com.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bean.LoginBean;
import com.dao.DBConnection;

 public class LoginDao {

	static Connection con = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	
	
	public static int authenticateUser(LoginBean loginBean){

		String name = loginBean.getUserName(); //Keeping user entered values in temporary variables.
		String password = loginBean.getPassword();
	
		
		System.out.println("username..."+name);
		System.out.println("password..."+password);

	String userNameDB 	= 	"";
	String passwordDB 	= 	"";


	try
	{
		con = DBConnection.createConnection(); //establishing connection
		statement = con.createStatement(); //Statement is used to write queries. Read more about it.
		resultSet = statement.executeQuery("select name,password from farmers"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.

		while(resultSet.next()){ // Until next row is present otherwise it return false
		
			userNameDB = resultSet.getString("name"); //fetch the values present in database
			passwordDB = resultSet.getString("password");
		
			
			
			if(name.equals(userNameDB) && password.equals(passwordDB)){
				return 1; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
			}
		}	
	}
	
	catch(SQLException e){
			e.printStackTrace();
	}
		return 0; // Just returning appropriate message otherwise
	}
	
	
	public static int merchant_login_check(LoginBean loginBean){

		String name = loginBean.getUserName(); //Keeping user entered values in temporary variables.
		String password = loginBean.getPassword();

	String userNameDB = "";
	String passwordDB = "";
	try
	{
		con = DBConnection.createConnection(); //establishing connection
		statement = con.createStatement(); //Statement is used to write queries. Read more about it.
		resultSet = statement.executeQuery("select name,password from merchants"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.

		while(resultSet.next()){ // Until next row is present otherwise it return false
		
			userNameDB = resultSet.getString("name"); //fetch the values present in database
			passwordDB = resultSet.getString("password");

			if(name.equals(userNameDB) && password.equals(passwordDB)){
				return 1; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
			}
		}
	}
		catch(SQLException e){
			e.printStackTrace();
		}
		return 0; // Just returning appropriate message otherwise
	}
	
	public static int admin_login_check(LoginBean loginBean){

		String name = loginBean.getUserName(); //Keeping user entered values in temporary variables.
		String password = loginBean.getPassword();

	String userNameDB = "";
	String passwordDB = "";
	try
	{
		con = DBConnection.createConnection(); //establishing connection
		statement = con.createStatement(); //Statement is used to write queries. Read more about it.
		resultSet = statement.executeQuery("select name,password from admins"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.

		while(resultSet.next()){ // Until next row is present otherwise it return false
		
			userNameDB = resultSet.getString("name"); //fetch the values present in database
			passwordDB = resultSet.getString("password");

			if(name.equals(userNameDB) && password.equals(passwordDB)){
				return 1; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
			}
		}
	}
		catch(SQLException e){
			e.printStackTrace();
		}
		return 0; // Just returning appropriate message otherwise
	}


	 
		
	}

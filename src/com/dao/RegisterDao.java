package com.dao;
 
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bean.LoginBean;
import com.dao.DBConnection;
 
public class RegisterDao {
	static Connection con = null;
	static PreparedStatement preparedStatement = null;
 public String registerUser(LoginBean bean)
 {
 String uid=null;
 String userName = bean.getUserName();
 String email = bean.getEmail();
 String phone = bean.getPhone();
 String password = bean.getPassword();
 String village = bean.getVillage();
 String taluka = bean.getTaluka();
 String district = bean.getDistrict();
 String state = bean.getState();
 String pincode = bean.getPincode();
 
 try
 {
 con = DBConnection.createConnection();
 String query = "insert into farmers(uid,name,email,phone,password,village,taluka,district,state,pincode) values (?,?,?,?,?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
 preparedStatement.setString(1, uid);
 preparedStatement.setString(2, userName);
 preparedStatement.setString(3, email);
 preparedStatement.setString(4, phone);
 preparedStatement.setString(5, password);
 preparedStatement.setString(6, village);
 preparedStatement.setString(7, taluka);
 preparedStatement.setString(8, district);
 preparedStatement.setString(9, state);
 preparedStatement.setString(10, pincode);
 
 int i= preparedStatement.executeUpdate();
 
 if (i!=0)  //Just to ensure data has been inserted into the database
 return "SUCCESS"; 
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 }
 
 
 
}
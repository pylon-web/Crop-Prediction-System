package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.Connection;
import java.sql.SQLException;
import com.dao.DBConnection;
import java.sql.PreparedStatement;


@WebServlet("/FAQServlet")
public class FAQServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Connection con = null;
	static PreparedStatement preparedStatement = null;

	String userName;
	String email;
	String faq;
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	
		String userName=request.getParameter("farmerName"); 
		String email=request.getParameter("email");
		String faq=request.getParameter("faq");
		String ans="Not answered at all.";
		
		
		try
		{
			con = DBConnection.createConnection(); //establishing connection
			String query = "insert into faqs(userName,email,faq,ans) values (?,?,?,?)"; //Insert user details into the table 'USERS'
			 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
			 preparedStatement.setString(1, userName);
			 preparedStatement.setString(2, email);
			 preparedStatement.setString(3, faq);
			 preparedStatement.setString(4, ans);
			 
			 int i= preparedStatement.executeUpdate();
			 
			 if (i!=0) {  //Just to ensure data has been inserted into the database
				 out.println("<script type=\"text/javascript\">");
			     out.println("alert('FAQ submitted succesfully..');");
			     out.println("location='farmer_Home.jsp';");
			     out.println("</script>");
			 }else {
				 
				 out.println("<script type=\"text/javascript\">");
			     out.println("alert('Failed to submit faq..');");
			     out.println("location='farmer_Home.jsp';");
			     out.println("</script>");
			 }
		}
			 catch(SQLException e)
			 {
			 e.printStackTrace();
			 }
		out.close();
	}
}
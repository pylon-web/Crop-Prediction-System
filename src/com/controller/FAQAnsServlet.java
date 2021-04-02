package com.controller;

import java.io.IOException;


import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBConnection;
import java.sql.*;


@WebServlet("/FAQAnsServlet")
public class FAQAnsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Connection con = null;
	static Statement statement = null;
	static ResultSet resultSet = null;

	String faq;
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	
		String farmer=request.getParameter("farmerName"); 
		String ans=request.getParameter("ans");
		
		
		try
		{
			con = DBConnection.createConnection(); //establishing connection
			statement = con.createStatement(); //Statement is used to write queries. Read more about it
			String query="UPDATE faqs SET ans = '"+ans+"' WHERE userName = '"+farmer+"' ";
			int res=statement.executeUpdate(query);

			 if (res!=0) {  //Just to ensure data has been inserted into the database
				 out.println("<script type=\"text/javascript\">");
			     out.println("alert('Answer submitted succesfully..');");
			     out.println("location='admin_Home.jsp';");
			     out.println("</script>");
			 }else {
				 
				 out.println("<script type=\"text/javascript\">");
			     out.println("alert('Failed to submit answer..');");
			     out.println("location='admin_Home.jsp';");
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
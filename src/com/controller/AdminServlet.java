package com.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.LoginBean;
import com.dao.LoginDao;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("userName"); 
		String password=request.getParameter("password");
		
		LoginBean bean=new LoginBean();
		bean.setUserName(name);
		bean.setPassword(password);
		
		int status=0;
		status = LoginDao.admin_login_check(bean);

 if(status>0){
		 
			  HttpSession session=request.getSession();  
		        session.setAttribute("uname",name);  
		  
		     out.println("<script type=\"text/javascript\">");  
		   	 out.println(" alert('Admin Logged in successful');");
		   	 out.println("location='admin_Home.jsp';");
		   	 out.println("</script>"); 
		    
			
		  
 }
 else{
	
	 out.println("<script type=\"text/javascript\">");  
   	 out.println(" alert('Login Failed. Try again...');");
   	 out.println("location='home.jsp';");
   	 out.println("</script>"); 
    
 }
		out.close();	}


	}



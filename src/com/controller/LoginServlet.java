package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bean.LoginBean;
import com.dao.LoginDao;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	
		String userName=request.getParameter("userName"); 
		String password=request.getParameter("password");
		
		
		
		
		LoginBean bean=new LoginBean();
		bean.setUserName(userName);
		bean.setPassword(password);
		
		
		
		int status=0;
		status = LoginDao.authenticateUser(bean);
		
	
	if(status>0){
		 
		 HttpSession session=request.getSession();  
		 session.setAttribute("userName",userName);  
		
		 out.println("<script type=\"text/javascript\">");
	     out.println("alert('Logged in succesfully..');");
	     out.println("location='farmer_Home.jsp';");
	     out.println("</script>");
	//     request.getRequestDispatcher("user.jsp").forward(request, response);
		  
	}
	else{
	 out.println("<script type=\"text/javascript\">");
     out.println("alert('Login Failed..');");
     out.println("location='farmer_Login.jsp';");
     out.println("</script>");
     
     
	 
	
	  
	 HttpSession session=request.getSession();  
	 session.setAttribute("userName",userName);  
	 
	 
 	}
		out.close();
	}

}

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LoginBean;
import com.dao.RegisterDao;


@WebServlet("/RegisterAccount")
public class RegisterAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
		 //Copying all the input parameters in to local variables
	 String userName = request.getParameter("userName");
	 String email = request.getParameter("email");
	 String phone = request.getParameter("phone");
	 String password = request.getParameter("password");
	 String village = request.getParameter("village");
	 String taluka = request.getParameter("taluka");
	 String district = request.getParameter("district");
	 String state = request.getParameter("state");
	 String pincode = request.getParameter("pincode");
	


	 
	 
	 LoginBean bean = new LoginBean();
	 //Using Java Beans - An easiest way to play with group of related data
	 bean.setUserName(userName);
	 bean.setEmail(email);
	 bean.setPhone(phone);
	 bean.setPassword(password); 
	 bean.setVillage(village);
	 bean.setTaluka(taluka);
	 bean.setDistrict(district);
	 bean.setState(state);
	 bean.setPincode(pincode);

	 RegisterDao Dao = new RegisterDao();
	 
	 //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
	 String userRegistered = Dao.registerUser(bean);
	 
	 if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
	 {
		 out.println("<script type=\"text/javascript\">");  
		 out.println(" alert('User is Register successful');");
		 out.println("location='login.jsp';");
		 out.println("</script>"); 
	 request.getRequestDispatcher("home.jsp").forward(request, response);
	 }
	 else   //On Failure, display a meaningful message to the User.
	 {
	 request.setAttribute("errMessage", userRegistered);
	 request.getRequestDispatcher("signUp.jsp").forward(request, response);
	 }
	 }
	}
package com.SVM;
import com.dao.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SVM_Train_Algorithm01")
public class SVM_Train_Algorithm01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		SVMTrainModel tdao=new SVMTrainModel();
		 int i1=tdao.trainSoilData();
			
		 if(i1>0){
			 	
			 out.println("<script type=\"text/javascript\">");
		     out.println("alert('Soil Training succesfully..');");
		     out.println("location='admin_Home.jsp';");
		     out.println("</script>");	  
		 }
		else{
		 out.println("<script type=\"text/javascript\">");
	     out.println("alert('Training Failed..');");
	     out.println("location='admin_Home.jsp';");
	     out.println("</script>");
	     
	 	}
			out.close();
	}
}

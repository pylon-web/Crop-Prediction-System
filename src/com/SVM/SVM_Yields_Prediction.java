package com.SVM;
import com.dao.LoginDao;
import com.dao.SVMTestModel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SVM_Yields_Prediction")
public class SVM_Yields_Prediction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	
		String taluka=request.getParameter("region"); 
		String crop=request.getParameter("crop");
		String season=request.getParameter("season");
		String area=request.getParameter("area");
		
		SVMTestModel svm=new SVMTestModel();
		Double yieldPredictionResult=svm.getAVGYieldPrediction(taluka,crop,season,area);
		
 
		HttpSession session=request.getSession();  
		 session.setAttribute("yieldPredictionResult",yieldPredictionResult);  
		 
		 out.println("<script type=\"text/javascript\">");
	     out.println("alert('Logged in succesfully..');");
	     //out.println("location='farmer_Home.jsp';");
	     out.println("</script>");
	     request.getRequestDispatcher("showYieldPrediction.jsp").forward(request, response);
	 
	 
		out.close();
	}

}

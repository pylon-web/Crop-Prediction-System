package com.SVM;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.SVMTestModel;



@WebServlet("/SVM_Test_Algorithm")
public class SVM_Test_Algorithm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ArrayList<Double> allParameters=new ArrayList<Double>();
		LinkedList<String> finalCropSuggestions=new LinkedList<String>();
		int status=0;
		
		String area=request.getParameter("area"); 
		String soil=request.getParameter("soil");
		String temp=request.getParameter("temp");
		
		SVMTestModel svm=new SVMTestModel();
		Double avgRainfall=svm.getAVGRainfall(area);
		Double avgNPKsoil=svm.getAvgNPKSoil(soil);
		Double avgtemp=Double.parseDouble(temp);
		allParameters.add(avgRainfall);
		allParameters.add(avgNPKsoil);
		allParameters.add(avgtemp);
		System.out.print("We get all parameters :"+allParameters);
		
		svm.getRainBasedSuggestion(allParameters);
		svm.getSoilBasedSuggestion(allParameters);
		status=svm.getTempBasedSuggestion(allParameters);
		finalCropSuggestions.addAll(svm.getCropSuggestion());
		
		System.out.println("We get final crop suggestions :"+finalCropSuggestions);
	//	out.println("We get final crop suggestions :"+finalCropSuggestions);
		
		if(status>0){
						
			 out.println("<script type=\"text/javascript\">");
		     out.println("alert('We Get Best Crop Suggestions....');");
		     out.println("location='showPredictionCrop.jsp';");
		     out.println("</script>");
		//     request.getRequestDispatcher("user.jsp").forward(request, response);
			  
		}
		else{
		 out.println("<script type=\"text/javascript\">");
	     out.println("alert('Testing Failed..');");
	     out.println("location='predictionCrop.jsp';");
	     out.println("</script>");
	     	 
	 	}
			out.close();		
	}

}

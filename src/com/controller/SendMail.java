package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SendMail")
public class SendMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  		
	    PrintWriter out = response.getWriter();
	    
	    System.out.println("In send mail Servlet");	
	//    String btn=request.getParameter("submit");
	  //  		System.out.println("Button = "+btn);
	    String to=request.getParameter("to");  
	    System.out.println("Mail to: "+to);
	    String subject=request.getParameter("subject");  
	    String msg=request.getParameter("msg");  
	          
 
			  
			final String user="vinodbhosale1615@gmail.com";//change accordingly  
			final String pass="96899689855035";  
			  
			//1st step) Get the session object    
			Properties props = new Properties(); 
			//props.put("mail.smtp.starttls.enable", "true");


			props.put("mail.smtp.host", "smtp.gmail.com");  
			props.put("mail.smtp.socketFactory.port", "465");  
			props.put("mail.smtp.socketFactory.class",  
			          "javax.net.ssl.SSLSocketFactory");  
			props.put("mail.smtp.auth", "true");  
			props.put("mail.smtp.port", "465");  
			 
			  
			Session session = Session.getDefaultInstance(props,  
			 new javax.mail.Authenticator() {  
			  protected PasswordAuthentication getPasswordAuthentication() {  
			   return new PasswordAuthentication(user,pass);  
			   }  
			});  
			//2nd step)compose message  
			try {  
			 MimeMessage message = new MimeMessage(session);  
			 message.setFrom(new InternetAddress(user));  
			 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			 message.setSubject(subject);  
			 message.setText(msg);  
			   		   
			 //3rd step)send message  
			 Transport.send(message);  
			 

			 out.println("<script type=\"text/javascript\">");
		     out.println("alert('Mail send succesfully..');");
		     out.println("location='farmer_Home.jsp';");
		     out.println("</script>");
			 			  
			 } catch (MessagingException e) {  
			    throw new RuntimeException(e);  
			 }  
	}
}

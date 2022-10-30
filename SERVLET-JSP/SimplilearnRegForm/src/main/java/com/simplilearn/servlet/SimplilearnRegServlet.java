package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SimplilearnRegServlet extends HttpServlet{

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("****************START-doPost()****************");
		
		
		String firstname=(String)request.getParameter("firstname");
		String lastname=(String)request.getParameter("lastname");
		String emailid=(String)request.getParameter("emailId");
		String password=(String)request.getParameter("password");
		String gender=(String)request.getParameter("gender");
		String timing=(String)request.getParameter("timing");
		String remarks=(String)request.getParameter("remarks");
		
		String courses[]=request.getParameterValues("course");
		
		System.out.println("First Name:"+firstname);
		System.out.println("Last Name:"+lastname);
		System.out.println("Email:"+emailid);
		System.out.println("Password:"+password);
		System.out.println("Gender:"+gender);
		System.out.println("Timing:"+timing);
		System.out.println("Remarks:"+remarks);
		
		for (String course:courses) {
			System.out.println("Course:"+course);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<h1> Hired by the Best - Our Hiring Partners </h1>");
		out.print("<h2> Your Form Submitted successfully , Our Hiring manager will connect you very soon </h2>");
		
		out.print("<h3> Below data we recived </h3>");
		
		out.print("<p> First Name : : "+ firstname+"</p>");
		out.print("<p> Last Name : : "+ lastname+"</p>");
		out.print("<p> Email ID : : "+ emailid+"</p>");
		out.print("<p> Password : : "+ password+"</p>");
		
		/*HOME WORK: Need to populate thh the recived data from User*/
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		
		
		System.out.println("****************END-doPost()****************");
		
		
	}

}

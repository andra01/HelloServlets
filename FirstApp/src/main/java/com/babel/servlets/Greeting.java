package com.babel.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Greeting extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
{
    
		 PrintWriter out = response.getWriter();
		 String username = request.getParameter("username");
	     String password =request.getParameter("password");
	     response.setContentType("text/html");
		
	     
		  out.println("<html>");
	      out.println("<head>");
	      out.println("<title> A very simple servlet example</title>");
	      out.println("</head>");
	      out.println("<body>");
	      out.println("Welcome " + username + "-" +password);
	     //out.println("<h1>"+first_name+"</h1>");
	     //out.println("<h1>"+last_name+"</h1>");
	      out.println("</body>");
	      
	   //   if((username.equals("admin"))&&(password.equals("admin")))
	      // {
	 

	    out.println("</html>");
	    out.close();
}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
                 doGet(request, response);
				}


}
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
		 String first_name = request.getParameter("first_name");
	     String last_name =request.getParameter("last_name");
	     response.setContentType("text/html");
		
	     
		  out.println("<html>");
	      out.println("<head>");
	      out.println("<title> A very simple servlet example</title>");
	      out.println("</head>");
	      out.println("<body>");
	      out.println("Welcome " + first_name + "-" +last_name);
	     //out.println("<h1>"+first_name+"</h1>");
	     //out.println("<h1>"+last_name+"</h1>");
	      out.println("</body>");
	 

	    out.println("</html>");
	    out.close();
}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
                 doGet(request, response);
				}


}
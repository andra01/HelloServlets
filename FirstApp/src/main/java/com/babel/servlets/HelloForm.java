package com.babel.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request,HttpServletResponse response)
	            throws ServletException, IOException
	{
	

       response.setContentType("text/html");
	   request.getRequestDispatcher("Hello.jsp").include(request, response);    
	     
 
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
                 doGet(request, response);
				}



}

	

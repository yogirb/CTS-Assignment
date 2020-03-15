package com.salman.khan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	public MyServlet()
	{
		System.out.println("from constructor");

	}
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("from init method");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from init service");
		
		

	}
@Override
public void destroy() {
	System.out.println("from init destroy");

}

public static void main(String...args)
{
	
}
	

}

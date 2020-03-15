package com.salman.khan;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/RequestHandler")
public class Filter2 implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		System.out.println("from init secondfilter");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/*
		 * System.out.println("from dofilter secondfilter");
		 * System.out.println("request pre-processing logic------from SF");
		 * chain.doFilter(request, response); System.ou
		 * t.println("request post-processing logic----from SF");
		 * 
		  */
		if(request.getParameter("pwd").equals("cts"))
		{
			chain.doFilter(request, response);
		}
		else
		{
			response.getWriter().write("<h1>Invalid password<h1>");
		}
		
		
		

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}

package com.salman.khan;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/RequestHandler")
public class Filter1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		/*
		 * System.out.println("from do filter of firdt filter");
		 * System.out.println("from dofilter firstfilter");
		 * System.out.println("request pre-processing logic------from FF");
		 * chain.doFilter(request, response);
		 * System.out.println("request post-processing logic----from FF");
		 */
		if(request.getParameter("un").equals("yogesh"))
		{
			chain.doFilter(request, response);
		}
		else
		{
			response.getWriter().write("<h1>Invalid user<h1>");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		 System.out.println("from init firstfilter");
	}

}

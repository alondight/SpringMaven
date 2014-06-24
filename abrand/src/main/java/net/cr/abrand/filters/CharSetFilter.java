package net.cr.abrand.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


//@WebFilter("/*")
public class CharSetFilter implements Filter {
	FilterConfig config;

	
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}
	

	@Override
	public void doFilter(
			ServletRequest request, ServletResponse response,
			FilterChain next) throws IOException, ServletException {
		
		// 서블릿의 service() 호출전
		request.setCharacterEncoding("UTF-8");
		next.doFilter(request, response);
		// 서블릿의 service() 호출 후에 해야할 일 
			
	}
	
	@Override
	public void destroy() {}

	

	

}

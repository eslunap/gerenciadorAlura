package com.alura.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebFilter(urlPatterns = "/entrada")
public class AutorizacionFilter implements Filter {


	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) 
			throws IOException, ServletException {
		
		System.out.println("----AutorizacionFilter----");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String paramAccion = request.getParameter("accion");
		
		HttpSession sesion = request.getSession();
		
		Boolean usuarioNoLogueado = (sesion.getAttribute("loginUsuario")==null);
		Boolean accionProtegida = !(paramAccion.equals("Login") || paramAccion.equals("LoginForm"));
		
		if (usuarioNoLogueado && accionProtegida) {
			response.sendRedirect("entrada?accion=LoginForm");
			return;
		}
		chain.doFilter(request, response);
	}


}

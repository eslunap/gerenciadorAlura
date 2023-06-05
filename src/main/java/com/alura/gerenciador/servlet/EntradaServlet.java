package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String param = request.getParameter("accion");
		
		if (param.equals("ListaEmpresas")) {
			System.out.println("Listando empresas");			
		}else if(param.equals("MostrarEmpresa")) {
			System.out.println("Mostrando una empresa");			
		}else if(param.equals("EliminarEmpresa")) {
			System.out.println("Eliminando una empresa");			
		}

	}

}

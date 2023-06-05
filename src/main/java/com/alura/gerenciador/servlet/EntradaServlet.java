package com.alura.gerenciador.servlet;

import java.io.IOException;

import com.alura.gerenciador.accion.ListaEmpresas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAccion = request.getParameter("accion");
		
		if (paramAccion.equals("ListaEmpresas")) {
			ListaEmpresas accion = new ListaEmpresas();
			accion.ejecutar(request, response);
		}else if(paramAccion.equals("MostrarEmpresa")) {
			System.out.println("Mostrando una empresa");			
		}else if(paramAccion.equals("EliminarEmpresa")) {
			System.out.println("Eliminando una empresa");			
		}

	}

}

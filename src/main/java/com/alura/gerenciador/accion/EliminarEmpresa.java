package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.DB;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EliminarEmpresa {

	public void ejecutar(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Eliminando una empresa " + id);
		
		System.out.println(id);
		
		DB db = new DB();
		db.eliminarEmpresa(id);
		
		response.sendRedirect("entrada?accion=ListaEmpresas");
		
	}

}

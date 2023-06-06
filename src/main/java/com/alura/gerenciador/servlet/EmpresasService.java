package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

@WebServlet(urlPatterns = "/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new DB().getEmpresas();
		
		XStream xstream = new XStream();
		String xml = xstream.toXML(empresas);
		
		response.setContentType("Application/xml");
		response.getWriter().print(xml);
		
		/*
		 * Gson gson = new Gson(); String json = gson.toJson(empresas);
		 * 
		 * response.setContentType("Application/json");
		 * response.getWriter().print(json);
		 */
		
	}

}

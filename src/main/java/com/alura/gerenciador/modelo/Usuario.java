package com.alura.gerenciador.modelo;

public class Usuario {
	
	private String login;
	private String contrasena;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.login +" "+ this.contrasena;
	}
	
	public boolean esIgual(String login, String contrasena) {
		System.out.println("Usuario.java login "+login);
		if (!this.login.equals(login)) {
			return false;
		}
		if (!this.contrasena.equals(contrasena)) {
			return false;
		}
		return true;
	}	
}
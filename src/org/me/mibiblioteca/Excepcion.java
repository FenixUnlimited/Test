/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mibiblioteca;

/**
 *
 * @author Administrador
 */
class Excepcion extends Exception {

	public Excepcion(String mensaje)
	{
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage()
	{
		return mensaje;
	}
	
	
	private String mensaje;
}

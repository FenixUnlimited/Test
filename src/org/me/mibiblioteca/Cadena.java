/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mibiblioteca;

/**
 * Métodos útiles para el manejo de cadenas.
 * @author Pan, néstor
 */
public class Cadena
{
	/**
	 * Convierte una cadena a formato Título.
	 * @param cadena Cadena a formatear.
	 * @return Cadena formateada.
	 * @throws Excepcion.
	 */
	public static String aTitulo(String cadena)// throws Excepcion
	{
		String[] palabras = cadena.split("[ \t]+");
		
		cadena = "";
		int nroPal = 0;
		while(nroPal < palabras.length)
		{
			try
			{
				cadena += palabras[nroPal].substring(0, 1).toUpperCase();
				cadena += palabras[nroPal].substring(1).toLowerCase();
				cadena += " ";
			}
			catch(IndexOutOfBoundsException e)
			{
				//System.out.println("Hubo un error en aTitulo. Motivo: " + e.getMessage());
				//throw new Excepcion("Anda mal");
			}
			
			nroPal++;
		}
		
		return cadena.trim();
	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mibiblioteca;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class CadenaTest
{
	public CadenaTest()
	{
		
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of aTitulo method, of class Cadena.
	 */
	@Test
	public void testATitulo()
	{
/*
		try
		{
*/
			System.out.println("aTitulo");
			String[] cadenas =
			{
				"\tpEPE \t  \t\t arGenTO \t\t ",
				"jUan  luIS\t  zabaletta  \t",
				"  pedRo\tgeRaRDo   \t    ortíz"
			};
			
			
			String[] expResult =
			{
				"Pepe Argento",
				"Juan Luis Zabaletta",
				"Pedro Gerardo Ortíz"
			};
			
			String result;

			for(int i = 0; i < 3; i++)
			{
				result = Cadena.aTitulo(cadenas[i]);
				assertEquals(expResult[i], result);
				System.out.println(result);
			}
	}
/*
		catch (Excepcion ex)
		{
			System.out.println("Error. Motivo: " + ex.getMessage());
		}
*/
}
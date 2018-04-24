package ual.hmis.sesion05.ejercicio05;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio05Test {

	Ejercicio5 ejercicio5 = new Ejercicio5();
	
	@Test
	public void cadenaSinPuntos(){
		String cadena = "Hola soy alfonso";
		String resultado = ejercicio5.subcadenaHastaPunto(cadena);
		String salida = "Error: cadena sin punto";
		assertEquals(salida,resultado);
	}
	
	@Test
	public void cadenaConDigito(){
		String cadena = "9alfonso";
		String resultado = ejercicio5.subcadenaHastaPunto(cadena);
		String salida = "Error: cadena con algún numero";
		
		assertEquals(salida,resultado);
	}
	
	@Test
	public void devolverSubcadena(){
		String cadena = "Ho.la jeje";
		String resultado = ejercicio5.subcadenaHastaPunto(cadena);
		String esperado = "Ho.";
		assertEquals(esperado,resultado);
		
	}
	
	@Test
	public void devolverSubcadenaLarga(){
		String cadena = "Hola me llamo alfonso.";
		String resultado = ejercicio5.subcadenaHastaPunto(cadena);
		
		assertEquals(cadena,resultado);
	}
}

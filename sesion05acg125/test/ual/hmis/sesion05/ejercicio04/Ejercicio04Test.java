package ual.hmis.sesion05.ejercicio04;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio04Test {
	
	Ejercicio4 ejercicio4 = new Ejercicio4();
	@Test
	public void diferenciaCadenasTest(){
		String cadena1 = "Alfonso";
		String cadena2 = "Alfredo";
		String salida = "ns";
		
		String resultado = ejercicio4.compararCadenas(cadena1, cadena2);
		
		assertEquals(salida,resultado);
		
	}
	
	@Test
	public void diferenciaCadenasTest2(){
		String cadena1 = "Pedro";
		String cadena2 = "maria";
		String salida = "Pedo";
		
		String resultado = ejercicio4.compararCadenas(cadena1, cadena2);
		
		assertEquals(salida,resultado);
	}
	@Test
	public void diferenciaCadenasTest3(){
		String cadena1 = "alfonso";
		String cadena2 = "maria";
		String salida = "lfonso";
		
		String resultado = ejercicio4.compararCadenas(cadena1, cadena2);
		
		assertEquals(salida,resultado);
	}
}

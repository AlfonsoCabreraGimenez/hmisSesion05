package ual.hmis.sesion05.ejercicio03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio03Test {

	Ejercicio3 ejercicio3 = new Ejercicio3();
	
	@Test
	public void tranformarNegativoTest(){
		String salida = "numero erroneo";
		
		assertEquals(salida,ejercicio3.transformar(-1));
	}
	@Test
	public void transformarTest(){
		int numero = 4;
		String salida = "****";
		//boolean condicion;
		
		String resultado = ejercicio3.transformar(numero);
		assertEquals(salida,resultado);
	}
}

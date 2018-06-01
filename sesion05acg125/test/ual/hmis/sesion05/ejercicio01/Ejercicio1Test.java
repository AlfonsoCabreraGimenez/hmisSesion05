package ual.hmis.sesion05.ejercicio01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio1Test {

	Ejercicio1 ejercicio1 = new Ejercicio1();
	
	@Test
	public void testDivisorespordos(){
		int resultado = 0;
		
		resultado = ejercicio1.transformar(2);
		
		assertEquals(1,resultado);
	}
	@Test
	public void testDivisoresportres(){
		int resultado = 0;
		
		resultado = ejercicio1.transformar(3);
		
		assertEquals(1,resultado);
	}
	@Test
	public void testDivisoresporcinco(){
		int resultado = 0;
		
		resultado = ejercicio1.transformar(5);
		
		assertEquals(1,resultado);
	}
	
	@Test
	public void testDivisoresporTodos(){
		int resultado = 0;
		
		resultado = ejercicio1.transformar(30);
		
		assertEquals(1,resultado);
	}
	
}

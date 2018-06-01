package ual.hmis.sesion05.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio02Test {

	Ejercicio2 ejercicio2 = new Ejercicio2();
	
	@Test
	public void nombreVacioTest(){
		
		boolean condicion = ejercicio2.login(null,"Cabrera");
		assertFalse(condicion);
	}
	
	@Test
	public void apellidoVacioTest(){
		boolean condicion = ejercicio2.login("Alfonso",null);
		assertFalse(condicion);
	}
	
	@Test
	public void longitudNoPermitidaTest(){
		String nombre = "Alfonso";
		String apellido = "CabreraGimenezPulidoCano";
		boolean resultado = ejercicio2.login(nombre, apellido);
		
		assertFalse(resultado);
	}
	@Test
	public void longitudPermitidaTest(){
		String nombre = "Alfonso";
		String apellido = "Cabrera";

		
		boolean resultado = ejercicio2.login(nombre, apellido);

	
		assertFalse(resultado);
	}
	
	@Test
	public void comprobarbaseDatosTest(){
		boolean resultado = ejercicio2.compruebaLoginEnBD("user", "pass");
		assertTrue(resultado);
	}
	@Test
	public void comprobarbaseDatosFalseTest(){
		boolean resultado = ejercicio2.compruebaLoginEnBD("user1", "pass");
		assertFalse(resultado);
	}
	
	@Test
	public void comprobarbaseDatosFalseTestApellido(){
		boolean resultado = ejercicio2.compruebaLoginEnBD("user", "pass1");
		assertFalse(resultado);
	}

}

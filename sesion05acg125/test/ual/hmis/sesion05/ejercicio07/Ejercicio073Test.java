package ual.hmis.sesion05.ejercicio07;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio03.*;

@RunWith(Parameterized.class)
public class Ejercicio073Test {
	
	private int numero;
	private String salida;
	private Ejercicio3 e3;
	
	public Ejercicio073Test(int entrada, String esperado) {
		this.numero = entrada;
		this.salida = esperado;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][] {
			{-1,"numero erroneo"},
			{4,"****"}
		});
	}
	
	@Before
	public void setUp() {
		e3 = new Ejercicio3();
	}
	
	@Test
	public void Ejercicio073() {
		System.out.println("Addition with parameters : " + numero + " and " + salida);
		assertEquals(e3.transformar(numero), salida);
		
		
	}
	

}

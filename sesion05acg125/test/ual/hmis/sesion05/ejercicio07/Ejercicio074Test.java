package ual.hmis.sesion05.ejercicio07;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio04.Ejercicio4;

@RunWith(Parameterized.class)
public class Ejercicio074Test {
	
	private String cond1;
	private String cond2;
	private String salida;
	private Ejercicio4 e4;
	
	public Ejercicio074Test(String condicion, String condicion2, String salidas) {
		this.cond1=condicion;
		this.cond2 = condicion2;
		this.salida=salidas;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][] {
			{"Alfonso","Alfredo","ns"},
			{"Pedro","Maria","Pedo"},
			{"alfonso","maria","lfonso"}
		});
	}
	
	@Before
	public void setUp() {
		e4 = new Ejercicio4();
	}
	
	@Test
	public void Ejercicio074() {
		assertEquals(e4.compararCadenas(cond1, cond2), salida);
	}

}

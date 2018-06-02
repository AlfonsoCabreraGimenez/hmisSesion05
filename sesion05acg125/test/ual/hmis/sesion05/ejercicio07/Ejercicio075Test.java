package ual.hmis.sesion05.ejercicio07;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio05.Ejercicio5;

@RunWith(Parameterized.class)
public class Ejercicio075Test {

	private String cond;
	private String salida;
	private Ejercicio5 e5;
	
	public Ejercicio075Test(String condicion,String expected) {
		this.cond = condicion;
		this.salida = expected;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][] {
			{"Hola soy alfonso","Error: cadena sin punto"},
			{"9alfonso","Error: cadena con algún numero"},
			{"Ho.la je je ","Ho."},
			{"Hola me llamo alfonso.","Hola me llamo alfonso."}
		});
	}
	
	@Before
	public void setUp() {
		e5 = new Ejercicio5();
	}
	
	@Test
	public void Ejercicio075() {
		assertEquals(e5.subcadenaHastaPunto(cond), salida);
	}
	
}

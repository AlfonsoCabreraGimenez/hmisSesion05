package ual.hmis.sesion05.ejercicio07;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio02.Ejercicio2;

@RunWith(Parameterized.class)
public class Ejercicio072Test {
	
	private String s1;
	private String s2;
	private boolean expected;
	private Ejercicio2 e2;
	
	public Ejercicio072Test(String string1,String string2, boolean esperado) {
		this.s1 = string1;
		this.s2 = string2;
		this.expected = esperado;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][] {
			{null,"Cabrera",false},
			{"Alfonso",null,false},
			{"Alfonso","CabreraGimenezPulidoCano",false},
			{"Alfonso","Cabrera",false},
			{"user","pass",true},
			{"user1","pass",false},
			{"user", "pass1",false}
		});
	}

	
	@Before
	public void setUp() {
		e2 = new Ejercicio2();
		}
	
	@Test
	public void Ejercicio072Test() {
		assertEquals(e2.login(s1, s2), expected);
	}
}

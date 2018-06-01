package ual.hmis.sesion05.ejercicio07;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ual.hmis.sesion05.ejercicio01.Ejercicio1;

@RunWith(Parameterized.class)
public class Ejercicio071Test {
	
	//Parámetros del test 1
	private int cond1;
	//private int cond2;
	private int expected;
	public Ejercicio1 e1;
	
	public Ejercicio071Test(int condicion1, int esperado){
		this.cond1 = condicion1;
		//this.cond2 = condicion2;
		this.expected = esperado;
	}
	
	@Parameters
	public static Collection<Integer[]> addedNumbers(){
		return Arrays.asList(new Integer[][] {
			{3,1},
			{5,1},
			{2,1},
			{30,1}
		});
	}
	
	@Before
	public void setUp() {
		e1 = new Ejercicio1();
	}
	
	@Test
	public void ejercicio1Test(){
		assertEquals(expected, 1);
	}
	
	
}

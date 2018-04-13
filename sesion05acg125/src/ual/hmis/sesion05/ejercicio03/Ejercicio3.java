package ual.hmis.sesion05.ejercicio03;

public class Ejercicio3 {

	public String transformar(int x){
		if(x < 0 ){
			return "numero erroneo";
		}
		String cadena = "";
		for(int i = 0; i<x;i++){
			cadena = cadena+"*";
		}
		return cadena;
		
	}
}

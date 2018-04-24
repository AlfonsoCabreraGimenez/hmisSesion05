package ual.hmis.sesion05.ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {
	
	public  String subcadenaHastaPunto(String cadena){
		

		int longitudCadena = cadena.length();
		String salida = "";
		
		for(int i = 0; i< longitudCadena; i++){
			if(!String.valueOf(cadena.charAt(i)).equals(".")){
				salida=salida+cadena.charAt(i);
			} else {
				salida = salida+".";
				return salida;
			}
			if(Character.isDigit(cadena.charAt(i)) == true){
				return "Error: cadena con algún numero";
			}
		}
		/*for(int i = 0; i<longitudCadena;i++){
			System.out.println("El caracter es "+cadena.charAt(i));
		}*/
		
		return "Error: cadena sin punto";
	}
	
	/*public static void main(String [] args){
		String cadena = "Hola me ll.amo";
		subcadenaHastaPunto(cadena);
	}
*/
	
}

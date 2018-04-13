package ual.hmis.sesion05.ejercicio04;


public class Ejercicio4 {

	public String compararCadenas(String P1, String P2){
		String salida ="";
		boolean iguales = true;
		//Pasamos las cadenas a minuscula para evitar incidencias
		P1.toLowerCase();
		P2.toLowerCase();
		for(int i = 0; i < P1.length();i++){
			for(int j = 0; j < P2.length();j++){
				if(P1.charAt(i) == P2.charAt(j)){
					iguales = true;
					break;
				} else {
					iguales = false;
				}
			}
			if(iguales == false)
				salida = salida+P1.charAt(i);
		}
		return salida;
	}
}

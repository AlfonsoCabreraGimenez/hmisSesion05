package ual.hmis.sesion05.ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {


	public boolean login (String username, String password){
	
		if(username == null){
			return false;
		}
		if (password == null){
			return false;
		}
		
		//comprobar que sean vacios
		int longitud = 0;
		longitud = (username.length() + password.length());
		
		if(longitud > 30){
			return false;
		} else {
		
		//comprobar longitud < 30
		
		
		//llama al metodo de la bbdd
		
		return compruebaLoginEnBD(username,password);
		}
		
	}
	
	public boolean compruebaLoginEnBD(String username,String password){
		//metodo mock
		if(username == "user" && password == "pass"){
			return true;
		}else{
		return false;
		}
	}
	//los valores limites son 29, 30 cosa asi
	
}

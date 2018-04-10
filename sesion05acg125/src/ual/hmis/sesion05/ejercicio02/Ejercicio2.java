package ual.hmis.sesion05.ejercicio02;

public class Ejercicio2 {

	
	public boolean login (String name, String password){
		//comprobar que sean vacios
		
		//comprobar longitud < 30
		
		//llama al metodo de la bbdd
		
		return compruebaLoginEnBD(name,password);
	}
	
	public boolean compruebaLoginEnBD(String name,String password){
		//metodo mock
		return true;
	}
	//los valores limites son 29, 30 cosa asi
	
}

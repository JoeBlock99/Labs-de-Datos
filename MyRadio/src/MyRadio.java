
import org.junit.Test;

import java.util.*;

/**
 * 
 */
/**
 * Lab 01
 * Interfaces
 * 
 * Jose Block - 18020
 * Gerardo Pineda - 18848
 *
 */

interface iRadio{
    public boolean encendidoRadio();
    public double subirFrecuencia();
    public double bajarFrecuencia();
    public void setFavorito(int posicion);
    public double getFavorito(int posicion);
    public boolean cambiarAmFm();
	
}

class Rad implements iRadio{
	
	boolean encendido = false;
	double frecuenciaActual;
	boolean fm;
	double[] favoritos = new double[12];
	Scanner scan = new Scanner(System.in);
	//
	//	FM: 87.9 -> 107.9
	
	//	AM: 530 -> 1610
	
	Rad(){
		// Constructor, empieza con la radio apagada y en FM
		this.fm = true;
		this.encendido = false;
		this.frecuenciaActual = 87.9;
	}
	

    public boolean encendidoRadio() {
    	
    	return true;
    }
    
    
    public double subirFrecuencia() {
    	/*
    	 *  1. Revisar en que tipo de radio (AM / FM)
    	 *  2. IF AM subir frecuencia actual += 10
    	 *  3. else subir actual + 0.2
    	 *  
    	 * 
    	 * */
    	 
    	return 3.3;
    }
    
    public double bajarFrecuencia() {
    	return 3.3;
    	
    }
    

    public void setFavorito(int posicion) {
    	
    }
    

    public double getFavorito(int posicion) {
    	return 3.3;
    }
    

    public boolean cambiarAmFm() {
    	return true;
    }
    
	
}

//public class MyRadio {
//	public static void main(String[] args) {
//		
//	}
//	
//}
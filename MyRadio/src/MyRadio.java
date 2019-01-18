
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
    	
    	if (this.encendido) {
    		System.out.println("Ya esta encendido!\n");
    		return true;
    	} else {
    		this.encendido = true;
    		return true;
    	}
    	
    }
    
    public double subirFrecuencia() {
    	if (!this.encendido) {
    		System.out.print("Encender radio.");
    		return 0.0;
    	} else {
	    	/*
	    	 *  1. Revisar en que tipo de radio (AM / FM)
	    	 *  2. IF AM subir frecuencia actual += 10
	    	 *  3. else subir actual + 0.2
	    	 *  
	    	 * 
	    	 */
	    	if (this.fm) {
	    		//	true significa estamos en FM
	    		if (this.frecuenciaActual == 107.9) {
	    			this.frecuenciaActual = 87.9;
	    			return 87.9;
	    		} else {
	    			this.frecuenciaActual += 0.2;
	    			return this.frecuenciaActual;
	    		}
	    		
	    	} else {
	    		// false entonces estamos en AM
	    		if (this.frecuenciaActual == 1610) {
	    			this.frecuenciaActual = 530;
	    			return 530;
	    		} else {
	    			this.frecuenciaActual += 10;
	    			return this.frecuenciaActual;
	    		}
	    	}
    	}
    	
    }
    
    public double bajarFrecuencia() {
    	if (!this.encendido) {
    		System.out.print("Encender radio.");
    		return 0.0;
    	} else {
	    	if (this.fm) {
	    		//	true significa estamos en FM
	    		if (this.frecuenciaActual == 87.9) {
	    			this.frecuenciaActual = 107.9;
	    			return 107.9;
	    		} else {
	    			this.frecuenciaActual -= 0.2;
	    			return this.frecuenciaActual;
	    		}
	    		
	    	} else {
	    		// false entonces estamos en AM
	    		if (this.frecuenciaActual == 530) {
	    			this.frecuenciaActual = 1610;
	    			return 1610;
	    		} else {
	    			this.frecuenciaActual -= 10;
	    			return this.frecuenciaActual;
	    		}
	    	}
    	}
    	
    	
    }
    

    public void setFavorito(int posicion) {
    	if (!this.encendido) {
    		System.out.print("Encender radio.");
    		return;
    	} else {
    		// guardar favorito
    	}
    	
    }
    

    public double getFavorito(int posicion) {
    	if (!this.encendido) {
    		System.out.print("Encender radio.");
    		return 0.0;
    	} else {
    		// buscar favorito
    		return 0.0;
    	}
    }
    
    public double get_frecuencia_actual() {
    	return this.frecuenciaActual;
    }
    

    public boolean cambiarAmFm() {
    	if (!this.encendido) {
    		System.out.print("Encender radio.");
    		return false;
    	} else {
	    	if (this.fm) {
	    		// FM -> AM
	    		this.fm = false;
	    		this.frecuenciaActual = 530;
	    		return true;
	    	} else {
	    		// AM -> FM
	    		this.fm = true;
	    		this.frecuenciaActual = 87.9;
	    		return true;
	    	}
    	}
    }
    
    public void apagar() {
    	if (this.encendido) {
    		this.encendido = false;
    		
    	} else {
    		System.out.println("Ya esta apagado!\n");
    	}
    }
    
	
}

//public class MyRadio {
//	public static void main(String[] args) {
//		
//	}
//	
//}
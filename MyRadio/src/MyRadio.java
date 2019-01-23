import java.util.InputMismatchException;
//import org.junit.Test;

import java.util.*;

/**
 * 
 */
/**
 * Lab 01
 * Interfaces y pruebas unitarios
 * 
 * Jose Block - 18020
 * Gerardo Pineda - 18848
 *
 */

 class Radio implements iRadio{
	public boolean OnyOff = false;
	public boolean AMoFM = false;
	public double AMfreq = 530;
	public double FMfreq = 87.9;
	public int posicion = 0;
	public double [] favoritos = new double [12];
	
	public boolean encendidoRadio() {
		if(this.OnyOff) {
			this.OnyOff = false;
		}
		else {
			this.OnyOff = true;
		}
		return this.OnyOff;
	}
	
	public boolean cambiarAmFm() {
		if(this.AMoFM) {
			this.AMoFM = false;
			return this.AMoFM;
		}
		else {
			this.AMoFM = true;
			return this.AMoFM;
		}
	}
	
	public double subirFrecuencia() {
		if(!this.AMoFM && this.AMfreq < 1610) {
			this.AMfreq += 10;
			return this.AMfreq;
		}
		else if(!this.AMoFM && this.AMfreq > 1610) {
			this.AMfreq = 530;
			return this.AMfreq;
		}
		else if(this.AMoFM && this.FMfreq < 107.9) {
			this.FMfreq += 0.2;
			return this.FMfreq;
		}
		else if(this.AMoFM && this.FMfreq > 107.9) {
			this.FMfreq = 87.9;
			return this.FMfreq;
		}
		else {
			return 69.69;
		}
		
	}

	public String toString(){
		if (this.AMoFM){
			System.out.println(this.FMfreq);
			return "FM";
		} else {
			System.out.println(this.AMfreq);
			return "AM";
		}
		

	}
	
	public double bajarFrecuencia() {
		if(!this.AMoFM && this.AMfreq > 530) {
			this.AMfreq -= 10;
			return this.AMfreq;
		}
		else if(!this.AMoFM && this.AMfreq < 530) {
			this.AMfreq = 1610;
			return this.AMfreq;
		}
		else if(this.AMoFM && this.FMfreq > 87.9) {
			this.FMfreq -= 0.2;
			return this.FMfreq;
		}
		else if(this.AMoFM && this.FMfreq < 87.9) {
			this.FMfreq = 107.9;
			return this.FMfreq;
		}
		else {
			return 420.42;
		}
	}
	
	public void setFavorito(int posicion) {
		posicion -= 1;
		if(this.AMoFM) {
			favoritos[posicion] = this.FMfreq;
		}
		else if(!this.AMoFM) {
			favoritos[posicion] = this.AMfreq;
		}
	}
	
	public double getFavorito(int posicion) {
		posicion -= 1;
		if(!this.AMoFM && favoritos[posicion] < 1610 && favoritos[posicion] > 530) {
			this.AMfreq = favoritos[posicion];
			return this.AMfreq;
		}
		else if(this.AMoFM && favoritos[posicion] < 107.9 && favoritos[posicion] > 87.9){
			this.FMfreq = favoritos[posicion];
			return this.FMfreq;
		}
		else {
			return 87.9;
		}
	}	
}



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
			
		this.encendido = !this.encendido;
    	return true;
    	
    }
    
    public double[] get_favs() {
    	return this.favoritos;
    }
    
    public double subirFrecuencia() {
    	//	luego de verificar si esta encendido y en que tipo de estacion
    	//	sube la frecuencia apropiadamente.
    	if (!this.encendido) {
    		System.out.print("Encender radio.\n");
    		return 0.0;
    	} else {
	    	/*
	    	 *  1. Revisar en que tipo de radio (AM / FM)
	    	 *  2. IF AM subir frecuencia actual += 10
	    	 *  3. else subir actual + 0.2
	    	 *  
	    	 */
	    	if (this.fm) {
	    		//	true significa estamos en FM
	    		if (this.frecuenciaActual == 107.9) {
					this.frecuenciaActual = 87.9;
					this.toString();
	    			return 87.9;
	    		} else {
					this.frecuenciaActual += 0.2;
					this.toString();
	    			return this.frecuenciaActual;
	    		}
	    		
	    	} else {
	    		// false entonces estamos en AM
	    		if (this.frecuenciaActual == 1610) {
					this.frecuenciaActual = 530;
					this.toString();
	    			return 530;
	    		} else {
					this.frecuenciaActual += 10;
					this.toString();
	    			return this.frecuenciaActual;
	    		}
	    	}
    	}
    	
    }
    
    public double bajarFrecuencia() {
    	//  Luego de verificar si esta encendido y en que tipo de estacion
    	//	disminuye la frecuencia apropiadamente.
    	if (!this.encendido) {
    		System.out.print("Encender radio.\n");
    		return 0.0;
    	} else {
	    	if (this.fm) {
	    		//	true significa estamos en FM
	    		if (this.frecuenciaActual == 87.9) {
					this.frecuenciaActual = 107.9;
					this.toString();
	    			return 107.9;
	    		} else {
					this.frecuenciaActual -= 0.2;
					this.toString();
	    			return this.frecuenciaActual;
	    		}
	    		
	    	} else {
	    		// false entonces estamos en AM
	    		if (this.frecuenciaActual == 530) {
					this.frecuenciaActual = 1610;
					this.toString();
	    			return 1610;
	    		} else {
					this.frecuenciaActual -= 10;
					this.toString();
	    			return this.frecuenciaActual;
	    		}
	    	}
    	}
    	
    	
    }
    
    public void setFavorito(int posicion) {
    	if (!this.encendido) {
    		System.out.print("Encender radio.\n");
    		return;
    	} else {
    		// guardar favorito
    		favoritos[posicion - 1] = this.get_frecuencia_actual();
    	}
    	
    }
    
    public double getFavorito(int posicion) {
    	if (!this.encendido) {
    		System.out.println("Encender radio.\n");
    		return 0.0;
    	} else {
    		// buscar favorito
    		return favoritos[posicion - 1];
    	}
    }
    
    public double get_frecuencia_actual() {
    	return this.frecuenciaActual;
    }
    
    public boolean cambiarAmFm() {
    	if (!this.encendido) {
    		System.out.print("Encender radio.\n");
    		return false;
    	} else {
	    	if (this.fm) {
	    		// FM -> AM
	    		this.fm = false;
				this.frecuenciaActual = 530;
				this.toString();
	    		return true;
	    	} else {
	    		// AM -> FM
	    		this.fm = true;
				this.frecuenciaActual = 87.9;
				this.toString();
	    		return true;
	    	}
    	}
    }
    
    public void apagar() {
    	if (this.encendido) {
			this.encendido = false;
			this.toString();
    		
    	} else {
    		System.out.println("Ya esta apagado!\n");
    	}
    }
    	
    public String toString() {
//    	String res;
    	if (this.encendido) {
	    	System.out.println("Modo actual:" + this.get_modo());
			System.out.println("Estacion actual:" + this.get_frecuencia_actual());
			System.out.println();
			
	    	return String.valueOf(this.get_frecuencia_actual());
    	} else {
    		System.out.println("Radio apagada");
    		return "Radio apagada";
    	}
    }
    
    public String get_modo() {
    	if (this.fm) {
    		return "FM";
    	} else {
    		return "AM";
    	}
    }
}

public class MyRadio {
	public static void main(String[] args) throws InputMismatchException{
		try {
		Scanner scan = new Scanner(System.in);
		iRadio laRadio = new Rad();
		int val = 0;
		String resp;
		int res;
		
		while (val != 8) {
			menu();
			res = scan.nextInt();
			
			switch(res) {
			
			case 1:{
				laRadio.encendidoRadio();
				break;
			}
			
			case 2:{
//				laRadio.get_frecuencia_actual();
				laRadio.toString();
				break;
			}
			
			case 3:{
				System.out.println("Que posicion desea guardar:");
				res = scan.nextInt();
				//	asumiendo que nos dan entero.
				while (res > 12 | res < 1) {
					System.out.println("Rango invalido");
					System.out.println("Que posicion desea guardar:");
					res = scan.nextInt();
				}
				laRadio.setFavorito(res);
				break;
			}
			
			case 4:{
				System.out.println("Que posicion desea ver:");
				res = scan.nextInt();
				//	asumiendo que nos dan entero.
				while (res > 12 | res < 1) {
					System.out.println("Rango invalido");
					System.out.println("Que posicion desea ver:");
					res = scan.nextInt();
				}
				laRadio.getFavorito(res);
				break;
			}
			
			case 5:{
				laRadio.cambiarAmFm();
				laRadio.toString();
				// L U L.
				break;
			}
			
			case 6:{
				laRadio.subirFrecuencia();
				break;
			}
			
			case 7:{
				laRadio.bajarFrecuencia();
				break;
			}
			
			case 8:{
				System.out.println("FIN");
				val = 8;
				break;
			}
			
			default:{
				System.out.println("Default");
				break;
				}
			}
			
		} 
		} catch (InputMismatchException e) {
			System.out.println("Argumento invalido, reiniciar");
//			e.printStackTrace();
		}
		
	}
	
	public static void menu() {
		System.out.println("1. Encender / apagar.");
		System.out.println("2. Estacion actual");
		System.out.println("3. Guardar favorito");
		System.out.println("4. Ver favorito");
		System.out.println("5. Cambiar AM/FM");
		System.out.println("6. Subir dial");
		System.out.println("7. Bajar dial");
		System.out.println("8. Salir");
		System.out.println("Ingresar opcion: ");
		
	}
	
}
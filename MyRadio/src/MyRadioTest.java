import static org.junit.Assert.*;
//import MyRadio.Rad;

import org.junit.Test;


public class MyRadioTest {

	@Test
	public void test_de_subir_frecuencia() {
		Rad laRadio = new Rad();
		double res = laRadio.bajarFrecuencia();
//		assertEquals(3.3, res);
//		assertCondition(ExcpetedValue, testedValue)
//		assertCondition(ExcpetedArray, testedArray)
		double frec = 88.1;
		assertEquals(frec, laRadio.frecuenciaActual);
	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void test_de_guardar_favorito() {
		Rad laRadio = new Rad();
		double[] arr_test = new double[12];
		arr_test[5] = 88.9;
		
		laRadio.setFavorito(5);
		// assertArrayEquals("Expected value", "Tested value");
		//	verificando que el valor se guardo en la misma posicion
		assertEquals(arr_test[5], laRadio.favoritos[5]);
		
	}
	
	@Test
	public void test_si_esta_apagado() {
		rad laRadio = new Rad();
		
	}

}

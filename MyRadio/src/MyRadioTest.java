import static org.junit.Assert.*;
//import MyRadio.Rad;

import org.junit.Test;


public class MyRadioTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test_de_subir_frecuencia() {
		Rad laRadio = new Rad();
		double res = laRadio.subirFrecuencia();
//		assertEquals(3.3, res);
//		assertCondition(ExcpetedValue, testedValue)
//		assertCondition(ExcpetedArray, testedArray)
		double frec = 88.1;
		assertEquals(frec, laRadio.get_frecuencia_actual());
	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void test_de_guardar_favorito() {
		Rad laRadio = new Rad();
		double[] arr_test = new double[12];
		arr_test[5] = 87.9;
		
		laRadio.setFavorito(5);
		// assertArrayEquals("Expected value", "Tested value");
		//	verificando que el valor se guardo en la misma posicion
		assertEquals(arr_test[5], laRadio.favoritos[5]);
		
	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void test_si_esta_apagado() {
		Rad laRadio = new Rad();
		double res;
		res = laRadio.bajarFrecuencia();
		assertEquals(0.0, res);
	}

}

import static org.junit.Assert.*;
//import MyRadio.Rad;

import org.junit.Test;


public class MyRadioTest {

	@Test
	public void test_subir_frecuencia_fm() {
		// revisar si la frecuencia cambia en el intervalo dado.
		Rad laRadio = new Rad();
		laRadio.encendidoRadio();
		double res = laRadio.subirFrecuencia();

//		assertCondition(ExcpetedArray, testedArray)
		double frec = 88.1;
		assertEquals(frec, res, 0.1);
	}
	
	@Test
	public void test_de_guardar_favorito() {
		//	verificar si los arreglos osn iguales al guardar los valores esperados
		Rad laRadio = new Rad();
		laRadio.encendidoRadio();
		double[] arr_test = new double[12];
		arr_test[4] = 87.9;
		laRadio.setFavorito(5);
		// assertArrayEquals("Expected value", "Tested value");
		//	verificando que el valor se guardo en la misma posicion
		assertArrayEquals(arr_test, laRadio.get_favs(), 0);

	}
	
	@Test
	public void test_si_esta_apagado() {
		//	ver si devuelve mensaje de encender la radio
		Rad laRadio = new Rad();
		double res;
		res = laRadio.bajarFrecuencia();
		System.out.print(String.valueOf(res));
		assertEquals(0.0, res, 0);
	}

}

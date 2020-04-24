package test;
import ejercicios.CalculosMatematicos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



class CalculosMatematicosTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@DisplayName(value = "Potencia")
	@ParameterizedTest
	@CsvSource(value = { "1,1,1", "2,2,4", "2,10,1024","5,11,48828125", "3,3,27" })
	public void potenciaTest(int base, int exponente, int resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.potencia(base, exponente));
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 5, 19, 79, 199, 13 })
	void esPrimoTest(int numero) {
		System.out.println(numero);
		assertTrue(CalculosMatematicos.esPrimo(numero));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 4, 8,100,777555222,1991,1115 })
	void esNoPrimoTest(int numero) {
		System.out.println(numero);
		assertFalse(CalculosMatematicos.esPrimo(numero));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 2, 20, 40,444 })
	void esParTest(int numero) {
		System.out.println(numero);
		assertTrue(CalculosMatematicos.esPar(numero));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 3, 11, 21, 33 })
	void noEsPar(int numero) {
		System.out.println(numero);
		assertFalse(CalculosMatematicos.esPar(numero));
	}
	

	@DisplayName(value = "FactorialDe")
	@ParameterizedTest
	@CsvSource(value = { "4,24", "3,6", "5,120" })
	public void potenciaTest(int numero, int resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.factorialDe(numero));
	}

}

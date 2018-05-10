package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	public void testsuma() {
		
	int	resultado = Calculadora.suma(5,6); 
	int esperado = 10;
	
	assertEquals(esperado, resultado);
	}
	
	@Test
	public void testresta() {
		
	int	resultado = Calculadora.resta(5,6); 
	int esperado = -1;
	
	assertEquals(esperado, resultado);
	}
}

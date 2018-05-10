package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void testsuma() {
		
	int	resultado = Calculadora.suma(5,5); 
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

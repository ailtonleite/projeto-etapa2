package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Conta;
import model.ContaEspecial;

public class ContaEspecialTest {
	private Conta c;
	
	@BeforeEach
	public void setup() {
		c = new ContaEspecial(55, 400, 100);
	}
	
	@Test
	public void returnTrueForSacarInEspecial() {
		boolean resultado = c.sacar(150);
		
		assertEquals(true, resultado);
	}
	
	@Test
	public void returnFalseForSacarInEspecial() {
		boolean resultado = c.sacar(750);
		
		assertEquals(false, resultado);
	}
	
	@Test
	public void returnTrueForSacarValuesOnLimit() {
		boolean resultado = c.sacar(450);
		
		assertEquals(true, resultado);
	}
	
	@Test
	public void returnFalseForSacarNegativeValuesInEspecial() {
		boolean resultado = c.sacar(-150);
		
		assertEquals(false, resultado);
	}
}

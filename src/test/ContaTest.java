package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;

public class ContaTest {
	private Conta c, ce;
	
	@BeforeEach
	public void setup() {
		c = new ContaCorrente(77, 400);
		ce = new ContaEspecial(77, 400, 100);
		
	}
	
	@Test
	public void returnTrueForSacar() {
		boolean resultado = c.sacar(150);
		
		assertEquals(true, resultado);
	}
	
	@Test
	public void returnFalseForSacarHighValues() {
		boolean resultado = c.sacar(450);
		
		assertEquals(false, resultado);
	}
	
	@Test
	public void returnFalseForSacarNegativeValues() {
		boolean resultado = c.sacar(-150);
		
		assertEquals(false, resultado);
	}
	
	@Test
	public void returnTrueForSacarInEspecial() {
		boolean resultado = ce.sacar(150);
		
		assertEquals(true, resultado);
	}
	
	@Test
	public void returnFalseForSacarInEspecial() {
		boolean resultado = ce.sacar(750);
		
		assertEquals(false, resultado);
	}
	
	@Test
	public void returnTrueForSacarValuesOnLimit() {
		boolean resultado = ce.sacar(450);
		
		assertEquals(true, resultado);
	}
	
	@Test
	public void returnFalseForSacarNegativeValuesInEspecial() {
		boolean resultado = ce.sacar(-150);
		
		assertEquals(false, resultado);
	}
	// Fazer testes para conta especial
	
	
}

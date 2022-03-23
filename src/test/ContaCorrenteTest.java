package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;

public class ContaCorrenteTest {
	private Conta c;
	
	@BeforeEach
	public void setup() {
		c = new ContaCorrente(77, 400);
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
	
	
	
}

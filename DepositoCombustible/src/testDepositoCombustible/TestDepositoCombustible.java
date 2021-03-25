package testDepositoCombustible;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestDepositoCombustible {

	
	
	
	@Test
	public void testGetDepositoNivel() {
		double depNivel=0;
		assertNotNull(depNivel);
	}

	@Test
	public void testGetDepositoMax() {
		double depMax=0;
		assertNotNull(depMax);
	}

	@Test
	public void testEstaVacio() {
		double depNivel=0;
		assertTrue(depNivel == 0);
	}

	@Test
	public void testEstaLleno() {
		double depNivel=0;
		double depMax=0;
		assertTrue(depNivel == depMax);
	}
	
	@Test
	public void testEstaLlenoMitad() {
		double depNivel=25;
		double depMax=50;
		assertTrue(depNivel == depMax/2);
	}

	

}

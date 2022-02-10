import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void getDepositoNivelTest() {
		DepositoCombustible depositoCombustible = new DepositoCombustible(40,20);
		assertEquals(20.0,depositoCombustible.getDepositoNivel(),0);
	}
	
	@Test
	void getDepositoMaxTest() {
		DepositoCombustible depositoCombustible = new DepositoCombustible(40,20);
		assertEquals(40.0,depositoCombustible.getDepositoMax(),0);
	}
	
	@Test
	void estaVacioTest() {
		DepositoCombustible depositoCombustible = new DepositoCombustible(40,0);
		assertTrue(depositoCombustible.estaVacio());
	}
	
	@Test
	void estaLlenoTest() {
		DepositoCombustible depositoCombustible = new DepositoCombustible(40,40);
		assertTrue(depositoCombustible.estaLleno());
	}
	
	@Test
	void fillTest() {
		DepositoCombustible depositoCombustible = new DepositoCombustible(40,20);
		depositoCombustible.fill(20);
		assertEquals(40.0,depositoCombustible.getDepositoNivel(),0);
		depositoCombustible.fill(20);
		assertEquals(60.0,depositoCombustible.getDepositoNivel(),0);
		depositoCombustible.fill(20);
		assertEquals(80.0,depositoCombustible.getDepositoNivel(),0);
	}
	
	@Test
	void consumirTest() {
		DepositoCombustible depositoCombustible = new DepositoCombustible(40,20);
		depositoCombustible.consumir(10);
		assertEquals(10.0,depositoCombustible.getDepositoNivel(),0);
		depositoCombustible.consumir(10);
		assertEquals(0.0,depositoCombustible.getDepositoNivel(),0);
		depositoCombustible.consumir(10);
		assertEquals(-10.0,depositoCombustible.getDepositoNivel(),0);
	}
}

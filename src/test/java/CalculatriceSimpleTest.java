import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceSimpleTest {

	@Test
	void testAddition() {
		CalculatriceSimple cal = new CalculatriceSimple();
		int attendu = 20;
		int obtenu = cal.addition1(12, 8);
		assertEquals(attendu,obtenu);
	}
	
	@Test
	void testDivision() {
		CalculatriceSimple cal = new CalculatriceSimple();
		assertThrows(ArithmeticException.class,()->cal.division(20,0));
	}
}

package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dividetesttrue {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(15,3);
		assertEquals(5, output);
	}

}

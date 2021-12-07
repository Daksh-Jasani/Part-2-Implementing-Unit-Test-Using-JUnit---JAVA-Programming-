package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dividetestfalse {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(15,3);
		assertEquals(3, output);
	}

}

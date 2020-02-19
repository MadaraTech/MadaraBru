package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
		SimpleCalc sc = new SimpleCalc();
	}

	@Test
	public void testAddInRange() {
		// TODO test addition for case where both numbers and result is in allowed range
		Integer result = SimpleCalc.add(3, 5);
		assertEquals(new Integer(8), result);
	}

	@Test
	public void testAddOutOfRange() {
		// TODO test addition for cases where both numbers and result is out of allowed
		// range
		Integer result = SimpleCalc.add(40, 10);
		assertNull("Input value 40 is out of range [-10, 10]", result);
	}

	@Test
	public void testSubtractInRange() {
		// TODO
		Integer result = SimpleCalc.subtract(3, 5);
		assertEquals(new Integer(-2), result);
	}

	@Test
	public void testSubtractOutOfRange() {
		// TODO
		Integer result = SimpleCalc.subtract(55, 15);
		assertNull("Input value 55 is out of range [-10, 10]", result);
	}

	@Test
	public void testMultiplyInRange() {
		// TODO
		Integer result = SimpleCalc.multiply(2, 4);
		assertEquals(new Integer(8), result);
	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO
		Integer result = SimpleCalc.multiply(11, 3);
		assertNull("Input value 11 is out of range [-10, 10]", result);
	}

	@Test
	public void testDivideInRange() {
		// TODO
		Integer result = SimpleCalc.divide(6, 3);
		assertEquals(new Integer(2), result);
	}

	@Test
	public void testDivideOutOfRange() {
		// TODO
		Integer result = SimpleCalc.divide(200, 20);
		assertNull("Input value 200 is out of range [-10, 10]", result);
	}

}

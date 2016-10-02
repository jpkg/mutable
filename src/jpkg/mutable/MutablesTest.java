package jpkg.mutable;

import static org.junit.Assert.*;
import org.junit.Test;

import jpkg.test.TestManager;

public class MutablesTest {
	public static void main(String[] args) {
		test();
		TestManager.runTests();
	}
	
	public static void test() {
		TestManager.addTest(MutablesTest.class);
	}
	
	@Test
	public void testInteger() {
		MutableInteger mi = new MutableInteger(0);
		assertEquals("0", mi.toString());
		mi.increment();
		assertEquals("1", mi.toString());
		assertEquals(1, mi.intValue());
		mi.changeBy(-12);
		assertEquals(-11, mi.intValue());
		mi.set(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, mi.get());
		assertEquals(mi.intValue(), mi.get());
	}
	
	@Test
	public void testLong() {
		MutableLong mi = new MutableLong(0);
		assertEquals("0", mi.toString());
		mi.increment();
		assertEquals("1", mi.toString());
		assertEquals(1, mi.intValue());
		mi.changeBy(-12);
		assertEquals(-11, mi.intValue());
		mi.set(Long.MAX_VALUE);
		assertEquals(Long.MAX_VALUE, mi.get());
		assertEquals(mi.get(), mi.longValue());
	}
}

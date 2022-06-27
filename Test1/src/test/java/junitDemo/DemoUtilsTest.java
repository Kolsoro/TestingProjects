package junitDemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.samer.test.DemoUtils;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

	DemoUtils demoUtils;

	@BeforeEach
	void setUpBeforeEach() {
		// set up

		demoUtils = new DemoUtils();
	}

	@Test
	@DisplayName("Equals and Not Equals ")
	@Order(1)
	void testEqualsAndNotEquals() {

		// assert
		assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
		assertNotEquals(8, demoUtils.add(2, 4), "2 + 4 must not be 8");

	}

	@Test
	@DisplayName("Null and Not Null")
	@Order(0)
	void testNullAndNotNull() {

		// setup
		String s1 = null;
		String s2 = "hello";

		// assert
		assertNull(demoUtils.isNull(s1), "Object o must  be null");
		assertNotNull(demoUtils.isNull(s2), "Object  must not be null");

	}

	@Test
	@DisplayName("Same or not same")
	void testSameAndNotSame() {
		String str = "luv2Code";
		assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to same object ");
		assertNotSame(str, demoUtils.getAcademy(), "objects should not be same ");
	}

	@Test
	@DisplayName("Test True or False")
	void testTrueFalse() {
		int n1 = 10;
		int n2 = 5;
		assertTrue(demoUtils.isGreater(n1, n2), "n1 should be greater than n2 ");
		assertFalse(demoUtils.isGreater(n2, n1), "n2 should be lesser than n1 ");

	}

	@Test
	@DisplayName("Array equals")
	void TestArrayEquals() {
		String[] stringArray = { "A", "B", "C" };
		assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "arrys shoild be equal");

	}

	@Test
	@DisplayName("Iterable equals")
	void TestIterableEquals() {
		List<String> list = Arrays.asList("Luv", "2", "Code");
		assertIterableEquals(list, demoUtils.getAcademyInList(), "expected list should be same as actual list");

	}

	@Test
	@DisplayName("Lines Match'")
	void testLinesMatch() {
		List<String> list = Arrays.asList("Luv", "2", "Code");
		assertIterableEquals(list, demoUtils.getAcademyInList(), "expected list should be same as actual list");

	}

	@Test
	@DisplayName("Throws And Not Throws")
	void testThrowsAndNotThrows() {

		assertThrows(Exception.class, () -> {
			demoUtils.throwException(-1);
		}, "should throw exception");

		assertDoesNotThrow(() -> {
			demoUtils.throwException(9);
		}, "should not throw exception");
	}

	@Test
	@DisplayName("TimeOut")
	void testTimeOut() {
		assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
			demoUtils.checkTimeOut();
		}, "message should be executed in atmost 3 seconds");
	}
 
	/*
	 * @AfterEach void tearDownAfterEach() {
	 * System.out.println("Running @AfetrEach"); System.out.println(); }
	 * 
	 * @BeforeAll static void setUpBeforeEachClass() {
	 * System.out.println("@BeforeAll executes once before all the test methods"); }
	 * 
	 * @AfterAll static void tearDownAfterAll() { System.out.
	 * println("@AfterAll executes only once after all the test methods in class");
	 * }
	 */

}

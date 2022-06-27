package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

	// if n divisible by 3 Fizz
	// if n divisible by 5 Buzz
	// if n divisible by 3 & 5 FizzBuzz
	// if n not divisible by 3 & 5 number

	@Order(1)
	@Test
	@DisplayName("Divisible by 3")
	void testForDivisibleByThree() {

		String expected = "Fizz";
		assertEquals(expected, FizzBuzz.computer(3), "should return fizz");

	}

	@Order(2)
	@Test
	@DisplayName("Divisible by 5")
	void testForDivisibleByFive() {

		String expected = "Buzz";
		assertEquals(expected, FizzBuzz.computer(5), "should return Bizz");

	}

	@Order(3)
	@Test
	@DisplayName("Divisible by 3 and 5")
	void testForDivisibleByThreeAndFive() {

		String expected = "FizzBuzz";
		assertEquals(expected, FizzBuzz.computer(15), "should return FizzBizz");

	}

	@Order(4)
	@Test
	@DisplayName("Not Divisible by 3 or 5")
	void testForNotDivisibleByThreeAndFive() {

		String expected = "1";
		assertEquals(expected, FizzBuzz.computer(1), "should return 1");

	}

	@Order(5)
	@ParameterizedTest(name = "value={0},expected={1}")
	@DisplayName("Testing with small data file")
	@CsvFileSource(resources = "/small-test-data.csv")
	void testSmallDataFile(int value, String expected) {

		assertEquals(expected, FizzBuzz.computer(value));

	}

	@Order(6)
	@ParameterizedTest(name = "value={0},expected={1}")
	@DisplayName("Testing with medium data file")
	@CsvFileSource(resources = "/medium-test-data.csv")
	void testMediumDataFile(int value, String expected) {

		assertEquals(expected, FizzBuzz.computer(value));

	}

	@Order(7)
	@ParameterizedTest(name = "value={0},expected={1}")
	@DisplayName("Testing with large data file")
	@CsvFileSource(resources = "/large-test-data.csv")
	void testLargeDataFile(int value, String expected) {

		assertEquals(expected, FizzBuzz.computer(value));

	}

}

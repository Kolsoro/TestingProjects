package tdd;

public class FizzBuzz {

	// if n divisible by 3 Fizz
	// if n divisible by 5 Buzz
	// if n divisible by 3 & 5 FizzBuzz
	// if n not divisible by 3 & 5 number

	public static String computer(int i) {

		StringBuilder result = new StringBuilder();

		if (i % 3 == 0)
			result.append("Fizz");
		if (i % 5 == 0)
			result.append("Buzz");
		if (result.length() == 0)
			result.append(i);

		return result.toString();
	}

//	public static String computer(int i) {
//		if (i % 3 == 0 && i % 5 == 0)
//			return "FizzBuzz";
//		else if (i % 3 == 0)
//			return "Fizz";
//		else if (i % 5 == 0)
//			return "Buzz";
//		else
//			return Integer.toString(i);
//	}

}

package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional { 
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
		//printSquaresOfEvenNumbersInListFunctional(numbers);
	}

//	 private static void print(int number) {
//	 System.out.println(number);
//	 }

	// private static boolean isEven(int number) {
	// return number%2 == 0;
	// }

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// What to do?
		numbers.stream().forEach(System.out::println);// Method Reference
		
		//numbers.stream().forEach(FP01Functional::print);
		
	}

	// number -> number%2 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// What to do?

		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference

		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				//mapping - x -> x * x
				.map(number -> number * number)
				.forEach(System.out::println);// Method Reference

		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}

}

package br.com.lambda.expressions.samples;

import java.util.ArrayList;

/**
 * @author Edenir Stofel
 */

public class SamplesLambda2 {

	public static void main(String[] args) {
		ArrayList<Integer> listNumber = new ArrayList<>();
		listNumber.add(1);
		listNumber.add(8);
		listNumber.add(20);
		listNumber.add(3);
		listNumber.add(6);

		listNumber.forEach(number -> {
			System.out.println(number);
		});

		// order
		listNumber.sort((number1, number2) -> Integer.compare(number1, number2));
		listNumber.forEach(order -> {
			System.out.println(order);
		});
	}
}

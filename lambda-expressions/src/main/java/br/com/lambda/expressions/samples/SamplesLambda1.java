package br.com.lambda.expressions.samples;

import java.util.ArrayList;

/**
 * @author Edenir Stofel
 */
public class SamplesLambda1 {
	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<>();
		ArrayList<String> newListFruit = new ArrayList<>();
		fruit.add("banana");
		fruit.add("grape");
		fruit.add("apple");
		fruit.add("strawberry");

		fruit.forEach(fruits -> {
			newListFruit.add(fruits);
			System.out.println("current list" + fruits);
			System.out.println("new list" + fruits);

		});

	}
}

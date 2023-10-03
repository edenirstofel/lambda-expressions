package br.com.lambda.expressions.samples;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author Edenir Stofel
 */
public class SamplesLambda4 {

	public static void main(String[] args) {

		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("banana");
		fruit.add("grape");
		fruit.add("apple");
		fruit.add("strawberry");
		
		//filter all names starting with a
		fruit.stream().filter(l -> l.toUpperCase().startsWith("a")).forEach(System.out::print);
		fruit.stream().filter(l -> l.length() > 4).forEach(System.out::print);

		//@// @formatter:off
		 ArrayList<Integer> collect = (ArrayList<Integer>) fruit.stream().map(l -> l.length()).collect(Collectors.toList());
		// @formatter:on

		collect.forEach(System.out::print);

		
		//https://receitasdecodigo.com.br/java/exemplos-de-utilizacao-de-lambdas-expressions
		
	}
}
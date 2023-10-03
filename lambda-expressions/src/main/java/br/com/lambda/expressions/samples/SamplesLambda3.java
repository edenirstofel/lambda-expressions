package br.com.lambda.expressions.samples;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.lambda.expressions.model.Car;

/**
 * @author Edenir Stofel
 */

public class SamplesLambda3 {

	public static void main(String[] args) {

		Car car1 = new Car(1, "ford");
		Car car2 = new Car(2, "renault");
		Car car3 = new Car(3, "cherry");
		Car car4 = new Car(4, "fiat");
		Car car5 = new Car(5, "jeep");

		ArrayList<Car> cars = new ArrayList<>();

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);

		System.out.println("sort by id");
		cars.sort((c1, c2) -> Integer.compare(c1.getId(), c2.getId()));

		cars.forEach(i -> {
			System.out.println(i);
		});

		System.out.println("sort by name");
		cars.sort((n1, n2) -> n1.getName().compareTo(n2.getName()));

		cars.forEach(i -> {
			System.out.println(i);
		});
		
		System.out.println("sort by name comparator");
		cars.sort(Comparator.comparing(i1 -> i1.getName()));
		
		cars.forEach(i1 -> {
			System.out.println(i1);
		});
		
	}

}

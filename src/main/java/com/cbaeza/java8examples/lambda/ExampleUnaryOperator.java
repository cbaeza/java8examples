package com.cbaeza.java8examples.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Example of UnaryOperator
 * <br/>
 *
 * @author carlos.baeza , carlos.baeza@posteo.de<br/>
 * @since 06.01.16
 */
public class ExampleUnaryOperator {

	public static void main(String[] args) {

		UnaryOperator<String> operator = t -> t.replace("_", "");
		List<String> strings = Arrays.asList("1_", "2_", "_4", "6_");

		strings.replaceAll(t -> operator.apply(t));
		strings.forEach(System.out::println);
	}

}

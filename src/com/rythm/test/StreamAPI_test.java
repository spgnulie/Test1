package com.rythm.test;

import java.util.stream.*;

public class StreamAPI_test {
	public static void main(String[] args) {
		Stream.of("a", "b", "c", "", "e", "f").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
		System.out.printf("%n--------------------%n");
		Stream.of("a", "b", "c", "", "e", "f").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);
		System.out.printf("%n--------------------%n");
		IntStream.iterate(3, x -> x < 10, x -> x + 3).forEach(System.out::print);
		System.out.printf("%n--------------------%n");
		
		int[] myarray= {1,2,3};
		long count = Stream.ofNullable(myarray).count();
		System.out.println(count);
		count = Stream.ofNullable(null).count();
		System.out.println(count);
	}
}
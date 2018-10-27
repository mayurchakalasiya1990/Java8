package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperIntExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mayur", "Jeetu", "Nilesh", "Bhavesh");

		List<User> userNames = names.stream().filter(name -> !name.equals("Mayur")).map(name -> new User(name, 27))
				.collect(Collectors.toList());

		int sumOfAge = userNames.stream().mapToInt(user -> user.getAge()).sum();
		System.out.println("Sum Of Age:" + sumOfAge);
	}

}

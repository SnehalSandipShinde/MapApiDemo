package com.prowings.hashmap;

import java.util.HashMap;

public class TestForHashCodeMethod {

	public static void main(String[] args) {
		Employee e1 = new Employee("Vijay", 06, 26, 39000);
		Employee e2 = new Employee("Vijay", 06, 26, 39000);
		Employee e3 = new Employee("Vijay", 06, 26, 39000);
		Employee e4 = new Employee("Vijay", 06, 26, 39000);
		
		HashMap<Employee, String> empMap = new HashMap<>();
		empMap.put(e1, "First Employee");
		empMap.put(e2, "Second Employee");
		empMap.put(e3, "Third Employee");
		empMap.put(e4, "Fourth Employee");
		
		System.out.println(empMap.size());
		empMap.entrySet().stream().forEach(System.out::println);
	}
}

package com.prowings.collections_demo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityDemo {
	
	public static void main(String[] args) {
		
			Employee emp1 = new Employee("Vijal", 12);
			Employee emp2 = new Employee("Sachin", 13);
			Employee emp5 = new Employee("Vijal", 11);
			Employee emp3 = new Employee("Utkarsha", 14);
			Employee emp4 = new Employee("Pooja", 15);

			ArrayList<Employee> employee = new ArrayList<>();
			employee.add(emp1);
			employee.add(emp2);
			employee.add(emp3);
			employee.add(emp4);
			employee.add(emp5);
			
			System.out.println(employee);
//			
//			Collections.swap(employee, 0, 1);
//			
//			System.out.println("After swapping: \n"+ employee );
			
//			Collections.shuffle(employee);
			
//			System.out.println("After shuffle: \n"+ employee );
			
			System.out.println("min element:- " +Collections.min(employee));
			
	}

}

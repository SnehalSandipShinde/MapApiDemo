package com.prowings.collections_demo;

public class Employee implements Comparable<Employee>{

	String name;
	int id;

	public Employee() {
		super();
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(e.id == this.id)
			return 0;
		else if(e.id > this.id)
			return -1;
		else			
			return 0;
	}

}

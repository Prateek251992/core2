package com.rays.Hiding;

public class Employee extends Person {
	
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name , String address , int salary) {
		super(name , address);
		System.out.println(salary);
   	//System.out.println("name");
		
		
	}

}

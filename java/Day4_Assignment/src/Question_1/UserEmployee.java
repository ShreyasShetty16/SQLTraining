package com.sonata.Question_1;


public class UserEmployee extends Employee {
	
	public static void main(String args[]) {
		
		Employee e1= new Employee();
		e1.setEid(1);
		e1.setEname("Shreyas");
		e1.setEsal(50000);
		
		EmployeeImpl l1= new EmployeeImpl();
		l1.setEid(2);
		l1.setEname("Sam");
		l1.setEsal(8000);
		
		System.out.println(l1);
		
		System.out.println("Salary of Sam "+ l1.yearSalary(l1));
		System.out.println("incremented salary of Sam " +l1.appSalary(l1));

		
		System.out.println(e1);
		
	}

}
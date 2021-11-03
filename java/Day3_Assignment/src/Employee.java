package com.sonata;

public class Employee {
	int empId;
	String empName;
	double empSalary;
	double ta;
	double hra;
	double da;
	// Default Constructor
	public Employee() {}
	
	//Constructor with salary parameters
	public Employee(int id,String name,double sal)
	{
		this.empId=id;
		this.empName=name;
		this.empSalary=sal;
	}
	public double salCal(double ta,double hra,double da) {
		double totalSal=empSalary+ta+hra+da;
		System.out.println("Parent Class");
		return totalSal;
	}
	public void display(double totalSalary) {
		System.out.println("Emp ID : "+empId);
		System.out.println("Emp Name : "+empName);
		System.out.println("Emp Base Salary : "+empSalary);
		System.out.println("Emp Total Salary : "+totalSalary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empId=1;
		e1.empName="Shreyas";
		e1.empSalary=40000;
		double total1=e1.salCal(1500, 2000, 1800);
		e1.display(total1);
		
		Employee e2 = new Employee(2,"Naveen",35000);
		double total2=e2.salCal(1500, 2000, 1800);
		e2.display(total2);

	}

}

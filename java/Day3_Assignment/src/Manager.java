package com.sonata;

public class Manager extends Employee{
	Manager(int id,String name,double sal)
	{
		super(id,name,sal);
	}
	Manager(){};
	
	public double totalSalary(double ta,double hra,double da) {
		super.salCal(this.ta, this.hra, this.da);
		double totalSal=empSalary+ta+hra+da;
		System.out.println("Child Class");
		return totalSal;
	}

	public static void main(String[] args) {
		Manager m = new Manager();
		m.empId=1;
		m.empName="Shreyas";
		m.empSalary=60000;
		double sal=m.totalSalary(2000, 3000, 1800);
		m.display(sal);
		
		Manager m2 = new Manager(2,"Sam",55000);
		double sal2=m2.totalSalary(2000, 2500, 1500);
		m2.display(sal2);

	}

}

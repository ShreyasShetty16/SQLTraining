package com.sonata.Question4;


public class EmployeeMain extends Employee{

	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setCity("Belagavi");
		a1.setState("Karnataka");
		a1.setPin(590006);
		
		TechnicalEmployee e1 = new TechnicalEmployee();
		e1.setEmpId(1);
		e1.setEmpName("Shreyas");
		e1.setBasicPay(50000);
		e1.setObj(a1);
		e1.setNoOfLeavesAvailable(5);
		e1.setSkills("C,Java,PHP");
		double sal=e1.calSal(e1.getBasicPay());
		System.out.println(e1);
		System.out.println("Final Salary ="+sal);
		
		System.out.println();
		
		Staff s1 = new Staff();
		s1.setEmpId(2);
		s1.setEmpName("Sam");
		s1.setBasicPay(35000);
		s1.setObj(a1);
		s1.setNoOfLeavesAvailable(5);
		s1.setTitle("Security");
		double sal2=s1.calSal(s1.getBasicPay());
		System.out.println(s1);
		System.out.println("Final Salary ="+sal2);

	}

}

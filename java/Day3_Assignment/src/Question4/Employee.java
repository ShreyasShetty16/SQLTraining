package com.sonata.Question4;



public  abstract class Employee {
	private int empId;
	private String empName;
	Address obj;
	private double basicPay;
	private int noOfLeavesAvailable;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public int getNoOfLeavesAvailable() {
		return noOfLeavesAvailable;
	}
	public void setNoOfLeavesAvailable(int noOfLeavesAvailable) {
		this.noOfLeavesAvailable = noOfLeavesAvailable;
	}
	public double calSal(double basic)
	{
		return basic;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", obj=" + obj + ", basicPay=" + basicPay
				+ ", noOfLeavesAvailable=" + noOfLeavesAvailable + "]";
	}
	
	
}

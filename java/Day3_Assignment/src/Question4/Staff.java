package com.sonata.Question4;

public class Staff extends Employee{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public double calSal(double basic)
	{
		super.calSal(basic);
		return basic+((basic*18)/100);
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + ", obj=" + obj + ", getTitle()=" + getTitle() + ", toString()=" + super.toString()
				+"]";
	}

	
}

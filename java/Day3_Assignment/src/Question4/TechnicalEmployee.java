package com.sonata.Question4;

public class TechnicalEmployee extends Employee{
	private String skills;

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	public double calSal(double basic)
	{
		super.calSal(basic);
		return basic+((basic*12)/100);
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [skills=" + skills + ", toString()="
				+ super.toString() + "]";
	}

	
}

package com.sonata;

public class Assignment_Classes_1 {
	int stdId;
	String stdName;
	int stdClass;
	
	public Assignment_Classes_1(int id,String name,int classno)
	{
		this.stdId=id;
		this.stdName=name;
		this.stdClass=classno;
	}

	public void display() {
		System.out.println("Student Id : "+stdId);
		System.out.println("Student Name : "+stdName);
		System.out.println("Student Class : "+stdClass);
	}
	public static void main(String[] args) {
		Assignment_Classes_1 s1=new Assignment_Classes_1(1,"Shreyas",10);
		s1.display();

	}
}

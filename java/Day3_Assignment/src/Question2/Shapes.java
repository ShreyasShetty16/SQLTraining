package com.sonata.Question2;

public class Shapes {
	int height;
	int width;
	int length;
	Shapes(int height,int width, int length)
	{
		this.height=height;
		this.width=width;
		this.length=length;
	}
	Shapes(){};

	public double area(int width,int length)
	{
		return length*width;
	}
	public double area(int height)
	{
		return height*height;
	}
	public double area(int height,int width, int length)
	{
		return (0.5*height*width);
	}
	
	public static void main(String args[])
	{
		Shapes sq = new Shapes();
		double area1=sq.area(5);
		System.out.println("Area :"+area1);
		Shapes tr = new Shapes();
		double area2=tr.area(5, 3);
		System.out.println("Area :"+area2);
		Shapes re = new Shapes();
		double area3=re.area(5, 8, 3);
		System.out.println("Area :"+area3);
		
	}
}

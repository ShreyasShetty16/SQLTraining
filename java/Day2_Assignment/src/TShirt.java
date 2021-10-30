package com.sonata;

public class TShirt {
	String color;
	String material;
	String design;
	String size;
	int sizeno;
	TShirt(String color,String material,String design)
	{
		this.color=color;
		this.material=material;
		this.design=design;
		this.size="small";
		System.out.println("Small T-Shirt");
	}
	TShirt(String color,String material,String design,int sizeno)
	{
		this.color=color;
		this.material=material;
		this.design=design;
		this.sizeno=sizeno;
		System.out.println("Large T-Shirt");
	}
	TShirt(String color,String material,String design,String size)
	{
		this.color=color;
		this.material=material;
		this.design=design;
		this.size=size;
		System.out.println("Xtra-Large T-Shirt");
	}
	public void display() {
		System.out.println("Color :"+color);
		System.out.println("Material :"+material);
		System.out.println("Design :"+design);
		System.out.println();
	}
	public static void main(String[] args) {
		TShirt small = new TShirt("Blue","Cotton","Plain Solid");
		small.display();
		TShirt large = new TShirt("Black","Cotton","Printed",44);
		large.display();
		TShirt xtra_large = new TShirt("Brown","Cotton","Printed","xl");
		xtra_large.display();
		
		

	}

}

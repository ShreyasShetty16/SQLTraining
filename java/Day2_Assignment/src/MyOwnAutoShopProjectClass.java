package com.sonata;

class car {
	int speed;
	double regularPrice;
	String color;
	car(){};
	car(int speed,double regularPrice,String color)
	{
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	double getSalePrice() {
		return regularPrice;
	}
	public void display() {
		System.out.println("Speed : "+speed);
		System.out.println("Regular Price : "+regularPrice);
		System.out.println("Color : "+color);


	}
}	
 class truck extends car{
	
		int weight;
		truck(){};
		truck(int speed,double regularPrice,String color,int weight)
		 {
			 super(speed,regularPrice,color);
			 this.weight=weight;
		 }
		double getSalePrice() {
			if(weight>2000)
				return regularPrice-((regularPrice*10)/100);
			return regularPrice-((regularPrice*20)/100);
		}
		public void display() {
			super.display();
			System.out.println("Weight : "+weight);
		}
		
	}
 
 class ford extends car{
	 int year;
	 int manufacturerDiscount;
	 ford(){};
	 ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount)
	 {
		 super(speed,regularPrice,color);
		 this.year=year;
		 this.manufacturerDiscount=manufacturerDiscount;
	 }
	 double getSalePrice() {
		 return regularPrice-((regularPrice*manufacturerDiscount)/100);
	 }
	 public void display() {
			super.display();
			System.out.println("Year : "+year);
			System.out.println("Manufacturer's Discount : "+manufacturerDiscount);
		}
 }
 
 class sedan extends car{
	 int length;
	 sedan(){};
	 sedan(int speed,double regularPrice,String color,int length)
	 {
		 super(speed,regularPrice,color);
		 this.length=length;
	 }
	 double getSalePrice() {
		 super.getSalePrice();
		 if(length>20)
			 return regularPrice-((regularPrice*5)/100);
		 return regularPrice-((regularPrice*10)/100);
	 }
	 public void display() {
			super.display();
			System.out.println("Length : "+length);
		}
 }
public class MyOwnAutoShopProjectClass {

	public static void main(String[] args) {
		sedan s1 = new sedan(100,30000,"blue",25);
		double saleprice = s1.getSalePrice();
		s1.display();
		System.out.println("Sale Price : "+saleprice);
		System.out.println();
		
		ford f1 = new ford(150,40000,"silver",2010,15);
		double salepriceford=f1.getSalePrice();
		f1.display();
		System.out.println("Sale Price : "+salepriceford);
		System.out.println();
		
		ford f2 = new ford(180,70000,"white",2016,8);
		double salepriceford2=f2.getSalePrice();
		f2.display();
		System.out.println("Sale Price : "+salepriceford2);
		System.out.println();
		
		car c1 = new car(120,40000,"red");
		double cprice=c1.getSalePrice();
		c1.display();
		System.out.println("Sale Price : "+cprice);
		System.out.println();
		
//		truck t1 = new truck(80,100000,"brown",3000);
//		double tprice=t1.getSalePrice();
//		t1.display();
//		System.out.println("Sale Price : "+tprice);
//		System.out.println();
		

	}

}

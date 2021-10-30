package com.sonata;

public class Product {
	int ProID;
	String ProName;
	int ProPrice;
	Product(int id,String name,int price){
		this.ProID=id;
		this.ProName=name;
		this.ProPrice=(price+(price*18)/100);
	}
	public void display() {
		System.out.println("Product ID :"+ProID);
		System.out.println("Product Name :"+ProName);
		System.out.println("Product Price :"+ProPrice);
	}
	public static void main(String[] args) {
		Product p1 = new Product(1,"Table",10000);
		Product p2 = new Product(2,"Chair",8000);
		p1.display();
		p2.display();

	}

}

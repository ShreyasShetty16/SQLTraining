package com.sonata;

import com.sonata.CustomException;

public class CallCustomException {

	public static void main(String[] args) throws CustomException {
		int salary = 10000;
		if(salary<100000)
		{
			throw new CustomException("Salary Below Rs. 1,00,000");
		}
		else
		{
			System.out.println("Salaary Above Rs. 1,00,000");
		}
	}

}

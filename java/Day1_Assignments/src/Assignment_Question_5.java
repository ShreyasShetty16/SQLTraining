package com.sonata;

public class Assignment_Question_5 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int key = 4;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Number is Present in the Array");
		}
		else {
		System.out.println("Number is Not Present in the Array");
		}

	}

}

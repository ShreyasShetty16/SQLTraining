package com.sonata;

public class Assignment_Question_8 {

	public static void main(String[] args) {
		int arr[] = {2,4,1,5,4,1,2};
		System.out.println("Duplicate Elements :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}

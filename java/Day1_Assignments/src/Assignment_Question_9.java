package com.sonata;

public class Assignment_Question_9 {

	public static void main(String[] args) {
		int arr[] = {2,4,1,5,4,1,2,4};
		int max = 0;
		int element = 0;
		for(int i=0;i<arr.length;i++)
		{
			int counter=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					counter++;
				}
			}
			if(max<counter)
			{
				max=counter;
				element=arr[i];
			}
		}

		System.out.println("The Max Repeated Number is : "+element);
	}

}

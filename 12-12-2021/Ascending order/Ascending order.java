package vinodha.java;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
	int arr[]= {5,2,8,7,1};
	int temp=0;
	System.out.println("Before swapping");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int j=1;j<arr.length;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After swapping");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

package vinodha.java;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[]args) {
		int n;
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total sub:");
		n=sc.nextInt();
		int arr[]=new int[5];
		System.out.println("Enter the marks:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			total=total+arr[i];
		}
		System.out.println("Total marks is:"+total);
	}

}

package vinodha.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int  n,i;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(n+" is a prime number");
		}

	}

}

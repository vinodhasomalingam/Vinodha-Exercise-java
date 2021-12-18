package vinodha.java;
import java.util.Scanner;
public class If {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st num:");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd num:");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greater");
		}
		else
		{
			System.out.println("num2 is greater");
		}

	}

}

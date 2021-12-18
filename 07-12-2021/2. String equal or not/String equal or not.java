package vinodha.java;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
	String  t1,t2;
	Scanner sc=new Scanner(System.in);
	System.out.println("string1 is:");
	t1=sc.nextLine();
	System.out.println("String2 is:");
	t2=sc.nextLine();
	if(t1.equals(t2)) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
	}

}

package vinodha.java;

public class Static {
	static int  a=10;//variable
	static int b=20;
	
	static void function(int c)//method
	{
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("C value is "+c);
	}
	
	static //block
	{
		a=b+10;
	}

	public static void main(String[] args) {
		function(10);

	}

}

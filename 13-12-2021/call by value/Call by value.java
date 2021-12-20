package vinodha.java;

public class CallByValue {

	public static void main(String[] args) {
		int a=30;
		System.out.println("Before Changing a value is: "+a);
		value(a);
		System.out.println("After Changing a value is: "+a);

	}
	public static void value(int a)
	{
		a=50;
	}

}

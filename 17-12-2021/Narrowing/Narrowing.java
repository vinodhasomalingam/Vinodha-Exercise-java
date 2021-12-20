package vinodha.java;

public class Narrowing {

	public static void main(String[] args) {
		double x=111;
		long y=(long)x;
		int z=(int)y;
		System.out.println("double type value "+x);
		System.out.println("long type value "+y);
		System.out.println("int type value "+z);

	}

}

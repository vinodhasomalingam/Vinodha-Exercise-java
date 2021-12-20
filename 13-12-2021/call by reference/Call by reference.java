package vinodha.java;

public class CallByReference {
	int a=10;
	
	public static void reference(CallByReference ob)
	{
		ob.a=50;
	}

	public static void main(String[] args) {
	CallByReference ob=new CallByReference();
	System.out.println("Before changing a value is: "+ob.a);
	reference(ob);
	System.out.println("After changing a value is: "+ob.a);

	}
	
	
}

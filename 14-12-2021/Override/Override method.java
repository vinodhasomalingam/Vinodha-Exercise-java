package vinodha.java;
class Base{
	void override()
	{
		System.out.println("I love dogs");
	}
}
public class Child extends Base{
	void override() {
		System.out.println("I love parrot");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.override();//call the method in child class

	}

}

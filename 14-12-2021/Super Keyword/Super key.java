package vinodha.java;
class Parent
{
	String name="vinodha";
}
public class SuperKey extends Parent {
	String name="dori";
	
	void display() {
		System.out.println("Name is "+name);
		System.out.println("Name is "+super.name);
	}
	public static void main(String[] args) {
		SuperKey obj=new SuperKey();
		obj.display();

	}

}

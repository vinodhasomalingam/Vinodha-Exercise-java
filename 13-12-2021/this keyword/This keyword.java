package vinodha.java;

public class ThisKeyword {
	int x;
	int y;
	
	void setdata(int x, int y )
	{
		this.x=x;
		this.y=y;
	}
	void displaydata()
	{
		System.out.println("The value of x: "+x);
		System.out.println("The value of y: "+y);
	}

	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword();
		obj.setdata(2, 3);
		obj.displaydata();
		

	}

}

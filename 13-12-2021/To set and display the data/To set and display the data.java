package vinodha.java;

public class Room {
	int roomno;
	String roomtype;
	float roomarea;
	
	void setdata(int x,String y,float z)
	{
		roomno=x;
		roomtype=y;
		roomarea=z;
	}
	
	void displaydata()
	{
		System.out.println("The room no is: "+roomno);
		System.out.println("The room type of the room is: "+roomtype);
		System.out.println("The room area of the room is:  "+roomarea);
	}

	public static void main(String[] args) {
		Room obj=new Room();
		obj.setdata(111, "AC", 221.0f);
		obj.displaydata();

	}

}

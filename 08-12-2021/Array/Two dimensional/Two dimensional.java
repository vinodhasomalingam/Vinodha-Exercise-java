package vinodha.java;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}

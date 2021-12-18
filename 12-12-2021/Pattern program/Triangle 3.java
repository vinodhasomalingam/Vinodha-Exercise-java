package vinodha.java;

public class Triangle3 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i==j)||(j==1))
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println("");
			i++;
		}

	}

}

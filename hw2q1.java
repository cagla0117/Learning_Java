
public class Hw2q1 {
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		for(int j = 0; j <2*a-1; j++)
		{
			for(int i = 0; i <2*a-1; i++)
			{
				if(a>j)
				{
					if(i<a-j-1 || i>a+j-1)
					{
						System.out.print(" ");
					}

					else
					{
						System.out.print("*");
					}
				}
				else
				{
					if(i<j-a+1 || i>3*a-3 -j)
					{
						System.out.print(" ");
					}

					else
					{
						System.out.print("*");
					}
				}

			}
			System.out.println();
			
		}
	}
}

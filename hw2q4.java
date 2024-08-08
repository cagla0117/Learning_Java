package csd;

public class hw2q4 {
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Height:");
		int h = Integer.parseInt(kb.nextLine());
		System.out.print("Width:");
		int w = Integer.parseInt(kb.nextLine());
		w =w-2;
		for(int i = 0; i < h; i++)
		{
			
			System.out.print("|");
			for(int j = 0; j < w; j++)
			{
				if(j == (i%w)  && (i/w)%2 == 0)
				{
					System.out.print("*");
				}
				else if(j == w - i%w -1  && (i/w)%2 == 1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
	}
}

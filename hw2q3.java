package csd;

public class hw2q3 {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		int j = a;
		while (j != 1)
		{ 
			for(int i = 2 ; i <= j; i++)
			{
				if(j%i == 0){
					j = j / i;
					System.out.print(i);
					i--;
				}
			}
		}
	}
}

class Question3 {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		int b = signum(a);
		System.out.println(b);	
	}
	public static int signum(int a)
	{	
		if(a < 0)
		{
			return -1;	
		}
		else if(a > 0)
		{
			return 1;	
		}
		else
		{
			return 0;		
		}
	}	
}

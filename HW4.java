package csd;

class q4 {
	public static void main(String [] args)
	{	
		calculater.run();
	}


}
class calculater {
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]");
		int a = kb.nextInt();
		int max = 0;
		int min = 100;
		int count = 0;
		int sum = 0;
		while(a == 1) {
			System.out.print("Bir tamsayı giriniz: ");
			int b = kb.nextInt();
			if(b <0 || b> 100) {
				System.out.println("Geçersiz değer girdiniz!..." );
				System.out.print("Yeni bir deger giriniz: ");
				b = kb.nextInt();
				
			}
			count++;
			sum = sum + b; 
			if(max < b) {
				max = b;
			}
			if(min > b) {
				min = b;
			}
			
			System.out.print("Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]");
			a = kb.nextInt();
		}
		System.out.println("Toplam "+count+" deger girildi.");
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
		System.out.println("Ortalama = "+ sum/count);
		
	}
}

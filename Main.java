package idmanProgramı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("idman programına hoşgeldiniz....");
		
		System.out.println("**********************************");
		
		String hareketler = "Geçerli Hareketler ...\n"
						+ "burpee\n"
						+ "pushup\n"
						+ "situp\n"
						+ "squat\n";
		
		System.out.println(hareketler);
		
		System.out.println("***********************************");
		
		System.out.println("Kaç tane burpee hareketi yapmak istiyorsunuz ?");
		int burpee = scanner.nextInt();
		
		System.out.println("Kaç tane pushup hareketi yapmak istiyorsunuz ?");
		int pushup = scanner.nextInt();
		
		System.out.println("Kaç tane situp hareketi yapmak istiyorsunuz ?");
		int situp = scanner.nextInt();
		
		System.out.println("Kaç tane squat hareketi yapmak istiyorsunuz ?");
		int squat = scanner.nextInt();
		
		scanner.nextLine();

		
		Idman idman = new Idman(burpee,pushup,situp,squat); 
		
		System.out.println("idmanınız başlıyor....");
		
		while(idman.idmanBittiMi() == false) {
			
			System.out.println("Hangi hareketi yapmak istediğinizi yazın (burpee,pushup,situp,squat): ");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten kaç tane yapmak istiyorsunuz ? ");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);

			
			
		}
		
		System.out.println("tebrikler!!! idmanınızı başarıyla tamamladınız...");

		
	}

}

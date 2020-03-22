package yurtdisiProgramı;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen yatırdığınız harç parasını giriniz :");
		this.harc = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("siyasi bir yasağınız var mı yurtdışına çıkmakla ilgili? (evet ya da hayır)");
		String cevap = scanner.nextLine();
		
		if(cevap.equals("evet"))
			this.siyasiYasak = true;
		else
			this.siyasiYasak = false;
		
		System.out.println("vizeniz var mı ? (evet ya da hayır)");
		String cevap2 = scanner.nextLine();
		
		if(cevap2.equals("evet"))
			this.vizeDurumu = true;
		else
			this.vizeDurumu = false;
		
		
		
	}
	@Override
	public boolean yurtDisiHarciKontrol() {
		
		if(this.harc < 15) {
			
			return false;
		}
		else
			return true;
			
		
	}
	@Override
	public boolean siyasiYasakKontrol() {
		
		if(this.siyasiYasak) {
			
			System.out.println("yurtdışı yasağınız var. Ülke dışına çıkamazsınız ...");
			return false;
		}
		else 
			return true;
			
		
	}
	@Override
	public boolean vizeDurumuKontrol() {
		
		if(this.vizeDurumu) {
			
			System.out.println("vize işlemleriniz tamamdır. ");
			return true;
		}
		else {
			System.out.println("vizenizden kaynaklı bir sorun vardır.");
			return false;
		}
			
			
		
		
	}
	
	

}

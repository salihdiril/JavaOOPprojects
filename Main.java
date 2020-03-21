package sarkicilar;

import java.util.Scanner;

public class Main {
	
	private static Sarkici sarkicilar = new Sarkici();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void islemleriGoruntule() {
		
		System.out.println("1. işlem : işlemleri Görüntüle");
		System.out.println("2. işlem : Şarkıcı Görüntüle");
		System.out.println("3. işlem : Şarkıcı Ekle");
		System.out.println("4. işlem : Şarkıcı Güncelle");
		System.out.println("5. işlem : Şarkıcı Ara");
		System.out.println("6. işlem : Şarkıcı sil");
		System.out.println("7. işlem : Uygulamadan Çık");
		
	}
	
	public static void sarkicilariGoruntule() {
		
		sarkicilar.sarkicilariBastir();
	}
	
	public static void ekle() {
		
		System.out.println("eklemek istediğiniz şarkıcının ismini giriniz : ");
		String isim = scanner.nextLine();
		
		sarkicilar.sarkiciEkle(isim);
	}
	
	public static void guncelle() {
		
		System.out.println("güncellemek istediğiniz şarkıcının pozisyonunu giriniz (1,2,3,...)");
		int pozisyon = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("güncellemek istediğiniz pozisyon için yeni şarkıcı ismi giriniz : ");
		String yeniSarkici = scanner.nextLine();
		
		sarkicilar.sarkiciGuncelle(pozisyon - 1, yeniSarkici);
	}
	
	public static void ara() {
		
		System.out.println("aramak istediğiniz şarkıcının ismini giriniz : ");
		String isim = scanner.nextLine();
		
		sarkicilar.sarkiciAra(isim);
	}
	
	public static void sil() {
		
		System.out.println("silmek istediğiniz şarkıcını pozisyonunu giriniz (1,2,3,.....) : ");
		int pozisyon = scanner.nextInt();
		
		sarkicilar.sarkiciSil(pozisyon - 1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Şarkıcı Uygulamasına Hoşgeldiniz...");
		
		islemleriGoruntule();
		
		boolean cikis = false;
		int islem;
		
		while(!cikis) {
			
			System.out.println("Hangi işlemi yapmak istiyorsanız o işlemin işlem numarasını giriniz (1,2,3,...) :");
			islem = scanner.nextInt();
			scanner.nextLine();
			
			switch(islem) {
				
				case 1:
					
					islemleriGoruntule();
					break;
					
				case 2:
					
					sarkicilariGoruntule();
					break;
					
				case 3:
					
					ekle();
					break;
					
				case 4:
					
					guncelle();
					break;
					
				case 5:
					
					ara();
					break;
					
				case 6:
					
					sil();
					break;
					
				case 7:
					
					cikis = true;
					System.out.println("Uygulamadan çıkılıyor...");
					break;
					
			}
		}
		
		
		
		
		

	}

}

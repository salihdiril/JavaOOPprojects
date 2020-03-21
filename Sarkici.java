package sarkicilar;

public class Sarkici {
	
	private java.util.ArrayList<String> arraylist = new java.util.ArrayList<String>();
	
	public void sarkiciEkle(String isim) {
		
		arraylist.add(isim);
		
		System.out.println(isim + "isimli şarkıcı listeye eklendi...");
	}
	
	public void sarkicilariBastir() {
		
		for(int i = 0; i < arraylist.size(); i++){
			
			System.out.println((i+1) + ". şarkıcı : " + arraylist.get(i));
			
		}
	}
	
	public void sarkiciSil(int pozisyon) {
		
		String isim = arraylist.get(pozisyon);
		
		arraylist.remove(pozisyon);
		
		System.out.println(isim + " isimli şarkıcı listeden çıkarılmıştır ...");
	}
	
	public void sarkiciGuncelle(int pozisyon, String yeniSarkici){
		
		arraylist.set(pozisyon, yeniSarkici);
		System.out.println("şarkıcı listesi güncellendi ...");
	}
	
	public void sarkiciAra(String isim) {
		
		int i = arraylist.indexOf(isim);
		
		if(i >= 0 )
			System.out.println(isim + " isimli şarkıcı listenin " + (i+1) + ". sırasındadır..." );
		else
			System.out.println("Şarkıcı bulunamadı ...");
	}

}

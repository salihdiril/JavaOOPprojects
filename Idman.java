package idmanProgramı;

public class Idman {
	
	private int burpeeSayisi;
	private int pushupSayisi;
	private int situpSayisi;
	private int squatSayisi;
	
	public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
		
		this.burpeeSayisi = burpeeSayisi;
		this.pushupSayisi = pushupSayisi;
		this.situpSayisi = situpSayisi;
		this.squatSayisi = squatSayisi;
	}

	public int getBurpeeSayisi() {
		return burpeeSayisi;
	}

	public void setBurpeeSayisi(int burpeeSayisi) {
		this.burpeeSayisi = burpeeSayisi;
	}

	public int getPushupSayisi() {
		return pushupSayisi;
	}

	public void setPushupSayisi(int pushupSayisi) {
		this.pushupSayisi = pushupSayisi;
	}

	public int getSitupSayisi() {
		return situpSayisi;
	}

	public void setSitupSayisi(int situpSayisi) {
		this.situpSayisi = situpSayisi;
	}

	public int getSquatSayisi() {
		return squatSayisi;
	}

	public void setSquatSayisi(int squatSayisi) {
		this.squatSayisi = squatSayisi;
	}
	
	
	public void hareketYap(String hareketTuru, int sayi) {
		
		if(hareketTuru.equals("burpee"))
			burpeeYap(sayi);
		
		else if(hareketTuru.equals("pushup"))
			pushupYap(sayi);
		
		else if(hareketTuru.equals("situp"))
			situpYap(sayi);
		
		else if(hareketTuru.equals("squat"))
			squatYap(sayi);
		
		else
			System.out.println("geçersiz hareket ...");

	}
	
	public void burpeeYap(int sayi) {
		
		if(burpeeSayisi == 0)
			System.out.println("Yapacak burpee kalmadı ...");
		
		else if(burpeeSayisi - sayi < 0) {
			
			System.out.println("Tebrikler...Hedeflediğiniz burpee sayısını geçtiniz.");
			burpeeSayisi = 0;
			System.out.println("Kalan Burpee : " + burpeeSayisi);


		}
		else {
			
			burpeeSayisi -= sayi;
			System.out.println("Kalan Burpee : " + burpeeSayisi);

		}

	}
	
	public void pushupYap(int sayi) {
		
		if(pushupSayisi == 0)
			System.out.println("Yapacak pushup kalmadı ...");
		
		else if(pushupSayisi - sayi < 0) {
			
			System.out.println("Tebrikler...Hedeflediğiniz pushup sayısını geçtiniz.");
			pushupSayisi = 0;
			System.out.println("Kalan pushup : " + pushupSayisi);


		}
		else {
			
			pushupSayisi -= sayi;
			System.out.println("Kalan pushup : " + pushupSayisi);

		}

	}
	
	public void situpYap(int sayi) {
		
		if(situpSayisi == 0)
			System.out.println("Yapacak situp kalmadı ...");
		
		else if(situpSayisi - sayi < 0) {
			
			System.out.println("Tebrikler...Hedeflediğiniz situp sayısını geçtiniz.");
			situpSayisi = 0;
			System.out.println("Kalan situp : " + situpSayisi);


		}
		else {
			
			situpSayisi -= sayi;
			System.out.println("Kalan situp : " + situpSayisi);

		}

	}
	
	public void squatYap(int sayi) {
		
		if(squatSayisi == 0)
			System.out.println("Yapacak squat kalmadı ...");
		
		else if(squatSayisi - sayi < 0) {
			
			System.out.println("Tebrikler...Hedeflediğiniz squat sayısını geçtiniz.");
			squatSayisi = 0;
			System.out.println("Kalan squat : " + squatSayisi);


		}
		else {
			
			squatSayisi -= sayi;
			System.out.println("Kalan squat : " + squatSayisi);

		}

	}
	
	public boolean idmanBittiMi() {
		
		return (burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0);
	}
	
	

}












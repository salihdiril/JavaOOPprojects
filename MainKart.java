package hafizaOyunu;

import java.util.Scanner;

public class Main {
	
	private static Kart[][] kartlar = new Kart[4][4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		kartlar[0][0] = new Kart('A');
		kartlar[0][1] = new Kart('G');
		kartlar[0][2] = new Kart('H');
		kartlar[0][3] = new Kart('F');
		kartlar[1][0] = new Kart('B');
		kartlar[1][1] = new Kart('G');
		kartlar[1][2] = new Kart('E');
		kartlar[1][3] = new Kart('C');
		kartlar[2][0] = new Kart('A');
		kartlar[2][1] = new Kart('D');
		kartlar[2][2] = new Kart('D');
		kartlar[2][3] = new Kart('C');
		kartlar[3][0] = new Kart('H');
		kartlar[3][1] = new Kart('B');
		kartlar[3][2] = new Kart('E');
		kartlar[3][3] = new Kart('F');
		
		//oyunTahtasi();
		
		while(oyunBittiMi() == false) {
			
			oyunTahtasi();
			tahminEt();
		}


	}
	
	public static void tahminEt() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen 2 tane 4 e 4'lük matriste kartların pozisyonun belirten  0-1-2-3 değerleriden birini girin : " );
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if( a<0 || a>3 || b<0 || b>3) {
			
			System.out.println("geçersiz bir değer girdiniz.... (0,1,2,3 değerlerinden birini girmeliydiniz ...) ");
			return;
		}
		
		kartlar[a][b].setTahmin(true);
		oyunTahtasi();
		
		System.out.println("lütfen 2. tahmininizi yapınız ( kart seçiniz) : ");
		int a2 = scanner.nextInt();
		int b2 = scanner.nextInt();
		
		if( a<0 || a>3 || b<0 || b>3) {
			
			System.out.println("geçersiz bir değer girdiniz.... (0,1,2,3 değerlerinden birini girmeliydiniz ...) ");
			return;
		}
		
		if(kartlar[a][b].getDeger() == kartlar[a2][b2].getDeger()) {
			
			System.out.println("Tebrikler!!! Doğru tahmin ettiniz ...");
			kartlar[a2][b2].setTahmin(true);
			return;
		}
		else {
			System.out.println("yanlış tahmin ettiniz ...");
			kartlar[a][b].setTahmin(false);
		}
		
		
		
		
		
	}
	
	public static boolean oyunBittiMi() {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 4; j++) {
				
				if(kartlar[i][j].isTahmin() == false)
					return false;
				
			}
		}
		
		return true;
		
	}
	
	public static void oyunTahtasi() {
		
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("-------------------");

			for(int j = 0; j < 4; j++) {
				
				if(kartlar[i][j].isTahmin())
					System.out.print("| " + kartlar[i][j].getDeger() + " |");
				else
					System.out.print("| | ");
			}
			
			System.out.println("");
		}
		
		System.out.println("-------------------");

	}

}

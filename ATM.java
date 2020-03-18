package oopAtm2;

import java.util.Scanner;

public class ATM {
	
	public void calis(Hesap hesap) {
		
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("bankamıza hoşgeldiniz ...");
		System.out.println("********************************");
		System.out.println("Kullanıcı girişi : ");
		System.out.println("********************************");
		
		int girisHakki = 3;
		
		while(true) {
			
			if(login.login(hesap)) {
				
				System.out.println("Giriş Başarılı ....");
				break;

			}
			
			else {
				
				System.out.println("Giriş Başarısız ...");
				girisHakki--;
				System.out.println("Kalan giriş hakkınız : " + girisHakki);


			}
			
			if(girisHakki == 0)
				return;
		}
		
		System.out.println("******************************");

		
		String islemler = "1. islem : bakiye sorgulama\n"
						+ "2. islem : para çekme\n"
						+ "3. islem : para yatırma"
						+ "çıkış için 0'a basınız\n";
		
		System.out.println(islemler);
		System.out.println("*******************************");
		
		int islemNo;
		
		
		while(true) {
			
			System.out.println("lütfen yapmak istediğiniz işlemin numarasını yazınız : ");
			islemNo = scanner.nextInt();
			
			if(islemNo == 0)
				return;
			
			else if(islemNo == 1)
				System.out.println("Bakiyeniz : " +hesap.getBakiye());
			else if(islemNo == 2) {
				
				System.out.println("çekmek istediğiniz para tutarını giriniz : ");
				int tutar = scanner.nextInt();
				hesap.paraCek(tutar);
			}
			else if(islemNo == 3) {
				
				System.out.println("yatırmak istediğiniz para tutarını giriniz :");
				int tutar = scanner.nextInt();
				hesap.paraYatir(tutar);
			}
			else
				System.out.println("Geçersiz işlem ...");



			
			
		}





	}

}

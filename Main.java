package oopAtm2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm = new ATM();
		
		Hesap hesap = new Hesap("salih diril", "123456", 1000);
		
		atm.calis(hesap);
		System.out.println("programdan çıkılıyor ...");


	}

}

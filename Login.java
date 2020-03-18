package oopAtm2;

import java.util.Scanner;

public class Login {
	
	public boolean login(Hesap hesap) {
		
		Scanner scanner = new Scanner(System.in);
		String username, parola;
		
		
		System.out.println("Kullanacı adı:");
		username = scanner.nextLine();
		
		System.out.println("Parola : ");
		parola = scanner.nextLine();
		
		if(hesap.getUsername().equals(username) && hesap.getParola().equals(parola))
			return true;
		
		else
			return false;


		
	}
	
	

}

package inheritance3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the employees program...");
		
		String operations = "1. operation : Operations of programmer\n "
						  + "2. Operation  :Operation of manager\n"
						  + "press 0 for exit";
		
		System.out.println("***************************************");
		System.out.println(operations);
		System.out.println("****************************************");
		
		while(true) {
			
			System.out.println("press a number that you want to perform : ");
			int opNum = scanner.nextInt();
			
			if(opNum == 0) {
				
				System.out.println("exiting from the employees operation program");
				break;

			}
				
			
			else if(opNum == 1) {
				
				Yazilimci programmer = new Yazilimci("salih","diril","481","java,C,Python" );
				
				System.out.println("Welcome to the segment of operation of programmer ...");
				
				String programmerOperation = "1. operation : install an operating system \n"
											+ "2. operation : show programmer's infos\n"
											+ "press 0 for exit";
				
				System.out.println("**************************************");
				System.out.println(programmerOperation);
				System.out.println("***************************************");
				
				while(true) {
					
					System.out.println("press a number that you wanna perform : ");
					int numOpProg = scanner.nextInt();
					scanner.nextLine();
					
					if(numOpProg == 0) {
						
						System.out.println("exiting from the segment of programmer operations");
						break;

					}
						
					
					else if(numOpProg == 1) {
						
						System.out.println("write an operating system that you wanna install...");
						String opSysName = scanner.nextLine();
						
						programmer.install(opSysName);

						
					}
					
					else if(numOpProg == 2 ) {
						
						programmer.bilgileriGoster();
					}
					
					else
						System.out.println("invalid operation");

						
					
				}
				
				
				




				
				
			}
			
			else if(opNum == 2) {
				
				Yonetici manager = new Yonetici("mehmet","erdilek","445",56);
				
				System.out.println("Welcome to the segment of manager operation ...");
				
				String managerOperation = "1. operation : give a raise to employees\n"
										+ "2. operation : show manager's infos\n"
										+ "press 0 for exit";
				
				System.out.println("*************************************");
				System.out.println(managerOperation);
				System.out.println("*************************************");



				
				while(true) {
					
					System.out.println("press a number that you wanna perform : ");
					int numOpMan = scanner.nextInt();
					scanner.nextLine();
					
					if(numOpMan == 0) {
						
						System.out.println("exiting from the segment of manager operations...");
						break;

					}
					
					else if(numOpMan == 1) {
						
						System.out.println("type the amount of raise that you wanna give to employees : ");
						int raise = scanner.nextInt();
						scanner.nextLine();
						
						manager.zamYap(raise);

					}
					
					else if (numOpMan == 2) {
						
						manager.bilgileriGoster();
					}
					
					else
						System.out.println("invalid operation ...");

				}
				
				


				
				
			}
			
			else
				System.out.println("invalid operation");

				
			
		}




		
		

		

	}

}

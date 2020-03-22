package yurtdisiProgramı;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Sabiha Gökçen Havaalanına Hoşgeldiniz...");
		String kurallar = "Yurt dışına çıkabilmek için aşağıdaki şartların hepsini sağlamanız gerekiyor \n"
						+ " - çıkmak istediğiniz ülkeye ait vizenizin olması\n"
						+ "- yurt dışı harcını 15 tl olarak yatırmanız \n"
						+ "- Herhangi bir yurtdışına çıkış ile ilgili siyasi yasağınızın olmaması \n";
		
		
		while(true) {
			
			System.out.println(kurallar);
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("yurtdışı harcınız kontrol ediliyor ...");
			Thread.sleep(3000);
			
			if(yolcu.yurtDisiHarciKontrol() == false) {
				
				System.out.println("yurtdışı harcınız tam yatırılmamış... Seyehat edemezsiniz.");
				break;
			}
			
			System.out.println("vize durumunuz kontrol ediliyor ...");
			Thread.sleep(3000);
			
			if(yolcu.vizeDurumuKontrol() == false) {
				System.out.println("vizenizde problem var...Seyehat edemezsiniz.");
				break; 
			}
			
			System.out.println(" yurtdışına çıkmakla ilgili bir siyasi yasağınız var mı kontrol ediliyor...");
			Thread.sleep(3000);
			
			if(yolcu.siyasiYasakKontrol() == false) {
				
				System.out.println("yurtdışı yasağınız var ....Seyehat edemezsiniz.");
				break;
			}
			
			System.out.println("bütün işlemleriniz tamamdır. İyi yolculuklar...");
			break;
			
			
		}
		
		

	}

}

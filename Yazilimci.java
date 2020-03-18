package inheritance3;

public class Yazilimci extends Calisan {
	
	private String knownLanguages;

	public Yazilimci(String name, String surname, String id, String knownLanguages) {
		
		super(name, surname, id);
		this.knownLanguages = knownLanguages;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Languages that he/she knows : " + knownLanguages);

	}
	
	public void install(String operatingSystem) {
		
		System.out.println(getName() + " is installing " + operatingSystem + " to the computer" );

	}
	
	
	
	

}

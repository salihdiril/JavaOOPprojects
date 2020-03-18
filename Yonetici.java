package inheritance3;

public class Yonetici extends Calisan{
	
	private int numberOfEmployees;

	public Yonetici(String name, String surname, String id, int numberOfEmployees) {
		super(name, surname, id);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println(" number of people that he/she responsible for : " + numberOfEmployees);
	}
	
	public void zamYap(int raiseAmount) {
		
		System.out.println(getName() + "raised employees' salaries by " + raiseAmount + "pounds");

	}
	
	
	
	

}

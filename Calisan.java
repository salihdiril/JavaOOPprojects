package inheritance3;

public class Calisan {
	
	private String name;
	private String surname;
	private String id;
	
	
	public Calisan(String name, String surname, String id) {
		
		this.name = name;
		this.surname = surname;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	public void bilgileriGoster() {
		
		System.out.println("çalışan bilgileri ...");

		System.out.println("name:  : " +name );
		System.out.println("surname : " +surname);
		System.out.println("id : " + id);

	}
	

}

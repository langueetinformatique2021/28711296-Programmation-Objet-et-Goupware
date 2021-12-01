package Devoir_6;

public class Crocodile extends Reptile{
	String nom_zoo;
	public Crocodile() {
		super("crocodile");
	}
	
	public void elever(String nom_zoo) {
		elever = true;
		this.nom_zoo = nom_zoo;
	}
	
	public void presnte() {
		super.presente();
		if (elever == true)
			System.out.println("Je suis dans "+ nom_zoo);	
	}
	
	public void crie() {
		super.crie();
	}

}

package Devoir_6;

public class Reptile extends Animal{
	
	protected boolean elever = false;
	
	
	public Reptile(String peau) {
		super(peau, "écailles");
	}
	
	public void presente() {
		super.presente();
		String etat = (elever)? "élevé" : "sauvage";
		System.out.println("Je suis vraiment un animal "+ etat);	
	}
	
	public void crie() {
		System.out.println("Je crie donc je suis");
		
	}

}

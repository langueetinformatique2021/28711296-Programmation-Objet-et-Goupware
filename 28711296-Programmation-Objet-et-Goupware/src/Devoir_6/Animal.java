package Devoir_6;

public abstract class Animal {
	private String espece;
	private String peau;
	
	public Animal (String type, String peau) {
		espece = type;
		this.peau = peau;
	}
	
	public void presente() {
		System.out.println("Je suis un représentant de l'espèce des " + espece + " et j'ai des" + peau);
	}
	
	public abstract void crie();
}

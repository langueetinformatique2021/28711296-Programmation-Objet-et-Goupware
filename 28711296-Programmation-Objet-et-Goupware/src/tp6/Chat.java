package tp6;

public class Chat extends Félin implements Domesticable {
	
	String nom;
	
	public Chat() {
		super("chat");
	}

	public void domestiquer(String nom) {
		domestique = true;
		this.nom = nom;

	}

	public String nom() {
		return nom;
	}
}
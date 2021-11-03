package tp5;

public class Carafe {
	private int contenu_, capacite_;
	
	public Carafe (int capacite) {
		capacite_ = capacite;
		contenu_ = 0;
	}
	
	public Carafe (int capacite, int contenu) {
		capacite_ = capacite;
		if (contenu > capacite)
			contenu_ = capacite;
		else contenu_ = contenu;
		
	}
	
	public void Remplir () {
		contenu_ = capacite_;
	}
	
	public void Vider () {
		contenu_ = 0;
	}
	
	public int Contenu () {
		return contenu_;
	}
	
	public int Capacite () {
		return capacite_;
	}
	
	public void Transvaser (Carafe autreC) {
		if (Contenu() < (autreC.Capacite() - autreC.Contenu())) {
			autreC.contenu_ += Contenu();
			Vider();
		} else {
			contenu_ -= autreC.Capacite() - autreC.Contenu();
			autreC.Remplir();
		}
	}
}

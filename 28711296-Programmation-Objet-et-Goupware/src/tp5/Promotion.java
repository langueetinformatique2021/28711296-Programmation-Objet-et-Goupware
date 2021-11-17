package tp5;

/**
 * 
 * 
 * @author Moses
 *
 */
public class Promotion {
	private int Note_;
	private String Niveau_;
	private Etudiant Etudiant_;
	
	/**
	 * traiter le niveau et le note
	 * 
	 * 
	 * @param num_etu
	 * @param nom
	 * @param prenom
	 * @param parcours
	 * @param Note
	 * @param Niveau
	 * 
	 * @return afficher le numero d'etudiant, prenom et le niveau
	 */
	
	
	public Promotion(int num_etu, String nom, String prenom, String parcours, int Note, String Niveau) {
		
		Etudiant_ = new Etudiant(num_etu, nom, prenom, parcours);
		Note_ = Note;
		Niveau_ = Niveau;
		if (Verifier(Note_)) {
			Promoted();
			System.out.println("Numero Etudiant :" + num_etu);
			System.out.println("Prenom :" + prenom);
			System.out.println("Promoted to " + Niveau_);
			}

	}
	
	
	/**
	 * 
	 * @param note
	 * @return True = le note est superieur a 10 / False = si non 
	 */
	
	private static boolean Verifier(int note) {
		
		if (note >= 10)
			return true;
		else return false;
	}
	
	/**
	 * changer le niveau
	 *   
	 * 
	 */
	
	private void Promoted() {
		if (Niveau_ == "L1") {Niveau_ = "L2";}
		else {
			if (Niveau_ == "L2") {Niveau_ = "L3";}
			else {
				if (Niveau_ == "L3") {Niveau_ = "M1";}
				else {
					if (Niveau_ == "M1") {Niveau_ = "M2";}
				}
			}
		}
		
	}

}

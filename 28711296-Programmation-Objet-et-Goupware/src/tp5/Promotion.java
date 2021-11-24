package tp5;

/**
 * 
 * 
 * @author Moses
 *
 */
public class Promotion {
	private int note_;
	private String niveau_;
	private Etudiant etudiant;
	
	/**
	 * traiter le niveau et le note
	 * 
	 * 
	 *
	 * @param e
	 * @param note
	 * @param niveau
	 * 
	 * @return afficher le numero d'etudiant, prenom et le niveau
	 */
	
	
	public Promotion(Etudiant e, int note, String niveau) {
		
		etudiant = e;
		note_ = note;
		niveau_ = niveau;
		if (Verifier(note_)) {
			Promoted();
			System.out.println("Numero Etudiant :" + e.getNum());
			System.out.println("Prenom :" + e.getPrenom());
			System.out.println("Promoted to " + niveau_);
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
		if (niveau_ == "L1") {niveau_ = "L2";}
		else {
			if (niveau_ == "L2") {niveau_ = "L3";}
			else {
				if (niveau_ == "L3") {niveau_ = "M1";}
				else {
					if (niveau_ == "M1") {niveau_ = "M2";}
				}
			}
		}
		
	}

}

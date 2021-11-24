package Devoir;

/**
 * 
 * 
 * @author Moses
 *
 */

public class Etudiant {
	
	private int num_etu_;
	private String nom_, prenom_, parcours_;
	
	/**
	 * les attributs des étudiants
	 * 
	 * @param num_etu
	 * @param nom
	 * @param prenom
	 * @param parcours
	 */
	
	
	public Etudiant(int num_etu, String nom, String prenom, String parcours){
		num_etu_ = num_etu;
		nom_ = nom;
		prenom_ = prenom;
		parcours_ = parcours;
		
	}
	/**
	 * renvoyer le numero d'etudiant
	 * @return numero d'etudiant
	 */
	public int getNum() {
		return num_etu_;
	}
	/**
	 * renvoyer le nom d'etudiant
	 * @return nom d'etudiant
	 */
	public String getNom() {
		return nom_;
	}
	/**
	 * renvoyer le prenom d'etudiant
	 * @return prenom d'etudiant
	 */
	public String getPrenom() {
		return prenom_;
	}
	/**
	 * changer le numero d'etudiant
	 * @param num_etu
	 */
	public void setNum(int num_etu) {
		num_etu_=num_etu;
	}
	/**
	 * changer le nom d'etudiant
	 * @param nom
	 */
	public void setNom(String nom) {
		nom_ = nom;
	}
	/**
	 * changer le prenom d'etudiant
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		prenom_ = prenom;
	}
	

}

package Devoir_tp7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 
 * @author Moses
 *
 */
public class Calendar2 extends Calendar{
	
	/**
	 * attribut cours (type boolean)
	 */
	
	public boolean cours;
	Calendar calendar = new GregorianCalendar();
	Date trialTime = new Date();

	/**vérifier si c'est créé pendant le cours. 
	 * boolean cours est True, si c'est créé pendant le cours(jeudi 9:30-12)
	 * cours est False, si non
	 */
	public Calendar2() {
		calendar.setTime(trialTime);
		if (calendar.get(Calendar.DAY_OF_WEEK) == 5) {
			if (calendar.get(Calendar.HOUR_OF_DAY) >= 9 && calendar.get(Calendar.MINUTE) >= 30) {
				if (calendar.get(Calendar.HOUR_OF_DAY) <= 12) {
					this.cours = true;
				}
				else {this.cours = false;}
			}
			else {this.cours = false;}
		}
		else {this.cours = false;}
	}
	
	/**Afficher la date et l'heure de la création de l'objet
	 */
	public void creation() {
		System.out.print(calendar.get(Calendar.YEAR) + " / ");
		System.out.print(calendar.get(Calendar.MONTH) + " / ");
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.print(calendar.get(Calendar.HOUR_OF_DAY) + " : ");
		System.out.print(calendar.get(Calendar.MINUTE) + " : ");
		System.out.println(calendar.get(Calendar.SECOND));
		}
	
	/**Afficher la date et l'heure courante
	 * 
	 */
	public void afficher() {
		Calendar calendar_courant = new GregorianCalendar();
		System.out.print(calendar_courant.get(Calendar.YEAR) + " / ");
		System.out.print(calendar_courant.get(Calendar.MONTH) + " / ");
		System.out.println(calendar_courant.get(Calendar.DAY_OF_MONTH));
		System.out.print(calendar_courant.get(Calendar.HOUR_OF_DAY) + " : ");
		System.out.print(calendar_courant.get(Calendar.MINUTE) + " : ");
		System.out.println(calendar_courant.get(Calendar.SECOND));
		
	}
	
	/**
	 * Calculer le nombre de secondes depuis la création de l'objet
	 */
	public void duree() {
		Calendar calendar_ = new GregorianCalendar();

		int seconde = calendar_.get(Calendar.SECOND) - calendar.get(Calendar.SECOND);
		
		System.out.println(seconde);
	}


	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

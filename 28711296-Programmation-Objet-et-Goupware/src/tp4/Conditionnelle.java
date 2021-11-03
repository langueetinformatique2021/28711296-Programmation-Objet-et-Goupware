package tp4;
/**
 * 
 * @author Moses
 *
 * entre les valeurs données, trouver le maximum, le munimum et la médiane
 */
public class Conditionnelle {
	
	public static void main(String [] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		
		
		/**
		 * obtenir le maximum entre p1,p2,p3
		 * 
		 */
		if (p1 > p4) {
			p4 = p1;
		}
		if (p2 > p4) {
			p4 = p2;
		}
		if (p3 > p4) {
			p4 = p3;
		}
		System.out.println(p4);	
		
		/**
		 * code du professeur
		 */
		
		if (p1 > p2) {
			if (p3 > p1)
				p4 = p3;
			else p4 = p1;
		}
		else {
			if (p3 > p2)
				p4 = p3;
			else 
				p4 = p2;
		}
		System.out.println(p4);	
	
		
		/**
		 * obtenir le minimum entre p1,p2,p3
		 */
		
		if (p1 < p4) {
			p4 = p1;
		}
		if (p2 < p4) {
			p4 = p2;
		}
		if (p3 < p4) {
			p4 = p3;
		}
		System.out.println(p4);	
		
		/**
		 * code du professeur
		 */
		
		if (p1 < p2) {
			if (p3 < p1)
				p4 = p3;
			else p4 = p1;
		}
		else {
			if (p3 < p2)
				p4 = p3;
			else 
				p4 = p2;
		}
		
		System.out.println(p4);	
		
		/**
		 * obtenir la médiane entre p1, p2, p3
		 */
		
		if (p1 < p2)
			if (p2 < p3) {p4 = p2;}
			else if (p3 > p1) {p4 = p3;}
			else {p4 = p1;}
		else if (p3>p1) {p4 = p1;}
		else if (p2>p3) {p4 = p2;}
		else {p4 = p3;}
		
		System.out.println(p4);	
		
		/**
		 * code du professeur
		 */
		if (p1 > p2) {
			if (p2 > p3)
				p4 = p2;
			else {
				if (p3 > p1)
					p4 = p1;
				else p4 = p2;
			}
		}
		else {
			if (p1 > p3)
				p4 = p1;
			else {
				if (p3 > p2)
					p4 = p2;
				else p4 = p3;
			}
			
		}
	}

}

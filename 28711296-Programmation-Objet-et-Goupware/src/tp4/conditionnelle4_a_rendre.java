package tp4;
/**
 * 
 * @author Moses
 *
 *trouver la médiane entre 5 chiffres
 *
 */

public class conditionnelle4_a_rendre {
	
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8, p6 = 0;
		int l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0;
		
		if (p1 > l5) {
			l5 = p1;
		}
		
		if (p2 > l5) {
			l5 = p2;
			l4 = p1;
		}
		else l4 = p2;
		
		if (p3 > l5) {
			l5 = p3;
			if (p2 > p1) {
				l4 = p2;
				l3 = p1;
			}
			else {l4 = p1; l3 = p2;}
		}
		else {
			if (p1 < p3) {
				l4 = p3;
				l3 = p1;
			}
			else l3= p3;
		}
		
		if (p4 > l5) {
			l2 = l3;
			l3 = l4;
			l4 = l5;
			l5 = p4;
		}
		else {
			if (p4 > l4) {
				l2 = l3;
				l3 = l4;
				l4 = p4;
			}
			else 
				if(p4 > l3) {
					l2 = l3;
					l3 = p4;
				}
				else l2 = p4;
		}
		
		
		if (p5 > l5) {
			l1 = l2;
			l2 = l3;
			l3 = l4;
			l4 = l5;
			l5 = p5;
		}
		else {
			if (p5 > l4) {
				l1 = l2;
				l2 = l3;
				l3 = l4;
				l4 = p5;
			}
			else {
				if(p5 > l3) {
					l1 = l2;
					l2 = l3;
					l3 = p5;
				}
				else {
					if(p5 > l2) {
						l1 = l2;
						l2 = p5;
					}
					else l1 = p5;
				}
			}
		}
	
		p6 = l3;
		
		System.out.print(p6);
		
	}

}

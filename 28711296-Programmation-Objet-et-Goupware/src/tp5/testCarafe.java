package tp5;

public class testCarafe {
	
	public static void main (String[] args) {
		Carafe caraf1 = new Carafe(4);
		Carafe caraf2 = new Carafe(7);
		Carafe caraf3 = new Carafe(5);
		System.out.println(caraf1.Capacite() + " " + caraf1.Contenu());
		System.out.println(caraf2.Capacite() + " " + caraf2.Contenu());
		
		caraf1.Remplir();
		caraf1.Transvaser(caraf3);
		caraf1.Remplir();
		caraf1.Transvaser(caraf2);
		caraf1.Remplir();
		caraf1.Transvaser(caraf2);
		System.out.println(caraf1.Contenu());
		caraf1.Transvaser(caraf3);
		System.out.println(caraf3.Contenu());
	}

}

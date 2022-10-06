package personnage;


public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}


	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePot) {
		effetPotion = forcePot ;
		System.out.println("« Merci Druide, je sens que ma force est "+ effetPotion + " fois décuplée. »");
	}

//	public static void main(String[] args) {
//		Druide panoramix = new Druide("Panoramix", 5, 10);
//		Gaulois asterix = new Gaulois("Astérix", 8);
//		Romain cesar = new Romain("Cesar", 7);
//		asterix.prendreParole();
//		asterix.parler("Salutation");
//		asterix.boirePotion(panoramix.preparerPotion());
//		asterix.frapper(cesar);
//		System.out.println(asterix);
//		
//	}
}

package personnage;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;;
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

//	public String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	public String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
//		romain.recevoirCoup(force / 3 * effetPotion);
//	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void boirePotion(int forcePot) {
		effetPotion = forcePot;
		System.out.println("� Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e. �");
	}

//	public static void main(String[] args) {
//		Druide panoramix = new Druide("Panoramix", 5, 10);
//		Gaulois asterix = new Gaulois("Ast�rix", 8);
//		Romain cesar = new Romain("Cesar", 7);
//		asterix.prendreParole();
//		asterix.parler("Salutation");
//		asterix.boirePotion(panoramix.preparerPotion());
//		asterix.frapper(cesar);
//		System.out.println(asterix);
//		
//	}
}

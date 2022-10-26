package personnage;

import lieu.Musee;

public class Gaulois{
	private String nom;
	private int force, nb_trophees;;
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	
	public int getForce() {
		return force;
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
		System.out.println(prendreParole() + "« " + texte + "»");
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3 * effetPotion);
//	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
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
		System.out.println("« Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée. »");
	}
	
	public void faireUneDonnation(Musee musee) {
		if(nb_trophees > 0) {
			System.out.println(" « Je donne au musee tous mes trophees :");
			for(int i = 0; i < nb_trophees; i++ ) {
				if(i == nb_trophees-1) {
					musee.donnerTrophees(musee.getReserve()[musee.getNbTrophee()].getGaulois(), trophees[i]);
					System.out.println("- " + trophees[i] + " »");
				}
				else {
					musee.donnerTrophees(musee.getReserve()[musee.getNbTrophee()].getGaulois(), trophees[i]);
					System.out.println("- " + trophees[i]);
				}
			}
		}
		
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

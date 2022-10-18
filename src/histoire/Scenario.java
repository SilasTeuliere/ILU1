package histoire;

import personnage.Druide;
import personnage.Equipement;
import personnage.Gaulois;
import personnage.Romain;

public class Scenario {
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 9);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		panoramix.parler("Je vais aller pr�parer une petite potion ...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		asterix.prendreParole();
		asterix.boirePotion(panoramix.preparerPotion());
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

	}
}

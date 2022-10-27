package histoire;

import lieu.Musee;
import personnage.Druide;
import personnage.Equipement;
import personnage.Gaulois;
import personnage.Romain;

public class Scenario {

	public static void main(String[] args) {
		int frp = 0;
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller pr�parer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		druide.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
			frp++;
		} while (minus.getForce() > 0 && frp == 10 );
		milexcus.parler("UN GAU... UN GAUGAU...");
		frp = 0;
		do {
			asterix.frapper(milexcus);
			frp++;
		} while (milexcus.getForce() > 0 && frp == 10);
		
//		Partie a decommenter
		
		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);
		System.out.println(musee.extraireInstructionsCaml());
		

	}
}
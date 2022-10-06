package personnage;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion =1;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public int preparerPotion() {
		Random random = new Random();
		forcePotion =  effetPotionMin+random.nextInt(effetPotionMax-effetPotionMin);
		if(forcePotion >= 7) {
			System.out.println(prendreParole() + "� J'ai pr�par� une super potion de force " + forcePotion + " �");
		}else {
			System.out.println(prendreParole() + "�Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion + " �");
		}
		return forcePotion;
	}
	public void booster(Gaulois gaulois) {
		if(gaulois.getNom() == "Ob�lix") {
			System.out.println(prendreParole() + "� Non, " + gaulois.getNom() + "  !... Tu n�auras pas de potion magique ! �");
		gaulois.boirePotion(forcePotion);
		}
	}
	
	/*public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.booster();
		panoramix.preparerPotion(1);
	}*/
}
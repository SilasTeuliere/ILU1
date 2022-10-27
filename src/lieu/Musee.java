package lieu;

import personnage.Equipement;
import personnage.Gaulois;

public class Musee {
	protected Trophee reserve[] = new Trophee[200];
	protected int nbTrophee;

	public Trophee[] getReserve() {
		return reserve;
	}

	public int getNbTrophee() {
		return nbTrophee;
	}

	public void donnerTrophees(Gaulois gaulois, Equipement equipDonne) {
		reserve[nbTrophee] = new Trophee(gaulois, equipDonne); 
		nbTrophee++;
	}
	
	public String extraireInstructionsCaml() {
		String texte = " let musee = [";
		for(int i = 0; i < nbTrophee; i++) {
			if(i == nbTrophee-1) {
				texte = texte + "\n\""+ reserve[i].donneNom() +"\", \"" + reserve[i].getEquipement() + "\"\n";
			}
			else {
				texte = texte + "\n\""+ reserve[i].donneNom() +"\", \"" + reserve[i].getEquipement() + "\";";
			}
		}
		texte = texte + "]";
		return texte;
	}
}

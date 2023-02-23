package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Etes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					emmenagerGaulois(nomVisiteur);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		System.out.println(
				"Bienvenue druide "+ nomVisiteur +"\n"+ 
				"Quelle est votre force ?");
		StringBuilder question = new StringBuilder();
		int forceDruide = -1;
		forceDruide = Clavier.entrerEntier(question.toString());
		controlEmmenager.ajouterGaulois(nomVisiteur,forceDruide);
		int effetPotionMin = 0;
		int effetPotionMax = -1;
		while(effetPotionMax < effetPotionMin) {
			System.out.println("Quelle est la force de potion la plus faible que vous produisiez ? ");
			effetPotionMin = Clavier.entrerEntier(question.toString());
			System.out.println("Quelle est la force de potion la plus forte que vous produisiez ? ");
			effetPotionMax = Clavier.entrerEntier(question.toString());
			if(effetPotionMax<effetPotionMin){
				System.out.println("Attention Druide, vous vous êtes trompé entre le minimum et le maximum");
			}
		}
		controlEmmenager.ajouterDuide(nomVisiteur, forceDruide, effetPotionMin, effetPotionMax);
	}
	
	private void emmenagerGaulois(String nomVisiteur) {
		System.out.println(
				"Bienvenue villageois "+ nomVisiteur +"\n"+ 
				"Quelle est votre force ?");
		StringBuilder question = new StringBuilder();
		int forceGaulois = -1;
		forceGaulois = Clavier.entrerEntier(question.toString());
		controlEmmenager.ajouterGaulois(nomVisiteur,forceGaulois);
		
	}
}

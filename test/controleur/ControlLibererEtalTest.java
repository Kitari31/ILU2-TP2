package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlLibererEtalTest {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	void setUp(){
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlLibererEtal() {
		ControlLibererEtal libererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		assertNotNull(libererEtal,"Constructeur n'est pas null");
	}

	@Test
	void testViderEtal() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(village);
		ControlPrendreEtal prendreEtal = new ControlPrendreEtal(controlVerifierIdentite, village);
		ControlTrouverEtalVendeur trouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		ControlLibererEtal libererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		controlEmmenager.ajouterGaulois("Bonemine", 10);
		prendreEtal.prendreEtal("Bonemine", "Fleurs", 10);
	}

	@Test
	void testLibererEtal() {
		fail("Not yet implemented");
	}

	@Test
	void testIsVendeur() {
		fail("Not yet implemented");
	}

}

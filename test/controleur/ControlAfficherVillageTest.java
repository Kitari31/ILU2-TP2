package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation(){
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlAfficherVillage() {
		ControlAfficherVillage afficherVillage = new ControlAfficherVillage(village);
		assertNotNull(afficherVillage, "Constructeur ne renvoie pas null");
	}

	@Test
	void testDonnerNomsVillageois() {
		ControlAfficherVillage afficherVillage = new ControlAfficherVillage(village);
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine", 10);
		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		String[] villageois = new String[3];
		villageois[0] = "Abraracourcix";
		villageois[1] = "Bonemine";
		villageois[2] = "le druide Panoramix";
		assertArrayEquals(afficherVillage.donnerNomsVillageois(),villageois);
	}

	@Test
	void testDonnerNomVillage() {
		ControlAfficherVillage afficherVillage = new ControlAfficherVillage(village);
		assertEquals(village.getNom(), afficherVillage.donnerNomVillage());
	}

	@Test
	void testDonnerNbEtals() {
		ControlAfficherVillage afficherVillage = new ControlAfficherVillage(village);
		assertEquals(5, afficherVillage.donnerNbEtals());
	}

}

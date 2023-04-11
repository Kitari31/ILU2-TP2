package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAcheterProduitTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void InitialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlAcheterProduit() {
		fail("Not yet implemented");
	}

	@Test
	void testExistVendeur() {
		fail("Not yet implemented");
	}

	@Test
	void testVendeursProduit() {
		fail("Not yet implemented");
	}

	@Test
	void testQtyVendeur() {
		fail("Not yet implemented");
	}

	@Test
	void testAssezProduit() {
		fail("Not yet implemented");
	}

	@Test
	void testVenteProduit() {
		fail("Not yet implemented");
	}

}

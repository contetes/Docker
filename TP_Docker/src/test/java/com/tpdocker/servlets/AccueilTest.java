package com.tpdocker.servlets;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tpdocker.servlets.Accueil;

import static org.junit.Assert.*;

public class AccueilTest {
	private static Accueil accueil;

	@BeforeClass
	public static void beforeClass() {
		accueil = new Accueil();
	}

	@Test
	public void testAccueil() {
		assertEquals("Accueil is not instantiated : ", "Accueil", accueil.getClass().getSimpleName());
	}

}

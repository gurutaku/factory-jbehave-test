package com.globalsoft.bdd.acceptancetest.steps;

import net.serenitybdd.jbehave.SerenityStories;


public class AcceptanceTestSuite extends SerenityStories  {
	public AcceptanceTestSuite() {
		findStoriesCalled("*.story");
	}
}

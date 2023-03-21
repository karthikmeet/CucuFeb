package org.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Backgroundstepdef {

	@Given("sample bg given")
	public void givenbg() {
		System.out.println("sample bg given");
	}

	@When("sample bg when")
	public void whenbg() {
		System.out.println("sample bg when");
	}

	@Then("sample bg then")
	public void thenbg() {
		System.out.println("sample bg then");
	}

}

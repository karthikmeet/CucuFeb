package org.stepdef;

import org.junit.Assert;
import org.pagerepo.LoginRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {

	LoginRepo repo = new LoginRepo();

	@Given("Open fb and launch the application")
	public void open_fb_and_launch_the_application() {
		System.out.println("Scenario Given");
		Hook.driver.get("https://www.facebook.com");
	}

//	@When("I enter the user credentials {string} and {string}")
//	public void i_enter_the_user_credentials(String username, String password) {
//		repo.getUsername().sendKeys(username);
//		repo.getPassword().sendKeys(password);
//	}
//
//	@And("supporting statement one")
//	public void xxxxxxxx() {
//		System.out.println("AND");
//	}
//
//	@But("supporting statement two")
//	public void yyyyyyy() {
//		System.out.println("BUT");
//	}

	@When("I enter the user credentials")
	public void i_enter_the_user_credentials() {
		System.out.println("Scenario When");
		repo.getUsername().sendKeys("username");
		repo.getPassword().sendKeys("password");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("Scenario Then");
		Assert.assertTrue(false);
	}
	
	@Then("Close the browserXXX")
	public void close_the_browserXXX() {
		System.out.println("Scenario Then");
	}
}

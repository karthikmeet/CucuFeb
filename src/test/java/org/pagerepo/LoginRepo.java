package org.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdef.Hook;


public class LoginRepo {
	public LoginRepo() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;
	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
}

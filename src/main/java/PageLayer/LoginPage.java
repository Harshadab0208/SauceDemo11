package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass
	{
		@FindBy(name="user-name")
		private WebElement username;

		@FindBy(name="password")
		private WebElement password;

		@FindBy(name="login-button")
		private WebElement login;

		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}

		public void LoginPageFunctionality(String Username, String Password)
		{
			Wait.sendKeys(username, Username);
			Wait.sendKeys(password, Password);
			Wait.click(login);

		}


	}



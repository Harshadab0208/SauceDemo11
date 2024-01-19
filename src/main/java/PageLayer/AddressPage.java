package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddressPage extends BaseClass{
	
	@FindBy(name="checkout")
	private WebElement checkout;

	@FindBy(name="firstName")
	private WebElement firstName;

	@FindBy(name="lastName")
	private WebElement lastName;
	
	
	@FindBy(name="postalCode")
	private WebElement postalCode;
	
	@FindBy(name="continue")
	private WebElement continueButton;
	

	public AddressPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCheckout()
	{
		Wait.click(checkout);
	}

	public void AddressPageFunctionality(String FirstName, String LastName, String ZipCode)
	{
		Wait.sendKeys(firstName,FirstName );
		Wait.sendKeys(lastName, LastName);
		Wait.sendKeys(postalCode, ZipCode);
		Wait.click(continueButton);	

	}
	
	

}

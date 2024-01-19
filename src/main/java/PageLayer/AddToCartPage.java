package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddToCartPage extends BaseClass{

	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement backpack;

	@FindBy(xpath="//button[contains(@name, 'bolt-t-shirt')]")
	private WebElement Tshirt;

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addToCartButton;

	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void AddToCartPageFunctionality()
	{
		Wait.click(backpack);
		Wait.click(Tshirt);
		

	}
	
	public void clickOnAddtoCart()
	{
	
		Wait.click(addToCartButton);
	}

}

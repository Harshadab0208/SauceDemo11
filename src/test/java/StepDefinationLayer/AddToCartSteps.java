package StepDefinationLayer;

import BaseLayer.BaseClass;
import PageLayer.AddToCartPage;
import io.cucumber.java.en.When;

public class AddToCartSteps extends BaseClass {
	AddToCartPage addToCartPage;
	
	@When("Click on BackPack and T-Shirt")
	public void click_on_back_pack_and_t_shirt() {
		addToCartPage= new AddToCartPage();
		addToCartPage.AddToCartPageFunctionality();

	}

	@When("Click on AddTocart Button")
	public void click_on_add_tocart_button() {
		addToCartPage.clickOnAddtoCart();
	}

}

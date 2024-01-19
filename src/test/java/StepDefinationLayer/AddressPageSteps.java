package StepDefinationLayer;

import BaseLayer.BaseClass;
import PageLayer.AddressPage;
import io.cucumber.java.en.When;

public class AddressPageSteps extends BaseClass {
	
	AddressPage addressPage;
	
	@When("user click on chekout button")
	public void user_click_on_chekout_button() {
		addressPage = new AddressPage();
		addressPage.clickOnCheckout();
	}

	
	
	@When("user enter {string},{string},{string} and click on continue button")
	public void user_enter_and_click_on_continue_button(String FirstName, String LastName, String ZipCode) {
		addressPage.AddressPageFunctionality(FirstName, LastName, ZipCode);
	}

}

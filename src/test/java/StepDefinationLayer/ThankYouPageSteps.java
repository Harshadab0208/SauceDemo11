package StepDefinationLayer;

import BaseLayer.BaseClass;
import PageLayer.ThankYouPage;
import io.cucumber.java.en.When;

public class ThankYouPageSteps extends BaseClass{

	@When("user click on finish")
	public void user_click_on_finish() {
		
		ThankYouPage thankYouPage = new ThankYouPage();
		thankYouPage.ThankUPageFunctionality();
	}

}

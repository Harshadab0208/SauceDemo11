package StepDefinationLayer;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.ThankYouPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class ThankYouPageSteps extends BaseClass{

	@When("user click on finish")
	public void user_click_on_finish() {
		
		ThankYouPage thankYouPage = new ThankYouPage();
		thankYouPage.ThankUPageFunctionality();
	}
	
	@AfterStep
	public void tearDown(Scenario scenario) throws InterruptedException
	
	{
		Thread.sleep(4000);
		TakesScreenshot ts= (TakesScreenshot) driver;
		byte[] f= ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(f, "image/png", scenario.getId());
		
	}

}

package StepDefinationLayer;

import java.util.List;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
	LoginPage loginPage;

	@Given("user is at home page")
	public void user_is_at_home_page() {
		BaseClass.initialization();
	}

	@When("user Enter Username and Password and click on login buttton")
	public void user_enter_username_and_password_and_click_on_login_buttton(DataTable dataTable) {

		loginPage = new LoginPage();
		List<List<String>> ls = dataTable.asLists();
		String uname = ls.get(0).get(0);
		String pass = ls.get(0).get(1);
		loginPage.LoginPageFunctionality(uname, pass);
		
		
	}

	@Then("validate user is on Addtocart page")
	public void validate_user_is_on_addtocart_page() {

		String ActualUrl = driver.getCurrentUrl();
		boolean check = ActualUrl.contains("inventory");
		Assert.assertEquals(check , true);
	}
}

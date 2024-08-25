package stepdefinition;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private LoginPage loginPage = new  LoginPage(DriverFactory.getDriver());
	
	@Given("User logs into CRM")
	public void user_logs_into_crm() {
		DriverFactory.getDriver().get("https://freecrm.com/");
	}
	@Then("User clicks on Login")
	public void user_clicks_on_login() {
		loginPage.clickOnLoginButtonMainPage();
	}
	
	@When("User Provides the login {string} and {string}")
	public void user_provides_the_login_username_and(String Username, String Password) {
	    loginPage.provideUsernameAndPassword(Username, Password);
	}

	@Then("User is Logged into the Account")
	public void user_is_logged_into_the_account() throws InterruptedException {
		loginPage.clickOnLoginButton();
	}
	
	@Then("User Verifies the company in Homepage")
	public void company_name_is_abc() {
		loginPage.verifyHomePageTitle();
	}

}

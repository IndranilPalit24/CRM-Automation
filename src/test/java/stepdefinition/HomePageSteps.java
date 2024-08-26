package stepdefinition;

import java.util.List;

import org.junit.Assert;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	/*HomePage Class Initialization
	 * */
	private HomePage homepage = new HomePage(DriverFactory.getDriver());
	

@Given("User logs into the CRM Website and is on Home Page")
public void user_logs_into_the_crm_website_and_is_on_home_page() {
	homepage.verifyHomePageTitle();
}

@Then("User gets to Cogmento Home Page List")
public void user_gets_to_cogmento_home_page_list(DataTable sectionsTable) {
	/*Empty String List storing the List values from Feature File */
	List<String> expectedHomePageSectionList = sectionsTable.asList()	;
	System.out.println("Expected HomePage Section List: "+expectedHomePageSectionList);
	
	/*Empty String List storing the List values from CRM WebPage*/
	List<String> actualHomePageSectionList = homepage.getHomePageList();
	System.out.println("Actual Home Page Section List: "+actualHomePageSectionList);
	
	/*Validate if the expected List actually has all the elements on the webpage list*/
	Assert.assertTrue(expectedHomePageSectionList.containsAll(actualHomePageSectionList));
		
}

@And("Home Page count should be {int}")
public void home_page_count_should_be(Integer expectedListCount) {
	Assert.assertTrue(homepage.getHomePageListCount()==expectedListCount);
}

}

package stepdefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;
import utils.DriverFactory;

public class SearchMovie {
	
	@Given("Page has opened and working")
	public void page_has_opened_and_working() {
	    WebDriver driver=DriverFactory.getdrivDriver();
	    driver.get(ConfigReader.getProperty("bmsurl"));
	}

	@When("User enters the text in the serach field")
	public void user_enters_the_text_in_the_serach_field() {
		 System.out.println("OUTPUT: pUser enters the text in the serach field");
	}
	    

	@When("The user clicks on the search button")
	public void the_user_clicks_on_the_search_button() {
		System.out.println("OUTPUT: pThe user clicks on the search button");
	}

	@Then("The movie list should be displayed")
	public void the_movie_list_should_be_displayed() {
		System.out.println("OUTPUT: pThe movie list should be displayed");
	}
	
	@When("User enters details in the serach field")
	public void user_enters_details_in_the_serach_field(DataTable dataTable) {
		List<List<String>> movies= dataTable.asLists(String.class);
		
		for(List<String> rows:movies) {
			for(String detail: rows) {
				System.out.println(detail);
			}
		}
	   
	}
	
	@When("The user searches more movies")
	public void the_user_searches_more_movies(DataTable dataTable) {
		List<Map<String, String>> details = dataTable.asMaps(String.class,String.class);
		for(Map<String,String> rows:details) {
			for(String column: rows.keySet()) {
				System.out.println(rows.get(column));
			}
		}
	    
	}

}

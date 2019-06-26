package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JavaScriptInstall {
	public WebDriver driver= null;
	@Given("Open the browser")
	public void open_the_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravana Kumar Reddy\\Desktop\\com.cucumber_demo\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter the URL {string}")
	public void enter_the_URL(String string) {
	driver.get("https://developer.here.com/");
	}

	@And("Verify the home page")
	public void verify_the_home_page() {
	driver.getCurrentUrl();

	}

	@And("searching on the javascript")
	public void searching_on_the_javascript() {
	driver.findElement(By.xpath("a[@title='landing_javascript_link_title']")).click();

	   
	}

	@Then("JavaScript is installed successfully")
	public void javascript_is_installed_successfully() {
	String actualTitle = driver.getTitle();
	String expectedTitle = "Using our JavaScript API is a piece of cake. Check out some examples, including how to display a place marker on a map.";
	if(actualTitle.equalsIgnoreCase(expectedTitle))
	System.out.println("Title Matched");
	else
	System.out.println("Title didn't match");

	   
	}

}

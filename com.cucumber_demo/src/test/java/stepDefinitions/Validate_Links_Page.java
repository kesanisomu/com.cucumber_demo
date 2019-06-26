package stepDefinitions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Validate_Links_Page {
	 WebDriver driver;
@Given("Open the browser")
public void open_the_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravana Kumar Reddy\\Desktop\\com.cucumber_demo\\Drivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
}




@When("Enter the URL")
public void enter_the_URL() {
	driver.get("https://developer.here.com/documentation");
}
@And("Verify the home page")
public void verify_the_home_page() {
	//driver.getCurrentUrl();
	
	System.out.println(driver.getCurrentUrl());
		/*
		 * String expected_HomePageURL="https://developer.here.com/documentation";
		 * String actul_HomePageURL= driver.getTitle();
		 * Assert.assertEquals("expected_HomePageURL", "actul_HomePageURL");
		 */
}


@And("Check the links are valid or not")
public void check_the_links_are_valid_or_not() {
	List<WebElement> links = driver.findElements(By.tagName("a")); 
	 System.out.println("Total links are "+links.size()); 
	 for(int i=0; i<links.size(); i++) {
	 WebElement element = links.get(i);
	 String url=element.getAttribute("href");
	 it_be_stored_on_the_internal_links_results_successfully(url); 
	 
}	 
}

@Then("It be stored on the internal links results successfully")
public void it_be_stored_on_the_internal_links_results_successfully(String urlLink) {
	try {
		 URL link = new URL(urlLink);
		 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		 httpConn.setConnectTimeout(2000);
		 httpConn.connect();
		 if(httpConn.getResponseCode()== 200) { 
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		 }
		 if(httpConn.getResponseCode()== 404) {
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		 }
		 }
		 catch (Exception e) {
		 
    }
}


}

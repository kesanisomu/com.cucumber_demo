package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="ValidateAllLinks.feature",
		//dryRun= true,
		//monochrome= true,
		glue= "Validate_Links_Page"
		
		)

public class LinkValidations {
	

}

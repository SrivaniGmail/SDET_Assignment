package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 

@CucumberOptions(
		features = "src/test/java/feature",
		glue = {"stepDefinition","utilities"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:reports/", "json:reports/jsonreport.json", "junit:reports/xmlreports.xml"} 
	
		)

public class TestRunner {

}

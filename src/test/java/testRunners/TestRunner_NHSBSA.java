package testRunners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/jobSearch.feature",
glue={"stepDefinitions"}, 
//tags = {"@tag1"},
plugin = { "pretty" ,
		"html:target/cucumber-html-report.html",
		"json:target/cucumber-json-report/cucumber.json",
		"junit:target/cucumber-junit-report/cucumber.xml"
		},

dryRun = false,
//strict = true,
monochrome = true

		
		)
public class TestRunner_NHSBSA {

	
	@AfterClass
	public static void writeExtentReport() {
	}
	
}

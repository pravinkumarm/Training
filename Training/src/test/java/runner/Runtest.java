package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src\\test\\java\\FeatureFiles\\Createlead.feature",glue="stepdefinision",monochrome = true)
public class Runtest extends AbstractTestNGCucumberTests {
							 
	

	
	
}

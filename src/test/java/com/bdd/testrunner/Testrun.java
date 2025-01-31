package com.bdd.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { ".//Feature/DemoSignUp.feature" }, 
glue = "com.bdd.StepDefination", 
dryRun = false, monochrome = true,
plugin = {
		"pretty", "html:target/Cucumber-report/demoblaze.html" },

		tags = "@regression"

)

//the cucumber file will always be empty
public class Testrun {

}
 


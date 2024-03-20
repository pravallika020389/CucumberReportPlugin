package com.automation.runners;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features/salesForce.feature"},
		glue= {"com.automation.steps"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/cucumber-reports.html",
				"json:target/cucumber.json"
				
		}
		
		)
public class SalesForceRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	

}

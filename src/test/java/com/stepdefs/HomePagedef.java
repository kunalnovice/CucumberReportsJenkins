package com.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.RandomData;
import com.common.SharedDriver;
import com.pages.Home_Page;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePagedef extends AbstractStepDefinition{
	

	
    @Before
    public void before(Scenario scenario) {
        super.before(scenario);
    }
    
	@Given("^givenstep$")
	public void givenstep() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException(); comment added for the CI build to trigger
		System.out.println("In Given Step");
	}

	@When("^whenstep$")
	public void whenstep() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("In When Step");
	}

	@Then("^thensteps$")
	public void thensteps() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("In Then Step");
	}
    
  



	
}

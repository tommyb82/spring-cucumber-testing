package com.example;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@ContextConfiguration(classes = SpringCucumberTestingApplication.class)
@WebAppConfiguration
public class CoffeeSteps {
	
	@Autowired
	private String developerName;
	
	@Given("^there are (\\d+) coffees left in the machine$")
	public void there_are_coffees_left_in_the_machine(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("DEVELOPER NAME IS: " + developerName);
		Assert.assertTrue(true);
	}

	@Given("^I have deposited (\\d+)\\$$")
	public void i_have_deposited_$(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	}

	@When("^I press the coffee button$")
	public void i_press_the_coffee_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	}

	@Then("^I should be served a coffee$")
	public void i_should_be_served_a_coffee() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	}
}

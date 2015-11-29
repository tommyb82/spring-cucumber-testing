package com.example.steps

import org.junit.Assert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration

import com.example.SpringCucumberTestingApplication;

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

@ContextConfiguration(classes = SpringCucumberTestingApplication.class)
class CoffeeSteps {
	
	@Autowired
	def String developerName
	
	@Given('^there are (\\d+) coffees left in the machine$')
	def there_are_coffees_left_in_the_machine(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		println 'DEVELOPER NAME IS: ' + developerName
		println 'How many coffees? ' + arg1
		Assert.assertTrue(true)
	}

	@Given('^I have deposited (\\d+)\\$$')
	def i_have_deposited_$(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true)
	}

	@When('^I press the coffee button$')
	def i_press_the_coffee_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true)
	}

	@Then('^I should be served a coffee$')
	def i_should_be_served_a_coffee() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true)
	}
}

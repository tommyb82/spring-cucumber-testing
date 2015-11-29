package com.example.steps

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject
import org.apache.camel.component.mock.MockEndpoint
import org.junit.Assert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration

import com.example.SpringCucumberTestingApplication

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

/**
 * @author tom
 *
 */
@ContextConfiguration(classes = SpringCucumberTestingApplication.class)
public class FileMoveSteps {

	@Autowired
	protected CamelContext camelContext;
	
	@EndpointInject(uri = "mock:file:C:\\Temp\\camelsource?fileName=camelsource.txt&noop=true")
	MockEndpoint mockEndpoint;
	
	@Given('^there are is a file in the source directory$')
	def there_are_is_a_file_in_the_source_directory() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		println mockEndpoint
		Assert.assertTrue(true)
	}

	@When('^the route is started$')
	def the_route_is_started() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(true)
	}

	@Then('^the file is copied to the target directory$')
	def the_file_is_copied_to_the_target_directory() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(true)
	}
	
}

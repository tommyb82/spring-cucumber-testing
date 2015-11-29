package com.example

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features = ["src/int-test/resources/cucumber/features"],
	glue = ["com.example.steps", "cucumber.runtime.java.spring"])
class RunCukesTest {
	/* nuffin */
}

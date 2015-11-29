package com.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/cucumber/features"},glue = {"com.example", "cucumber.runtime.java.spring"})
public class RunCukesTest {

}

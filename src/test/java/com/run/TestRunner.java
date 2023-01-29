package com.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="Features",
glue = {"stepsDefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

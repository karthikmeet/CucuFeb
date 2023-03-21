package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "org.stepdef", monochrome = true, strict = true,  
plugin = {"json:target/sample.json", "rerun:./src/test/resources/failed.txt" })
public class Runner {

}


package com.orangeHRM.demo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/com.orangeHRM.demo.resources/features",
        glue = "com.orangeHRM.demo.steps",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}

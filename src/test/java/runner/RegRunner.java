package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
								glue="steps",
								stepNotifications=true,
								dryRun=false,
								tags="@wip0404k",
								plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
										"html:target/cucumber-reports/reports.html"},
								monochrome = true)
public class RegRunner {

}
//package runner;
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//    features = "src/test/resources/features",
//    glue = "steps",
//    tags = "@wip0404k",
//    plugin = {
//        "pretty",
//        "json:target/cucumber-reports/Cucumber.json",
//        "html:target/cucumber-reports/reports.html"
//    },
//    monochrome = true,
//    publish = false
//)
//public class RegRunner {
//}

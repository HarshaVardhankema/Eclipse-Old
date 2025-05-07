// cucumber  class
package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//	    features = "src/test/resources/Features/Login.feature",
//	    glue = {"StepDefinitions"}, 
//	    plugin = {"pretty", "html:test-outout", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
//	    dryRun = false,
//	    monochrome = true
//	)


//public class TestRunner {
//}



// data driven flow 



// Ensure there's no parallel execution configured in your TestRunner.java
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/Users/hneth/eclipse-workspace/Cucumber/src/test/resources/Features/Hooks.feature", 
    glue = "StepDefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true,
    dryRun = true
      
)
public class TestRunner {
}




//PatientStepdefiniton




//@RunWith(Cucumber.class)
//@CucumberOptions(
//    features = "src/test/resources/Features",  // Path to the features folder
//    glue = {"StepDefinitions"},                // Package for step definition classes
//    dryRun = true,                             // If true, checks if all step definitions are implemented
//    monochrome = true                          // Makes the console output more readable
//                        // Can be used to run specific scenarios or features
//)
//public class TestRunner {
	    
	




    // This class will be used to run all tests in the specified feature files
//}

		







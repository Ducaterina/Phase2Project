package stepDefs;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin = {"html:target/htlm-cucumber","json:target/cucumber.json"},
		
		features="src/test/java/features",
		
		//tags= {"@F_LoginSauceDemo"}, 
		//tags= {"@F_Products"}, 
		
		//tags={"@Regression"},
		//tags={"@Sanity"},
		
		glue={"stepDefs"}
		
		)
public class TestRunner {

	
}

package Cucumber_learning;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features= {"src/test/resources"},
		glue= {"Cucumber_learning"},
		plugin={"pretty","html:target/TestReport.html"}
		//tags={"@Testing"}
		
		
		)
public class Testruner {
//yah Empty he rehga 
}

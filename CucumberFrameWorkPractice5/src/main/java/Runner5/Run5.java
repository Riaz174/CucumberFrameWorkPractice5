package Runner5;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\main\\java\\Feature5\\Contact5.Feature"},glue = {"StepDefinition5"},monochrome = true,tags = {"@tag1"})
public class Run5 {

}

 package stefdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = {"Feature File"},
		glue={"stefdefination"},
        plugin = {"pretty",
                  "html:target/report/cucumber.html",
                  "json:target/report/cucumber.json"
                 },
       // dryRun = true,
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" },
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber", "json:target/cucumber.json" },
		//tags="@contact"
//tags="@Regression"
	    //tags= "@Login and not @sanity"
        //tags= "@Login and  @sanity"
	 //tags= "@sanity"
	    //tags= "@Regression"
     tags= "@sanity and not @Regression"
 //tags= "@sanity and @Regression"
    // tags="@DB"
        //tags="@Regression or  @sanity"
        // and  @Regressionand  @Regression
		)
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}
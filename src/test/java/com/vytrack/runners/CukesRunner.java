package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //@ it from junit
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = true,
        tags = "@wip"
)

      /*
      tags="login"  it will run all Scenario if have  @login tang
      tans="loginPage" , because tang on top of the feature ,it well run all Scenario under feature
      tags="@store_manager and @smoke" it will just run matching tangs one
      tags="@loginPage and not @smoke" it will run all under feature scenario with out @smoke tags one
      tags="@loginPage and not @smoke and not @store_manager  and not@..." we can did not run as manny as we wan scenario

       */


public class CukesRunner {

}

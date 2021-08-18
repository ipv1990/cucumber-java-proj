package testRunner;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = ".//Features/F01_LoginEmias.feature",
                tags = "@F01S01",
                glue = "stepDefinitions",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty","html:test-output"}
        )


public class TestRun {

        // Адреса стендов
        public static String testUrl = "http://our-product-test-endpoint?";
        public static String localhost = "http://{IP_ADDR}:4200/";

}
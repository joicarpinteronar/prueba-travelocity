package com.travelocity.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/searchFlights.feature",
        glue = "com.travelocity.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class FlightsRunner {
}

package com.travelocity.automation.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonsStepDefinitions {

  @Before
  public void prepareStage() {
    OnStage.setTheStage(new OnlineCast());

  }

}

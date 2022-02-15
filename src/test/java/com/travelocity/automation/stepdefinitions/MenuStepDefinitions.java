package com.travelocity.automation.stepdefinitions;

import com.travelocity.automation.tasks.navigations.Navigate;
import com.travelocity.automation.tasks.opcionesmenu.SelectMenuOptions;
import com.travelocity.automation.tasks.opcionesmenu.SelectMenuOptionsOneWay;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class MenuStepDefinitions {

    @Dado("^que un (.*) ingresa al portal de Travelocity$")
    public void goToThePortal(String actor) {
        theActorCalled(actor).wasAbleTo(Navigate.openUrl());
    }

    @Y("^el viajero selecciona el menu de Flights y selecciona la opcion Roundtrip$")
    public void goToTheMenu() {
        theActorInTheSpotlight().attemptsTo(SelectMenuOptions.goMenu());
    }
    @Y("^el viajero selecciona el menu de Flights y selecciona la opcion One-way$")
    public void goToTheMenuOneWay() {
        theActorInTheSpotlight().attemptsTo(SelectMenuOptionsOneWay.goMenuOneWay());
    }
}

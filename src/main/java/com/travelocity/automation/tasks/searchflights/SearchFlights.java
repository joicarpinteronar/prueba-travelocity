package com.travelocity.automation.tasks.searchflights;

import com.travelocity.automation.interactions.date.SelectDateOnCalendar;
import com.travelocity.automation.interactions.waits.WaitElement;
import com.travelocity.automation.interactions.waits.WaitFor;
import com.travelocity.automation.models.searchflights.SearchFlightsModel;
import com.travelocity.automation.userinterfaces.searchflights.SearchFlightsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.travelocity.automation.utils.Constants.NUMBER_OF_DAYS;

public class SearchFlights implements Task {

    SearchFlightsModel flights;

    public SearchFlights(SearchFlightsModel flights) {
        this.flights = flights;
    }

    @Step("{0} search Flights")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.esClickable(SearchFlightsPage.BTN_ORIGIN),
                Click.on(SearchFlightsPage.BTN_ORIGIN),
                WaitElement.esClickable(SearchFlightsPage.TXT_ORIGIN),
                Enter.theValue(flights.getOrigin()).into(SearchFlightsPage.TXT_ORIGIN),
                WaitFor.unTiempo(5000),
                WaitElement.esClickable(SearchFlightsPage.OPTION_ORIGIN),
                Click.on(SearchFlightsPage.OPTION_ORIGIN),
                WaitElement.esClickable(SearchFlightsPage.BTN_DESTINATION),
                Click.on(SearchFlightsPage.BTN_DESTINATION),
                WaitElement.esClickable(SearchFlightsPage.TXT_DESTINATION),
                Enter.theValue(flights.getDestination()).into(SearchFlightsPage.TXT_DESTINATION),
                WaitFor.unTiempo(2000),
                WaitElement.esClickable(SearchFlightsPage.OPTION_DESTINATION),
                Click.on(SearchFlightsPage.OPTION_DESTINATION),
                WaitFor.unTiempo(2000),
                WaitElement.esClickable(SearchFlightsPage.BTN_DATE_DEPARTING),
                Click.on(SearchFlightsPage.BTN_DATE_DEPARTING),
                SelectDateOnCalendar.toScheduleServiceIn(NUMBER_OF_DAYS),
                WaitElement.esClickable(SearchFlightsPage.BTN_DONE_CALENDAR),
                Click.on(SearchFlightsPage.BTN_DONE_CALENDAR),
                WaitElement.esClickable(SearchFlightsPage.BTN_SEARCH),
                Click.on(SearchFlightsPage.BTN_SEARCH),
                WaitFor.unTiempo(7000)

        );
    }
    public static SearchFlights searchFlights(SearchFlightsModel flights) {
        return Tasks.instrumented(SearchFlights.class, flights);
    }
}

package com.travelocity.automation.interactions.date;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.automation.userinterfaces.searchflights.SearchFlightsPage.DATE_SELECT;
import static com.travelocity.automation.userinterfaces.searchflights.SearchFlightsPage.NEXT_MONTH;
import static com.travelocity.automation.utils.Constants.HYPHEN_DATE_FORMAT;
import static com.travelocity.automation.utils.Utilities.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectDateOnCalendar implements Interaction {

  private final int quantityDays;

  public SelectDateOnCalendar(int quantityDays) {
    this.quantityDays = quantityDays;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Check.whether(
                getMonthDate(getCurrentDate(HYPHEN_DATE_FORMAT), HYPHEN_DATE_FORMAT)
                    != getMonthDate(
                        getCurrentDate(HYPHEN_DATE_FORMAT), HYPHEN_DATE_FORMAT))
            .andIfSo(Click.on(NEXT_MONTH)),
        WaitUntil.the(
            DATE_SELECT.of(
                Integer.toString(
                    getDayDate(
                            getCurrentDate(HYPHEN_DATE_FORMAT),
                       HYPHEN_DATE_FORMAT))),
            isPresent()),
        Click.on(
            DATE_SELECT.of(
                Integer.toString(
                    getDayDate(
                            getCurrentDate(HYPHEN_DATE_FORMAT),
                        HYPHEN_DATE_FORMAT)))));
  }

  public static SelectDateOnCalendar toScheduleServiceIn(int numberDays) {
    return instrumented(SelectDateOnCalendar.class, numberDays);
  }
}

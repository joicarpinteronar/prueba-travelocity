package com.travelocity.automation.tasks.opcionesmenu;

import com.travelocity.automation.interactions.menu.SelectMenuOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static com.travelocity.automation.utils.enums.MenuOptions.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectMenuOptionsOneWay implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
             SelectMenuOption.selectMenu(FLIGHTS.getValue()).andSubmenu(ONEWAY.getValue()));
    }

    public static SelectMenuOptionsOneWay goMenuOneWay() {
        return instrumented(SelectMenuOptionsOneWay.class);
    }
}
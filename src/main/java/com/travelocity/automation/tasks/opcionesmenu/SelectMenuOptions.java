package com.travelocity.automation.tasks.opcionesmenu;

import com.travelocity.automation.interactions.menu.SelectMenuOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static com.travelocity.automation.utils.enums.MenuOptions.FLIGHTS;
import static com.travelocity.automation.utils.enums.MenuOptions.ROUNDTRIP;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectMenuOptions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
             SelectMenuOption.selectMenu(FLIGHTS.getValue()).andSubmenu(ROUNDTRIP.getValue()));

    }

    public static SelectMenuOptions goMenu() {
        return instrumented(SelectMenuOptions.class);
    }
}
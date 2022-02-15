package com.travelocity.automation.tasks.navigations;

import com.travelocity.automation.userinterfaces.urls.Url;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    Url url;

    @Step("{0} Navigations to a url ")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(url));
    }

    public static Navigate openUrl() {
        return instrumented(Navigate.class);
    }
}

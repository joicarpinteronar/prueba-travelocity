package com.travelocity.automation.stepdefinitions;

import com.travelocity.automation.models.searchflights.SearchFlightsModel;
import com.travelocity.automation.questions.ValidateInformationText;
import com.travelocity.automation.questions.VerifyListFlights;
import com.travelocity.automation.tasks.opcionesmenu.SelectMenuOptions;
import com.travelocity.automation.tasks.searchflights.SearchFlights;
import com.travelocity.automation.tasks.searchflights.SelectTravelers;
import com.travelocity.automation.userinterfaces.searchflights.SearchFlightsPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;

import static com.travelocity.automation.utils.Constants.ERROR_FIELD_CLEAN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class SearchFlightsStepDefinitions {

    @Cuando("^ingresa la ciudad de origen y destino y selecciona un vuelo para el mes siguiente$")
    public void goToSearchFlights(List<SearchFlightsModel> flights) {
        theActorInTheSpotlight().attemptsTo(SearchFlights.searchFlights(flights.get(0)));
    }
    @Entonces("se debe mostrar la lista de vuelos disponibles")
    public void mustSelectedFlights() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerifyListFlights.selected())
        );
    }
    @Entonces("se debe mostrar el mensaje de error que faltan campos por llenar")
    public void mustSelectedFlightsClean() {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(SearchFlightsPage.ALERT_ERROR),equalTo(ERROR_FIELD_CLEAN)));
    }

    @Y("agrega (.*) Adultos y (.*) ninos para la reserva del viaje")
    public void selectAdultsAndChildrenToReserveRoom(Integer numberAdults, Integer numberChildren) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTravelers.addTravelers(numberAdults, numberChildren));
    }
}

package com.travelocity.automation.userinterfaces.searchflights;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchFlightsPage extends PageObject {

    public static final Target BTN_ORIGIN = Target.the("Boton Origen").located(By.xpath("//button[contains(@data-stid,'location-field-leg1-origin-menu-trigger')]"));
    public static final Target TXT_ORIGIN = Target.the("Ingresar Origen").located(By.id("location-field-leg1-origin"));
    public static final Target OPTION_ORIGIN = Target.the("Primer Resultado Origen").located(By.xpath("//ul[@data-stid='location-field-leg1-origin-results']//li"));
    public static final Target BTN_DESTINATION = Target.the("Boton Destino").located(By.xpath("//button[contains(@data-stid,'location-field-leg1-destination-menu-trigger')]"));
    public static final Target TXT_DESTINATION = Target.the("Ingresar Destino").located(By.id("location-field-leg1-destination"));
    public static final Target OPTION_DESTINATION = Target.the("Primer Resultado Destino").located(By.xpath("//ul[@data-stid='location-field-leg1-destination-results']//li"));
    public static final Target DATE_SELECT = Target.the("Seleccionar Dia").locatedBy("//div[2]/table/tbody/tr//td//button[@data-day='{0}']");
    public static final Target SELECT_DATE_SPECIFIC = Target.the("Seleccionar Fecha Especifica").located(By.xpath("//ul[@data-stid='location-field-leg1-destination-results']//li"));
    public static final Target BTN_DONE_CALENDAR = Target.the("Boton Listo Fecha").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target BTN_SEARCH = Target.the("Boton Buscar vuelo").located(By.xpath("//button[@data-testid='submit-button']"));
    public static final Target BTN_DATE_DEPARTING = Target.the("Boton Fecha Ida").located(By.id("d1-btn"));
    public static final Target BTN_DATE_RUTURNING = Target.the("Boton Fecha Retorno").located(By.id("d2-btn"));
    public static final Target NEXT_MONTH = Target.the("Botón para pasar al siguiente mes calendario").locatedBy("//button[@data-testid='date-picker-paging']");
    public static final Target TOTAL_FINAL_PRICE = Target.the("Boton Seleccionar Primer Vuelo").located(By.xpath("//button[@data-testid='select-link']"));
    public static final Target ALERT_ERROR = Target.the("Alerta de Error campos vacios").located(By.xpath("//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[1]/div/h3"));



}



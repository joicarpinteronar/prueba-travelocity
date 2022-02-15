package com.travelocity.automation.userinterfaces.searchflights;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BTN_TRAVELERS = Target.the("Boton Viajeros").located(By.xpath("//button[@data-testid='travelers-field']"));
    public static final Target BTN_ADD = Target.the("Boton Viajeros").located(By.xpath("//button[@data-testid='travelers-field']"));
    public static final Target BTN_ADD_ADULTS = Target.the("Agregar Adultos").located(By.xpath("(//div[@data-testid='room-1']//button)[2]"));
    public static final Target BTN_ADD_CHILDREN = Target.the("Agregar Ninos").located(By.xpath("(//div[@data-testid='room-1']//button)[4]"));
    public static final Target BTN_CLASS_TRAVEL = Target.the("Boton Tipo Clase Vuelo").located(By.id("preferred-class-input-trigger"));
    public static final Target BTN_DONE_TRAVELERS = Target.the("Boton Listo Viajeros").located(By.xpath("//button[@data-testid='guests-done-button']"));
    public static final Target BTN_CLASS_TRAVELERS = Target.the("Boton Listo Viajeros").located(By.id("preferred-class-input-trigger"));
    public static final Target LIST_CLASS_TRAVELERS = Target.the("Boton Listo Viajeros").locatedBy("//*[@id='preferred-class-input']/div/div/a//span[text()='{0}']");



}

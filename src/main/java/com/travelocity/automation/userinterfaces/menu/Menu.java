package com.travelocity.automation.userinterfaces.menu;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class Menu {

  public static final Target MENU_BUTTON = Target.the("Opciones Menu").located(By.xpath("//span[contains(.,'Stays')]"));

  public static final Target MENU_OPTIONS = Target.the("Opciones Menu Aplicacion Travelocity").locatedBy("//div/div/ul/li/a/span[text()='{0}']");

  public static final Target SUBMENU_OPTION = Target.the("Submenu Opcion de Vuelo").locatedBy("//ul[@id='uitk-tabs-button-container']/div/li/a/span[text()='{0}']");

  private Menu() {}
}

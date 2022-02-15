package com.travelocity.automation.utils.enums;

public enum MenuOptions {
  FLIGHTS("Flights"),
  ROUNDTRIP("Roundtrip"),
  ONEWAY("One-way"),
  MULTICITY("Multi-city");


  private final String value;

  MenuOptions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}

package org.hillel.homework.lesson27.driver;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WebDriverCash {

    private static final Map<String, WebDriver> drivers =new HashMap<>();

    private WebDriverCash() {
    }

    public static WebDriver getDriver(String browserName) {
        if (Objects.nonNull(drivers.get(browserName))) {
            return drivers.get(browserName);
        } else {
            drivers.put(browserName, WebDriverFactory.getDriver(browserName));
            return drivers.get(browserName);
        }
    }
}

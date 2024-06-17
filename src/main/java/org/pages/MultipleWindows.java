package org.automationtest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MultipleWindows {

    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    public MultipleWindows(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere() {
        driver.findElement(clickHereLink).click();
    }
}

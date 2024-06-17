package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeypressPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeypressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p")+"=3.14");
    }
}

package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerResults = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTriggerAlertButton() {
        driver.findElement(triggerAlertButton).click();
    }

    public void alertPopUpClick(){
        driver.switchTo().alert().accept();
    }

    public String getTriggerResults() {
        return driver.findElement(triggerResults).getText();
    }
}

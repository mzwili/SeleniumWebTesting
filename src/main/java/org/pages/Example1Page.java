package org.automationtest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page {

    private WebDriver driver;
    private By startBtn = By.id("startBtn").xpath(".//button[text()='Start']");
    private By loadingIndicator = By.id("loading");
    private By loadText = By.id("finish");
    public Example1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn() {
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadingText() {
        return driver.findElement(loadText).getText();
    }

}

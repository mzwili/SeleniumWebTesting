package org.automationtest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class WYSIWYGPage {

    private WebDriver driver;
    private String frameId = "mce_0_ifr";
    private By textAreaId = By.id("tinymce");
    private By indentBtn = By.xpath(".//button[contains(@title,'Increase indent')]");

    public WYSIWYGPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearEditArea(){
        switchToFrame();
        driver.findElement(textAreaId).clear();
        switchToMainArea();
    }

    public void setEditArea(String text){
        switchToFrame();
        driver.findElement(textAreaId).sendKeys(text);
        switchToMainArea();
    }

    private void switchToFrame(){
        driver.switchTo().frame(frameId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public String getTextFromEditor(){
        switchToFrame();
        String text = driver.findElement(textAreaId).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndent(){
        driver.findElement(indentBtn).click();
    }
}

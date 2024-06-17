package org.automationtest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1Link = By.xpath(".//a[contains(text(),'hidden')]");
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page example1LinkClick(){
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }

}

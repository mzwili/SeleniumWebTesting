package org.automationtest.utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goToUrl(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabName){
        var windows = driver.getWindowHandles();

        System.out.println("Number of windows: " + windows.size());
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);
            System.out.println("Current window title: " + driver.getTitle());

            if(tabName.equals(driver.getTitle())){
                break;
            }
        }
    }
}

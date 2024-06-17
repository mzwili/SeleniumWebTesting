package org.automationtest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class FileUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uplaodResult = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    /**
     *
     * @param fileAbsolutePath
     */
    public void uploadFile(String fileAbsolutePath) {
        driver.findElement(inputField).sendKeys(fileAbsolutePath);
        clickUploadButton();
    }

    public String getUploadResult() {
        return driver.findElement(uplaodResult).getText();
    }
}

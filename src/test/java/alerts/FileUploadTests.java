package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void fileUploadTest() {
        var uploadFilePage = homePage.clickFileUpload();
        uploadFilePage.uploadFile("/home/wtc/Documents/Selenium_Tutorial/project_test/webdriver_java/src/main/resources/chromedriver");
        assertTrue(uploadFilePage.getUploadResult().equals("chromedriver"));
    }
}

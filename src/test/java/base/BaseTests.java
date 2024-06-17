package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mthiy\\Documents\\TestingCourse\\SelenuimWebTesting\\SeleniumTesting\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        goToHomePage();
    }

    @BeforeMethod
    public void goToHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult testResult){
        if(ITestResult.FAILURE == testResult.getStatus()){
            var camera = (TakesScreenshot)driver;
            String absolutePath = "src/main/resources/screenshots/" + testResult.getName() + "." + "png";
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File(absolutePath));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public org.automationtest.utils.WindowManager getWindowManager(){
        return new org.automationtest.utils.WindowManager(driver);
    }
}

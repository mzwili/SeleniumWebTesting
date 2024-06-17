package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading();
        var example1Page = loadingPage.example1LinkClick();
        example1Page.clickStartBtn();
        assertEquals(example1Page.getLoadingText(),"Hello World!");

    }
}

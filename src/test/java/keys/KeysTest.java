package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTest extends BaseTests {

    @Test
    public void backSpaceTest(){
        var keyPage = homePage.clickKeypress();
        keyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPage.getResultText(),"You entered: BACK_SPACE");
    }

    @Test
    public void piTest(){
        var keyPage = homePage.clickKeypress();
        keyPage.enterPi();
    }
}

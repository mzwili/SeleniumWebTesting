package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTests {

    @Test
    public void iframesTest() {
        var framePage = homePage.clickWysiwtg();
        framePage.clearEditArea();
        String text1 = "hello";
        String text2 = "world";
        framePage.setEditArea(text1);
        framePage.decreaseIndent();
        framePage.setEditArea(text2);

        assertEquals(framePage.getTextFromEditor(),text1+text2,"Text from editor incorrect");
    }
}

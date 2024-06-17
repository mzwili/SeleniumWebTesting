package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not Displayed");
        assertEquals(caption.getTitle(), "name: user1","Incorrect title");
        assertEquals(caption.getLinkText(),"View profile","Incorrect link text");
        assertTrue(caption.getLink().endsWith("/users/1"),"Incorrect link");

    }
}

package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTests {

    @Test
    public void alertAcceptTest() {
        var alertPage = homePage.clickAlerts();
        alertPage.clickTriggerAlertButton();
        alertPage.alertPopUpClick();
        assertEquals(alertPage.getTriggerResults(),"You successfully clicked an alert");

    }
}

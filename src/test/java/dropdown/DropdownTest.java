package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectionOption(){
        var dropDownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOption = dropDownPage.getSelectedOptions();
        assertEquals(selectedOption.size(), 1,"Incorrect number of selected options");
        assertTrue(selectedOption.contains(option),"Option not selected");

    }
}

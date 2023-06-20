package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EtsyPage;
import utils.Driver;

import java.util.List;

public class EtsySteps {
    WebDriver driver;
    EtsyPage etsyPage;

    @Before
    public void setDriver(){
        driver = Driver.getDriver();
        etsyPage = new EtsyPage();
    }


    @Then("user should see below menu item links")
    public void userShouldSeeBelowMenuItemLinks(DataTable dataTable) {
        List<String> expectedText = dataTable.asList();

        for (int i = 0; i < expectedText.size(); i++) {
            Assert.assertEquals(etsyPage.menuItems.get(i).getText(), expectedText.get(i));
        }
    }
}

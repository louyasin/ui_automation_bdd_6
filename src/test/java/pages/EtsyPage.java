package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class EtsyPage {
    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( css = "li[class*='wt-pr-xl-6']")
    public List<WebElement> menuItems;

}

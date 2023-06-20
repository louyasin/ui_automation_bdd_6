package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Project04Page {

public Project04Page(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy( tagName = "h1")
    public WebElement inventoryHeading;

@FindBy(id = "product_table")
    public WebElement productTable;

@FindBy( css = "tr > th")
    public List<WebElement> tablesHeaders;

@FindBy( xpath= "tbody > tr")
    public List<WebElement> tableRows;

@FindBy( id = "add_product_btn")
    public WebElement addProductButton;

@FindBy( id = "total_amount")
    public WebElement finalTotal;

@FindBy( id = "name_form")
    public WebElement addNewProductForm;

@FindBy( id = "modal_title")
    public WebElement addNewProductModalHeading;

@FindBy( css = "button[class='delete']")
    public WebElement xButton;

@FindBy(css = "label[for='product_quantity']")
    public WebElement quantityLabel;

@FindBy( id = "quantity")
    public WebElement quantityInputBox;

@FindBy(css = "label[for='product_name']")
    public WebElement productNameLabel;

@FindBy(id = "product")
    public WebElement productNameInputBox;

@FindBy(css = "label[for='product_price']")
    public WebElement priceLabel;

@FindBy(id = "price")
    public WebElement priceInputBox;

@FindBy(id = "submit")
    public WebElement submitButton;



}

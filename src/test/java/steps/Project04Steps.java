package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Project04Page;
import pages.TechGlobalDynamicTablesPage;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalLoginFormPage;
import utils.Driver;
import utils.TableHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project04Steps {

    WebDriver driver;
    Project04Page project04Page;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
       project04Page = new Project04Page();
    }

    @Then("the user should see the “Inventory” heading")
    public void theUserShouldSeeTheInventoryHeading() {
        Assert.assertEquals(project04Page.inventoryHeading.getText(), "Inventory");
    }

    @And("the user should see the table with the headers below")
    public void theUserShouldSeeTheTableWithTheHeadersBelow(DataTable dataTable) {
        List<String> expectedText = dataTable.asList() ;


        for (int i = 0; i < expectedText.size(); i++) {
            Assert.assertEquals(project04Page.tablesHeaders.get(i).getText(), expectedText.get(i));
        }

    }




    @And("the user should see the “ADD PRODUCT” button is enabled")
    public void theUserShouldSeeTheADDPRODUCTButtonIsEnabled() {
        Assert.assertTrue(project04Page.addProductButton.isEnabled());
    }

    @And("the user should see the Total text displayed")
    public void theUserShouldSeeTheTotal$TextDisplayed( ) {
        Assert.assertTrue(project04Page.finalTotal.isDisplayed());
    }

    @And("the user should see the table with the rows below")
    public void theUserShouldSeeTheTableWithTheRows(DataTable dataTable) {
        List<List<WebElement>> tableInfo = TableHandler.getTableData(project04Page.productTable);
        List<List<String>> webElementList = dataTable.asLists();


        for (int i = 0; i < tableInfo.size(); i++) {
            for (int j = 0; j < tableInfo.get(i).size(); j++) {
                Assert.assertEquals(tableInfo.get(i).get(j).getText(), webElementList.get(i).get(j));
                System.out.println(tableInfo.get(i).get(j).getText());
            }


        }
    }


    @When("the user clicks on the “ADD PRODUCT” button")
    public void theUserClicksOnTheADDPRODUCTButton() {

        Assert.assertTrue(project04Page.addProductButton.isEnabled());
        project04Page.addProductButton.click();

    }

    @Then("the user should see the “Add New Product” modal with its heading")
    public void theUserShouldSeeTheAddNewProductModalWithItsHeading() {

        Assert.assertTrue(project04Page.addNewProductForm.isDisplayed());
        Assert.assertEquals(project04Page.addNewProductModalHeading.getText(), "Add New Product");
    }

    @And("the user should see the “X” button is enabled")
    public void theUserShouldSeeTheXButtonIsEnabled() {
        Assert.assertTrue(project04Page.xButton.isEnabled());
    }

    @And("the user should see the “Please select the quantity” label")
    public void theUserShouldSeeThePleaseSelectTheQuantityLabel() {
        Assert.assertEquals(project04Page.quantityLabel.getText(), "Please select the quantity");
    }

    @And("the user should see the “Quantity” input box is enabled")
    public void theUserShouldSeeTheQuantityInputBoxIsEnabled() {
        Assert.assertTrue(project04Page.quantityInputBox.isEnabled());
    }

    @And("the user should see the “Please enter the name of the product” label")
    public void theUserShouldSeeThePleaseEnterTheNameOfTheProductLabel() {
        Assert.assertEquals(project04Page.productNameLabel.getText(), "Please enter the name of the product");
    }

    @And("the user should see the “Product” input box is enabled")
    public void theUserShouldSeeTheProductInputBoxIsEnabled() {
        Assert.assertTrue(project04Page.productNameInputBox.isEnabled());
    }

    @And("the user should see the “Please enter the price of the product” label")
    public void theUserShouldSeeThePleaseEnterThePriceOfTheProductLabel() {
        Assert.assertEquals(project04Page.priceLabel.getText(), "Please enter the price of the product");
    }

    @And("the user should see the “Price” input box is enabled")
    public void theUserShouldSeeThePriceInputBoxIsEnabled() {
        Assert.assertTrue(project04Page.priceInputBox.isEnabled());
    }

    @And("the user should see the “SUBMIT” button is enabled")
    public void theUserShouldSeeTheSUBMITButtonIsEnabled() {
        Assert.assertTrue(project04Page.submitButton.isEnabled());
    }


    @When("the user clicks on the “X” button")
    public void theUserClicksOnTheXButton() {
        Assert.assertTrue(project04Page.xButton.isEnabled());
        project04Page.xButton.click();
    }

    @Then("the user should not see the “Add New Product” modal")
    public void theUserShouldNotSeeTheAddNewProductModal() {
        Assert.assertTrue(project04Page.productTable.isDisplayed());
    }

    @And("the user enters the quantity as 2")
    public void theUserEntersTheQuantityAs() {

        project04Page.quantityInputBox.sendKeys("2");

    }

    @And("the user enters the product as “Mouse”")
    public void theUserEntersTheProductAsMouse() {
        project04Page.productNameInputBox.sendKeys("Mouse");
    }

    @And("the user enters the price as 100")
    public void theUserEntersThePriceAs() {
        project04Page.priceInputBox.sendKeys("100");
    }

    @And("the user clicks on the “SUBMIT” button")
    public void theUserClicksOnTheSUBMITButton() {
        project04Page.submitButton.click();
    }

    @Then("the user should see the table with the new row below")
    public void theUserShouldSeeTheTableWithTheNewRowBelow(DataTable dataTable) {
        List<String> expectedText = dataTable.asList();

        for (String s : expectedText) {
            Assert.assertEquals(project04Page.productTable.getText(), s);
        }
    }



    @And("the user should see the Total = 2,500 text displayed")
    public void theUserShouldSeeTheTotalDisplayed() {
        Assert.assertEquals(project04Page.finalTotal.getText(), "Total = 2,500");
    }
}

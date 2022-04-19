package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import javax.security.auth.login.Configuration;
import java.util.List;

public class LoginStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);//singletin dsin patterin
        BrowserUtils.waitFor(1);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String passWord = ConfigurationReader.get("driver_password");
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(passWord);
        loginPage.submit.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user should able to login")
    public void the_user_should_able_to_login() {
        String expectedTitle = "Dashboard";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationReader.get("sales_manager_username");
        String passWord = ConfigurationReader.get("sales_manager_password");
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(passWord);
        loginPage.submit.click();
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationReader.get("store_manager_username");
        String passWord = ConfigurationReader.get("store_manager_password");
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(passWord);
        loginPage.submit.click();
    }


    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedNumber) {
        BrowserUtils.waitFor(2);
        ContactsPage contactsPage = new ContactsPage();
        BrowserUtils.waitFor(1);
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getText());
        Assert.assertEquals(expectedNumber, actualNumber);

    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }
}
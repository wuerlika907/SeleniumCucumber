package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginAsSalesmManagerNavigatToTopMenu {

    @When("the user navigate to Fleet,Vehicles")
    public void the_user_navigate_to_Fleet_Vehicles() {
        System.out.println("the user navigate to Fleet,Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("the title should be Vehicles");
    }


    @When("the user navigate to Marketing,Campaigns")
    public void the_user_navigate_to_Marketing_Campaigns() {
        System.out.println("the user navigate to Marketing,Campaigns");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        System.out.println("title should be Campaigns");
        ;
    }

    @Then("the user navigates to Activities,Calender Events")
    public void the_user_navigates_to_Activities_Calender_Events() {
        System.out.println("the user navigates to Activities,Calender Events");
    }

    @Then("title should be Calender")
    public void title_should_be_Calender() {
        System.out.println("title should be Calender");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);
    }




}

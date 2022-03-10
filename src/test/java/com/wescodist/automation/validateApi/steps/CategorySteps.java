package com.wescodist.automation.validateApi.steps;

import com.wescodist.automation.validateApi.helpers.LoginAPI;
import com.wescodist.automation.validateApi.helpers.categoryAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategorySteps {

        @Steps
        categoryAPI category;


        @Given("^I send a request to the URL to get category Details\\.$")
        public void categoryAPI(){
            category.validateAPI();
            System.out.println( "test started");
        }

    @Then("Verify data for category")
    public void verifyDataForCategory() {
        category.verifyCategoryData();

    }


}

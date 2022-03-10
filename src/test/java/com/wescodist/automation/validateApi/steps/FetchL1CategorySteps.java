package com.wescodist.automation.validateApi.steps;

import com.wescodist.automation.validateApi.helpers.FetchL1CategoryAPI;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class FetchL1CategorySteps {


    @Steps
    FetchL1CategoryAPI fetchl1categoryapi;


    @Then("verify data fetch for the L1Category")
    public void verifyDataFetchForTheLCategory() {
        fetchl1categoryapi.verifyL1CategoryData();

    }


    @When("{} used to fetch the  API")
    public void lCategoryUsedToFetchTheAPI(String l1Category) {
        System.out.println("Test completed");
        fetchl1categoryapi.getL1CategoryRecords(l1Category);
    }
}

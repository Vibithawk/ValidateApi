package com.wescodist.automation.validateApi.steps;

import com.wescodist.automation.validateApi.helpers.LoginAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import utilities.RecommmEngine;

public class loginsteps {

    @Steps
    LoginAPI loginapi;


    @Given("login API")
    public void loginAPI() {

        System.out.println("Testing started");
    }

    @When("{} and {} is inputted for login API")
    public void InvokeLoginAPI(String username, String password) {

        loginapi.postloginAPI(username, password);
    }

    @Then("Verify auth token is generated")
    public void verifyAuthTokenIsGenerated() {
        loginapi.verifyauthToken();
        System.out.println("Testing completed");
    }

    @Given("{} and {} to access API")
    public void usernameAndPasswordtoAccessAPI(String userName,String password) {
       String  authToken=loginapi.getAuthToken(userName,password);
        RecommmEngine.map.put("authToken",authToken);

    }
}

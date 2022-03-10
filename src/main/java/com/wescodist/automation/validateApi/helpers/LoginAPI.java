package com.wescodist.automation.validateApi.helpers;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginAPI {

    String url="https://cm-validation-api.galuctussandbox.app/login";

    public void postloginAPI(String userName, String password) {
        SerenityRest.given().header("Content-Type","application/x-www-form-urlencoded")
                .formParam("username",userName)
                .formParam("password",password)
                .post(url);

        //string name = "userName";
    }

    public void verifyauthToken() {
        assertThat(SerenityRest.lastResponse().getStatusCode()).as("verify status code").isEqualTo(201);
        String BearerToken=SerenityRest.lastResponse().getBody().asString();
        System.out.println("BearerToken"+BearerToken);
        System.out.println("token"+SerenityRest.lastResponse().getBody().jsonPath().get("token").toString());
    }

    public String getAuthToken(String userName, String password) {
        postloginAPI(userName,password);
        return SerenityRest.lastResponse().getBody().jsonPath().get("token").toString();
    }
}

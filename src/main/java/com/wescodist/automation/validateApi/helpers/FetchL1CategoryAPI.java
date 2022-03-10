package com.wescodist.automation.validateApi.helpers;

import net.serenitybdd.rest.SerenityRest;
import utilities.RecommmEngine;

import static org.assertj.core.api.Assertions.assertThat;

public class FetchL1CategoryAPI {

    String url="https://cm-validation-api.galuctussandbox.app/fetch-data";

    public void getL1CategoryRecords(String l1Category) {
        System.out.println("testStarted");
        SerenityRest.given().header("X-API-KEY", RecommmEngine.map.get("authToken"))
                .queryParam("l1-category",l1Category).get(url);
        //https://cm-validation-api.galuctussandbox.app/fetch-data?l1-category=heating_cooling_and_plumbing
    }

    public void verifyL1CategoryData() {
        assertThat(SerenityRest.lastResponse().getStatusCode()).as("verify status code").isEqualTo(200);
        String responseData=SerenityRest.lastResponse().getBody().asString();
        System.out.println("responsedata"+responseData);
        System.out.println("i st catcode"+SerenityRest.lastResponse().getBody().jsonPath().get("'data'.'catcode'[0]"));

    }
}

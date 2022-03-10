package com.wescodist.automation.validateApi.helpers;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.given;
import static org.assertj.core.api.Assertions.assertThat;

public class categoryAPI {

   String url="https://cm-validation-api.galuctussandbox.app/isr_validation/fetch/categories";


   public void validateAPI() {

       SerenityRest.given().header("X-API-KEY","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InVzZXJfY20xQHdlc2NvZGlzdC5jb20iLCJleHAiOjE2NDY3MzIzMjZ9.G6E3rQplGquMIVb1Sm1wepRHkp-dsoW04tizN9kAjUI")
               .get(url);

   }
    public void verifyCategoryData() {
        assertThat(SerenityRest.lastResponse().getStatusCode()).as("verify status code").isEqualTo(200);
        String BearerToken=SerenityRest.lastResponse().getBody().asString();
        System.out.println("BearerToken"+BearerToken);
    }


}

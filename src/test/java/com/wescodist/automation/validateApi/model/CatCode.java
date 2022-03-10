package com.wescodist.automation.validateApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CatCode {

    @JsonProperty(value = "L1 Category")
    private String L1Category;

    @JsonProperty(value = "L2 Category")
    private String L2Category;

    @JsonProperty(value = "L3 Category")
    private String L3Category;

    @JsonProperty(value = "L4 Category")
    private String L4Category;

    @JsonProperty(value = "bottom_level_category")
    private String bottomLevelCategory;

    @JsonProperty(value = "catcode")
    private String catCode;


}

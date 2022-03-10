package com.wescodist.automation.validateApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CatCodeList {

    @JsonProperty(value = "data")
    private List<CatCode> catcodelist;

}

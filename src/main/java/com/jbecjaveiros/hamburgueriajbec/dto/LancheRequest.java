package com.jbecjaveiros.hamburgueriajbec.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LancheRequest {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("valor")
    private Double value;

    @JsonProperty("quantidade")
    private Integer amount;
}

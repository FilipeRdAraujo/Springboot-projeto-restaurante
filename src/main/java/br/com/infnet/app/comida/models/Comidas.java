package br.com.infnet.app.comida.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meals"
})

public class Comidas {
    @JsonProperty("meals")
    private List<Comida> comidas = null;

}

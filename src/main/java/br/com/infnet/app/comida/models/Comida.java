package br.com.infnet.app.comida.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strMeal",
    "strMealThumb",
    "idMeal"
})
public class Comida {

    @JsonProperty("strMeal")
    private String strMeal;
    @JsonProperty("strMealThumb")
    private String strMealThumb;
    @JsonProperty("idMeal")
    private String idMeal;

    @JsonProperty("strMeal")
    public String getStrMeal() {
        return strMeal;
    }

    @JsonProperty("strMeal")
    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    @JsonProperty("strMealThumb")
    public String getStrMealThumb() {
        return strMealThumb;
    }

    @JsonProperty("strMealThumb")
    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    @JsonProperty("idMeal")
    public String getIdMeal() {
        return idMeal;
    }

    @JsonProperty("idMeal")
    public void setIdMeal(String idMeal) {
        this.idMeal = idMeal;
    }
}

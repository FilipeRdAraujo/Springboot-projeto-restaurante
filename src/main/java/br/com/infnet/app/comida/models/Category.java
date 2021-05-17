
package br.com.infnet.app.comida.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idCategory",
    "strCategory",
    "strCategoryThumb",
    "strCategoryDescription"
})

public class Category { //Categoria

    @JsonProperty("idCategory")
    private String idCategory;
    @JsonProperty("strCategory")
    private String strCategory;
    @JsonProperty("strCategoryThumb")
    private String strCategoryThumb;
    @JsonProperty("strCategoryDescription")
    private String strCategoryDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idCategory")
    public String getIdCategory() {
        return idCategory;
    }

    @JsonProperty("idCategory")
    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    @JsonProperty("strCategory")
    public String getStrCategory() {
        return strCategory;
    }

    @JsonProperty("strCategory")
    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    @JsonProperty("strCategoryThumb")
    public String getStrCategoryThumb() {
        return strCategoryThumb;
    }

    @JsonProperty("strCategoryThumb")
    public void setStrCategoryThumb(String strCategoryThumb) {
        this.strCategoryThumb = strCategoryThumb;
    }

    @JsonProperty("strCategoryDescription")
    public String getStrCategoryDescription() {
        return strCategoryDescription;
    }

    @JsonProperty("strCategoryDescription")
    public void setStrCategoryDescription(String strCategoryDescription) {
        this.strCategoryDescription = strCategoryDescription;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

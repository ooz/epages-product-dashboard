package com.epages.productdashboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryResponse {

    @JsonProperty("_embedded")
    private EmbeddedCategories categories;

    public List<Category> getCategories() {
        return categories.getCategories();
    }
}

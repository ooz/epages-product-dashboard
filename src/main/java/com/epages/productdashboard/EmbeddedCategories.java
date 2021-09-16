package com.epages.productdashboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class EmbeddedCategories {

    @JsonProperty("categories")
    private List<Category> categories;

}

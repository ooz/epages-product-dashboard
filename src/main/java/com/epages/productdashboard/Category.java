package com.epages.productdashboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@Builder
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@EqualsAndHashCode(exclude = {"id"})
public class Category {

    @JsonProperty("_id")
    private UUID id;

    private String type;
    private String name;

}

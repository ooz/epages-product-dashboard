package com.epages.productdashboard;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CategoryService {

    @Value("${shop:pleaseEnterShopInProperties}")
    @Getter
    private String shop;

    private final RestTemplate restTemplate;

    public CategoryService(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    public List<Category> getCategories() {
        ResponseEntity<CategoryResponse> response = restTemplate.getForEntity(shop + "/api/product-view/categories", CategoryResponse.class);
        return response.getBody().getCategories();
    }
}

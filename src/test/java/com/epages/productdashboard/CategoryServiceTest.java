package com.epages.productdashboard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void should_yield_correct_shop() {
        then(categoryService.getShop()).isEqualTo("https://oz.beyondshop.cloud");
    }

    @Test
    public void should_get_categories() {
        then(categoryService.getCategories()).contains(
                Category.builder().type("SMART").name("All products").build()
        );
    }
}

package com.epages.productdashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductDashboardApplication implements CommandLineRunner {

	@Autowired
	private CategoryService categoryService;

	public static void main(String[] args) {
		SpringApplication.run(ProductDashboardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello " + categoryService.getShop() + "!");
		System.out.println("Number of categories: " + categoryService.getCategories().size());
	}

}

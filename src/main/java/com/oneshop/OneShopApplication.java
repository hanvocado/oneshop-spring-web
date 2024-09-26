package com.oneshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.oneshop.configs.CustomSiteMeshFilter;

@SpringBootApplication
public class OneShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneShopApplication.class, args);
	}

}

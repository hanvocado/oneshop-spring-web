package com.oneshop;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oneshop.configs.CustomSiteMeshFilter;

@Configuration
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OneShopApplication.class);
	}


    @Bean
    FilterRegistrationBean<CustomSiteMeshFilter> siteMeshFilter() {
        FilterRegistrationBean<CustomSiteMeshFilter> filter = new FilterRegistrationBean<CustomSiteMeshFilter>();
        filter.setFilter(new CustomSiteMeshFilter());
        filter.addUrlPatterns("/*");
        return filter;
    }
}

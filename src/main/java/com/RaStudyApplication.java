package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class RaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaStudyApplication.class, args);
	}

    @Bean
    public InternalResourceViewResolver setupViewResolver() {
 
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
 
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        return resolver;
    }

}

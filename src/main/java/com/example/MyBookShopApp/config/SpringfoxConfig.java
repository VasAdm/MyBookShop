package com.example.MyBookShopApp.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SpringfoxConfig {
    public static final String BOOK_TAG = "Book API";
    public static final String AUTHOR_TAG = "Author API";

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build()
                .tags(
                        new Tag(BOOK_TAG, "Api for book repo"),
                        new Tag(AUTHOR_TAG, "Api for author repo"))
                .apiInfo(apiInfo());
    }

    public ApiInfo apiInfo(){
        return new ApiInfo(
                "Bookshop API",
                "API for bookstore",
                "1.0",
                "http://www.termsofservice.org",
                new Contact("API owner", "http://www.ownersite.com","owner@rmailer.org"),
                "api_license",
                "http://www.license.edu.org",
                new ArrayList<>()
        );
    }
}

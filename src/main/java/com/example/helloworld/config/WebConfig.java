package com.example.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.example.helloworld")
@EnableWebMvc
public class WebConfig {
    public static final String PREFIX = "/WEB-INF/pages/";
    public static final String SUFFIX = ".html";

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(PREFIX);
        viewResolver.setSuffix(SUFFIX);

        return viewResolver;
    }
}

package com.example.config;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
public class Log4jConfig {

    @Bean
    public Logger getLogger() {
        return Logger.getLogger(getClass());
    }

    @Bean
    public void initLog4j() {
        ClassPathResource resource = new ClassPathResource("log4j.properties");
        try {
            PropertyConfigurator.configure(resource.getURL());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
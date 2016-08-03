package com.eteration.qanda.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.eteration.qanda.services")
@EntityScan(basePackages = "com.eteration.qanda.models")
@SpringBootApplication
public class WebRunner {
    public static void main(String[] args) {
        SpringApplication.run(WebRunner.class, args);
    }
}

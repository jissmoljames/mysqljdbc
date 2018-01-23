package com.example.applicationnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.controller.Laptopcontroller1;
import com.example.controller.Laptopservice1;


@ComponentScan(basePackageClasses = Laptopcontroller1.class)
@ComponentScan(basePackageClasses = Laptopservice1.class)
@EnableJpaRepositories("com.example.controller.LaptopRepository")

@SpringBootApplication

public class SpringdatajpaApplication  {
	 

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}
}

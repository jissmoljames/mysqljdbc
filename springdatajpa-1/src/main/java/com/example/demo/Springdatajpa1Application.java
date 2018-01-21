package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.springbootstarter.topic.Laptopcontroller1;

@ComponentScan(basePackageClasses = Laptopcontroller1.class)
@SpringBootApplication
public class Springdatajpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdatajpa1Application.class, args);
	}
}

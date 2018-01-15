package io.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.sample.Laptopcontroller1;



@SpringBootApplication
@ComponentScan(basePackageClasses = Laptopcontroller1.class)
public class Laptop1Application {

	public static void main(String[] args) {
		SpringApplication.run(Laptop1Application.class, args);
	}
}

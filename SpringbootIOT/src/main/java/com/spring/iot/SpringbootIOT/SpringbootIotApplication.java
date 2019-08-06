package com.spring.iot.SpringbootIOT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.spring")
@SpringBootApplication
public class SpringbootIotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIotApplication.class, args);
		System.out.println("Hi IOT");
	}

}

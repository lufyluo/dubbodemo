package com.springboot.consumer.demo;

import com.springboot.consumer.demo.service.consumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		consumerService cityService = run.getBean(consumerService.class);
	}
}

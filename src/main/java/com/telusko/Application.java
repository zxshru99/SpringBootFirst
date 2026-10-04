package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.controller.Laptop;
import com.telusko.service.LaptopService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		LaptopService service=context.getBean(LaptopService.class);
		Laptop laptop=context.getBean(Laptop.class);
		service.add(laptop);
	}

}

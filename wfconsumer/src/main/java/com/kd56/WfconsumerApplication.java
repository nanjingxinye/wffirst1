package com.kd56;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
@ImportResource("classpath:spring-comsumer.xml")

public class WfconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfconsumerApplication.class, args);
	}

}

package com.kd56;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.kd56.dao")
@ImportResource("classpath:spring-provider.xml")
public class WfproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfproviderApplication.class, args);
	}

}

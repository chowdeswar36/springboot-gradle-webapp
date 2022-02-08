package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.util.Constants;

@SpringBootApplication
public class SpringBootGradleWebappApplication extends Constants {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleWebappApplication.class, args);
		springMain_logger.info("Spring boot application started");
	}

}

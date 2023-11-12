package com.pggm.authlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pggm.authlib")
public class AuthlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthlibApplication.class, args);
	}

}

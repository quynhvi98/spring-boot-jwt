package com.example.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class JwtApplication implements WebMvcConfigurer {
	private final long MAX_AGE_SECS = 3600;

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

}

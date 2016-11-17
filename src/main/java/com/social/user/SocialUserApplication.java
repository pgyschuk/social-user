package com.social.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SocialUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialUserApplication.class, args);
	}
}

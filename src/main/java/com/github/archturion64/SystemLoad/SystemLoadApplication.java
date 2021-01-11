package com.github.archturion64.SystemLoad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SystemLoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemLoadApplication.class, args);
	}

}

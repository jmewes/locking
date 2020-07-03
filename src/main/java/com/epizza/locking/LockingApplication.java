package com.epizza.locking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.epizza")
@EntityScan("com.epizza")
@EnableJpaRepositories("com.epizza")
public class LockingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockingApplication.class, args);
	}

}

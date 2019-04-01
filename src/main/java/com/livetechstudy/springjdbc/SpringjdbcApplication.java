package com.livetechstudy.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjdbcApplication {

	// H2 Console URL http://localhost:8080/h2-console
	//JDBC URL jdbc:h2:mem:testdb
	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
	}

}

package com.han;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.han.mapper")
public class PlusYouApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlusYouApplication.class, args);
	}

}

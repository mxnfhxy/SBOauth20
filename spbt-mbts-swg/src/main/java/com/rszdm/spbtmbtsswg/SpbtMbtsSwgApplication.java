package com.rszdm.spbtmbtsswg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(value = "com.rszdm.spbtmbtsswg.dao")
@SpringBootApplication
@ComponentScan(basePackages = {"com.rszdm.spbtmbtsswg.*"})
public class SpbtMbtsSwgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbtMbtsSwgApplication.class, args);
	}

}

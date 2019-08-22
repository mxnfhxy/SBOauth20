package com.rszdm.spbtmbtsswg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.rszdm.spbtmbtsswg.dao")
@SpringBootApplication
public class SpbtMbtsSwgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbtMbtsSwgApplication.class, args);
	}

}

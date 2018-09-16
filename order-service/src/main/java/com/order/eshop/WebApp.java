package com.order.eshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.order.eshop.biz.mapper")
public class WebApp {
	public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}

package com.tianji.testspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tianji.testspringboot.DAO")
public class TestSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootApplication.class, args);
    }

}

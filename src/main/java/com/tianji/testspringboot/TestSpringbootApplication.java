package com.tianji.testspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.tianji.testspringboot.mapper")
public class TestSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootApplication.class, args);
    }

}

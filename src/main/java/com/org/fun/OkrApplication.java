package com.org.fun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.org.fun.mapper")
public class OkrApplication {

    public static void main(String[] args) {
        SpringApplication.run(OkrApplication.class, args);
    }

}

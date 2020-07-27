package com.ztx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ztx.dao")
public class Files01Application {

    public static void main(String[] args) {
        SpringApplication.run(Files01Application.class, args);
    }

}

package com.leo.clickhousedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leo.clickhousedemo.mapper")
public class ClickhouseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickhouseDemoApplication.class, args);
    }

}

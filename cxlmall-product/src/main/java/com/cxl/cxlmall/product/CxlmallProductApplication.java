package com.cxl.cxlmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.cxl.cxlmall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CxlmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxlmallProductApplication.class, args);
    }

}

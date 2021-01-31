package com.cxl.cxlmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CxlmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxlmallWareApplication.class, args);
    }

}

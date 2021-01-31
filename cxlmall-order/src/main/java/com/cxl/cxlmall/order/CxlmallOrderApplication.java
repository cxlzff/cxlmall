package com.cxl.cxlmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CxlmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxlmallOrderApplication.class, args);
    }

}

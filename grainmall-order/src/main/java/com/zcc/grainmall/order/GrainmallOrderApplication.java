package com.zcc.grainmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrainmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallOrderApplication.class, args);
    }

}

package com.zcc.grainmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.开启服务注册发现
 *  配置注册中心地址
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // 排除跟数据源有关的配置
public class GrainmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallGatewayApplication.class, args);
    }

}

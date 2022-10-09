package com.zcc.grainmall.member;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
// 开启远程调用
@EnableFeignClients(basePackages = "com.zcc.grainmall.member.fegin")
// 服务注册
@EnableDiscoveryClient
@SpringBootApplication
public class GrainmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallMemberApplication.class, args);
    }

}

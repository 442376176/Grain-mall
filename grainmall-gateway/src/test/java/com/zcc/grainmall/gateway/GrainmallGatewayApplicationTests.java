package com.zcc.grainmall.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootTest
@RefreshScope
class GrainmallGatewayApplicationTests {


    @Value("${name}")
    private String name;
    @Test
    void contextLoads() {
        System.out.println(name);
    }

}

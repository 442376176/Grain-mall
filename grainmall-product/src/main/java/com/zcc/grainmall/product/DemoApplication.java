package com.zcc.grainmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合mybatis-plus
 * 2. 配置
 *  1. 配置数据源
 *  2. 配置mybatis-plus
 *      1.使用@Mapperscan sql映射文件位置
 *
 */
@MapperScan("com.zcc.grainmall.product.dao")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

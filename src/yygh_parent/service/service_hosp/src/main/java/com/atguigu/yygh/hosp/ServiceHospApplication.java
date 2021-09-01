package com.atguigu.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 启动类
 * @Author: Hypocrite30
 * @Date: 2021/8/30 22:06
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu") //统一扫描路径
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}

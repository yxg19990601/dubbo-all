package com.xucm.dubbo.order;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@DubboComponentScan("com.xucm.dubbo.order")
@SpringBootApplication
@EnableHystrix // 开启服务容错
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {

        System.out.println("BootUserServiceProviderApplication.main");
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }
}

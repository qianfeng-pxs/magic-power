package com.qianfeng.magic.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MagicCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagicCoreApplication.class, args);
    }
}

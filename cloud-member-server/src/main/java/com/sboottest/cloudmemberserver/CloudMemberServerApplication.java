package com.sboottest.cloudmemberserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudMemberServerApplication {

    //注册服务
    public static void main(String[] args) {
        SpringApplication.run(CloudMemberServerApplication.class, args);
    }

}

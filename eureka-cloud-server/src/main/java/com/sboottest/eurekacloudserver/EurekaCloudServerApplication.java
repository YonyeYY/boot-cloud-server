package com.sboottest.eurekacloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCloudServerApplication {

    //注册中心
    public static void main(String[] args) {
        SpringApplication.run(EurekaCloudServerApplication.class, args);
    }

}

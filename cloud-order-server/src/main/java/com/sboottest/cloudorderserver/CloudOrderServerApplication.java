package com.sboottest.cloudorderserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class CloudOrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudOrderServerApplication.class, args);
    }


    //开启ribbon
    @Bean //将restTemplate注入到bean容器
    @LoadBalanced //表示支持负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}

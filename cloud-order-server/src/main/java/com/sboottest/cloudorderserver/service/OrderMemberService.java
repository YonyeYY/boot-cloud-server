package com.sboottest.cloudorderserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:Yonye
 * @escription:
 * @Date :2019/4/13
 * @Time:15:23
 **/
@Service
public class OrderMemberService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getOrderUserAll(){

        return restTemplate.getForObject("http://service-member/getMemberAll",List.class);


    }

}

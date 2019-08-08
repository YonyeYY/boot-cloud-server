package com.sboottest.cloudorderfeign.controller;

import com.sboottest.cloudorderfeign.server.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:Yonye
 * @escription:
 * @Date :2019/4/14
 * @Time:12:53
 **/
@RestController
public class OrderFeginController {
    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/getToOrderMemberAll")
    public List<String> getToOrderMemberAll() {
        System.out.println("order fegin 工程调用member工程");
        return memberFeign.getToOrderMemberAll();
    }

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        return "getOrderInfo";
    }

}

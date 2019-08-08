package com.sboottest.cloudmemberserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yonye
 * @escription:
 * @Date :2019/4/13
 * @Time:15:06
 **/
@RestController
public class MemberController {

    @Value("${server.port}")
    private String serverPort;
    private static int count=0;

    @RequestMapping("/getMemberAll")
    public List<String> getMemberAll(){
        try{
            Thread.sleep(4000);
        }catch(Exception e){

        }
        count++;
        System.out.println(count);
        List<String> listUser=new ArrayList<>();
        listUser.add("Jun");
        listUser.add("Winni");
        listUser.add("Yonye");
        listUser.add("serverPort"+serverPort);
        return listUser;
    }


    @RequestMapping("/getMemberServiceApi")
    public String getMemberServiceApi(){
        return "this is Member 服务工程";
    }

}

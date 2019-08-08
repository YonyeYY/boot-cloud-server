package com.sboottest.cloudorderfeign.server;

import com.sboottest.cloudorderfeign.fallback.MemberFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:Yonye
 * @escription:
 * @Date :2019/4/14
 * @Time:12:52
 **/
@FeignClient(value = "service-member",fallback=MemberFallBack.class)
public interface MemberFeign {

    @RequestMapping("/getMemberAll")
    public List<String> getToOrderMemberAll();

}
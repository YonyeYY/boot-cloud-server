package com.sboottest.cloudorderfeign.fallback;

import com.sboottest.cloudorderfeign.server.MemberFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yonye
 * @escription:
 * @Date :2019/4/14
 * @Time:12:53
 **/
@Component
public class MemberFallBack implements MemberFeign {

    public List<String> getToOrderMemberAll() {
        //服务降级处理
        List<String> list = new ArrayList<String>();
        list.add("服务发生异常...");
        return list;
    }

}

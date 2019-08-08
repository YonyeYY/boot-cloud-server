package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;


public class DemoApplicationTests {
    public static final List list=new LinkedList();
    @Test
    public void contextLoads() {

        System.out.println(list.size());
        list.add("ss");
        System.out.println(list.size());
    }

}

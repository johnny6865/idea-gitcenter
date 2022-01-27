package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;

public class SpringApplicationTest {
    public static void main(String[] args) {
        //创建IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Date now = context.getBean(Date.class);
        System.out.println("Now is :"+now);
    }
}

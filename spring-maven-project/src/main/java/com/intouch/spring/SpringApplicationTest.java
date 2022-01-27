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
        System.out.println("bbbb" );//添加bbbb,第2次提交
        System.out.println("dev1修改bug1" );
        System.out.println("dev1修改bug2" );
        System.out.println("cccc" );//添加cccc,第3次提交
        //修改日期输出格式,第4次提交
        DateFormat dateFormat = context.getBean(DateFormat.class);
        System.out.println("Now is : "+dateFormat.format(now) );
    }
}

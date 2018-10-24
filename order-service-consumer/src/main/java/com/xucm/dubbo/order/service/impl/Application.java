package com.xucm.dubbo.order.service.impl;

import com.xucm.dubbo.api.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author YXG
 * @Date 2018-10-24 20:51
 */
public class Application {
    public static void main(String[] args) throws  Exception{

        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        app.getBean(OrderServiceImpl.class).getOrderByUserId(1);
        System.in.read();
    }
}

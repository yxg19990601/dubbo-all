package com.xucm.dubbo.order.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xucm.dubbo.api.entity.OrderEntity;
import com.xucm.dubbo.api.entity.UserEntity;
import com.xucm.dubbo.api.service.OrderService;
import com.xucm.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author YXG
 * @Date 2018-10-24 20:29
 */
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * 启动不检查
     *
     * @stub  执行远程过程调用之前调用stub 本地存根方法
     *
     * 可以通过url 直接连provider  ， eg： url = "192.168.83.1:28800"
     *
     * localbalance 设置负载均衡策略 ，
     *
     *
     *
     *
     */

    @Reference(check = false, stub = "com.xucm.dubbo.order.impl.UserServiceStub" ,loadbalance = "roundrobin" )
    UserService userService ;

    @Override

    public OrderEntity getOrderByUserId(Integer userId) {


        UserEntity userEntity  = userService.getUserById();
        System.out.println("userEntity = " + userEntity);
        return null;
    }

    /**
     *
     *
     * 当方法出现超时或者报错， 进入容错机制
     *
     * fallbackMethod ,要进入的方法，
     * @return
     */
    @HystrixCommand(fallbackMethod = "handleErorr")
    @Override
    public UserEntity getUserEntity() {
        return userService.getUserById();
    }



    public UserEntity handleErorr() {

        UserEntity userEntity = new UserEntity();

        userEntity.setUserName("hystrix 容错");
        return userEntity;
    }
}

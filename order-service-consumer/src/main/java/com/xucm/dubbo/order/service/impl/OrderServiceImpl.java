package com.xucm.dubbo.order.service.impl;

import com.xucm.dubbo.api.entity.OrderEntity;
import com.xucm.dubbo.api.entity.UserEntity;
import com.xucm.dubbo.api.service.OrderService;
import com.xucm.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author YXG
 * @Date 2018-10-24 20:29
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    UserService userService ;

    @Override
    public OrderEntity getOrderByUserId(Integer userId) {


        UserEntity userEntity  = userService.getUserById();
        System.out.println("userEntity = " + userEntity);
        return null;
    }
}

package com.xucm.dubbo.order.controller;

import com.xucm.dubbo.api.entity.UserEntity;
import com.xucm.dubbo.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author YXG
 * @Date 2018-10-26 18:27
 */

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getUser")
    public UserEntity getUserOrder() {
        return orderService.getUserEntity();
    }
}

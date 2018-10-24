package com.xucm.dubbo.api.service;

import com.xucm.dubbo.api.entity.OrderEntity;

/**
 * @Author YXG
 * @Date 2018-10-24 20:26
 */
public interface OrderService {


    /**
     * 根据用户的id 查询用户的收获地址
     * @param userId
     * @return
     */
    public OrderEntity getOrderByUserId(Integer userId);
}

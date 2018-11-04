package com.xucm.dubbo.order.impl;

import com.xucm.dubbo.api.entity.UserEntity;
import com.xucm.dubbo.api.service.UserService;

import java.util.List;
import java.util.Random;

/**
 * @Author YXG
 * @Date 2018-10-29 20:32
 */
public class UserServiceStub implements UserService {
    private final UserService userService ;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserEntity> geteUserAll() {
        return null;
    }

    @Override
    public UserEntity getUserById() {
        Random random = new Random();

        System.out.println("UserServiceStub.getUserById");
        //if (random.nextInt(10) % 2 == 0) {
            return this.userService.getUserById();
        //}

//        UserEntity userEntity = new UserEntity();
//        userEntity.setUserAddr("存根方法");
//        userEntity.setUserId(55);
//        userEntity.setUserName("cungen");
    }
}

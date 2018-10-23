package com.xucm.dubbo.service.impl;

import com.xucm.dubbo.entity.UserEntity;
import com.xucm.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YXG
 * @Date 2018-10-23 21:50
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserEntity> geteUserAll() {
        ArrayList<UserEntity> userEntities = new ArrayList<>();

        UserEntity userEntity = new UserEntity();
        userEntity.setUserAddr("深圳天安云谷");
        userEntity.setUserId(1);
        userEntity.setUserName("杨旭光");

        UserEntity userEntity2 = new UserEntity();
        userEntity2.setUserAddr("深圳天安云谷");
        userEntity2.setUserId(1);
        userEntity2.setUserName("杨旭光");

        userEntities.add(userEntity);
        userEntities.add(userEntity2);
        return userEntities;
    }

    @Override
    public UserEntity getUserById() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserAddr("深圳天安云谷");
        userEntity.setUserId(1);
        userEntity.setUserName("杨旭光");
        return userEntity;
    }
}

package com.xucm.dubbo.order.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xucm.dubbo.api.entity.UserEntity;
import com.xucm.dubbo.api.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YXG
 * @Date 2018-10-23 21:50
 */
@Component
@Service(version = "2.0")
public class UserServiceImpl2 implements UserService {

    @Override
    public List<UserEntity> geteUserAll() {
        ArrayList<UserEntity> userEntities = new ArrayList<>();

        UserEntity userEntity = new UserEntity();
        userEntity.setUserAddr("深圳天安云谷");
        userEntity.setUserId(1);
        userEntity.setUserName("阳旭光");

        UserEntity userEntity2 = new UserEntity();
        userEntity2.setUserAddr("上海");
        userEntity2.setUserId(1);
        userEntity2.setUserName("yang旭光");

        userEntities.add(userEntity);
        userEntities.add(userEntity2);
        return userEntities;
    }

    @Override
    @HystrixCommand
    public UserEntity getUserById() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserAddr("深圳天安云谷2");
        userEntity.setUserId(1);
        userEntity.setUserName("new_yang旭光2");
        if (Math.random() > 0.5)
            throw  new RuntimeException("调用异常");
        return userEntity;
    }
}

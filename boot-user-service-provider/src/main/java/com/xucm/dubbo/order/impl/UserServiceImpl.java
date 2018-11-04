package com.xucm.dubbo.order.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xucm.dubbo.api.entity.UserEntity;
import com.xucm.dubbo.api.service.UserService;
import com.xucm.dubbo.order.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author YXG
 * @Date 2018-10-23 21:50
 */
@Component
@Service(version = "1.0")
public class UserServiceImpl implements UserService {

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
    public UserEntity getUserById() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserAddr("深圳天安云谷2");
        userEntity.setUserId(1);
        userEntity.setUserName("yang旭光2");

        if (new Random().nextInt(8) % 2 == 0) {
            throw new RuntimeException("调用出错");
        }
        return userEntity;
    }
}

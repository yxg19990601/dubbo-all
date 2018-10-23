package com.xucm.dubbo.service;

import com.xucm.dubbo.entity.UserEntity;

import java.util.List;

/**
 * @Author YXG
 * @Date 2018-10-23 21:45
 */
public interface UserService {


    /***
     * 返回所有的用户
     * @return
     */
    public List<UserEntity> geteUserAll();

    /**
     * 根据用户id 返回用户对象
     * @return
     */
    public UserEntity getUserById();
}

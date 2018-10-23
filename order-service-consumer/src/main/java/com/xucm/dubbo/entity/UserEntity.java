package com.xucm.dubbo.entity;

import java.io.Serializable;

/**
 * @Author YXG
 * @Date 2018-10-23 21:46
 */
public class UserEntity implements Serializable {

    public String userName;
    public Integer userId;
    public String userAddr;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }


}

package com.xucm.dubbo.api.entity;

/**
 * @Author YXG
 * @Date 2018-10-24 20:25
 */
public class OrderEntity {

    private Integer userId ;
    private String address;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "userId=" + userId +
                ", address='" + address + '\'' +
                '}';
    }
}

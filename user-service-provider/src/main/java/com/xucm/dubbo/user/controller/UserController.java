package com.xucm.dubbo.user.controller;

import com.xucm.dubbo.api.entity.UserEntity;
import org.springframework.stereotype.Controller;

/**
 * @Author YXG
 * @Date 2018-10-24 21:08
 */


@Controller("/userController")
public class UserController {
    public UserController() {
        System.out.println("UserController.UserController");
    }
}

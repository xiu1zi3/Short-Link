package com.xiuzi.shortlink.admin.controller;

/*
 * 用户管理控制层
 * */

import com.xiuzi.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller 和 @ResponseBody 的组合注解

@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")//@RequestMapping 默认值为 GET
    public String getUserByUserName(@PathVariable("username") String username){

        return "Hi " + username;
    }
}

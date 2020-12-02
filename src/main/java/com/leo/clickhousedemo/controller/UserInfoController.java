package com.leo.clickhousedemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.leo.clickhousedemo.entity.User;
import com.leo.clickhousedemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Deseription : User相关接口
 * @Author : xiangguang.wu
 * @Date : 2020/12/1
 **/
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUserById")
    public List<User> getUserById(@RequestParam("data") String data) {
        List<Integer> idList = JSONObject.parseArray(data, Integer.class);
        System.out.println("idList = " + JSONObject.toJSONString(idList));
        List<User> userList = userService.getUserById(idList);
        System.out.println("userList = " + JSONObject.toJSONString(userList));
        return userList;
    }

    @RequestMapping("/countTotalRows")
    public void countTotalRows() {
        Long count = userService.countTotalRows();
        System.out.println("totalRows = " + count);
    }
}

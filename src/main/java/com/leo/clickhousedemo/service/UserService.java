package com.leo.clickhousedemo.service;

import com.leo.clickhousedemo.entity.User;

import java.util.List;

/**
 * @Deseription : UserService
 * @Author : xiangguang.wu
 * @Date : 2020/12/1
 **/
public interface UserService {
    List<User> getUserById(List<Integer> ids);

    Long countTotalRows();
}

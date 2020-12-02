package com.leo.clickhousedemo.dao;

import com.leo.clickhousedemo.entity.User;

import java.util.List;

/**
 * @Deseription : UserDao
 * @Author : xiangguang.wu
 * @Date : 2020/12/1
 **/
public interface UserDao {
    List<User> getUserById(List<Integer> ids);

    Long countTotalRows();
}

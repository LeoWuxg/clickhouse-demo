package com.leo.clickhousedemo.mapper;

import com.leo.clickhousedemo.entity.User;

import java.util.List;

/**
 * @Deseription : UserMapper
 * @Author : xiangguang.wu
 * @Date : 2020/12/1
 **/
public interface UserMapper {
    List<User> getUserById(List<Integer> ids);

    Long countTotalRows();
}

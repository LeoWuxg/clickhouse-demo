package com.leo.clickhousedemo.dao.impl;

import com.leo.clickhousedemo.dao.UserDao;
import com.leo.clickhousedemo.entity.User;
import com.leo.clickhousedemo.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Deseription : UserDao实现类
 * @Author : xiangguang.wu
 * @Date : 2020/12/1
 **/
@Component
public class UserDaoImpl implements UserDao {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserById(List<Integer> ids) {
        return userMapper.getUserById(ids);
    }

    @Override
    public Long countTotalRows() {
        return userMapper.countTotalRows();
    }
}

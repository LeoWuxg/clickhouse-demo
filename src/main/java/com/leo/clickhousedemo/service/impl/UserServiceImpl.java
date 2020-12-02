package com.leo.clickhousedemo.service.impl;

import com.leo.clickhousedemo.dao.UserDao;
import com.leo.clickhousedemo.entity.User;
import com.leo.clickhousedemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Deseription : UserService实现类
 * @Author : xiangguang.wu
 * @Date : 2020/12/1
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUserById(List<Integer> ids) {
        return userDao.getUserById(ids);
    }

    @Override
    public Long countTotalRows() {
        return userDao.countTotalRows();
    }
}

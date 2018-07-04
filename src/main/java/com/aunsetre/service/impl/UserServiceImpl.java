package com.aunsetre.service.impl;

import com.aunsetre.mapper.UserMapper;
import com.aunsetre.service.UserService;
import com.aunsetre.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;
    public User login(String account, String password) {
        //return userDao.login(account,password);
        return null;
    }
}

package com.service.impl;

import com.dao.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口的实现实现类
 *
 * @services("userServices")用于将当前类注释为一个spring的baen对象,名为userService
 */
@Transactional(propagation= Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
    /**
     * 自动注入UserMapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * UserService接口login方法实现
     *
     * @param loginname
     * @param password
     * @return 返回User对象或null
     */
    @Transactional(readOnly=true)
    @Override
    public User login(String loginname, String password) {
        return userMapper.findWithLoginnameAndPassword(loginname, password);
    }
}

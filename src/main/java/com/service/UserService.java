package com.service;

import com.pojo.User;

//User服务层接口
public interface UserService {
    /**
     * 判断用户登录
     * 返回USER对象,没有找到返回NULL
     */
    User login(String loginname, String password);

}

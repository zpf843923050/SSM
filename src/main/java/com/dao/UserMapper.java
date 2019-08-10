package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 根据登录名和密码查询用户
 * 查询到返回User对象,否则返回null
 */
public interface UserMapper {
    @Select("SELECT *FROM tb_user where loginname=#{loginname}and password=#{password}")
    User findWithLoginnameAndPassword(@Param("loginname") String loginname,
                                      @Param("password") String password);

}

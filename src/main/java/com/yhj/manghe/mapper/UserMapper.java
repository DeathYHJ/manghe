package com.yhj.manghe.mapper;

import com.yhj.manghe.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public User getLoginUser(@Param(value = "username") String username,
                             @Param(value = "password") String password);




}

package com.yhj.manghe.service;

import com.yhj.manghe.bean.User;
import com.yhj.manghe.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @package: com.yhj.manghe.service
 * @ClassName: UserServiceImpl
 * @author: yhj.
 * @date : 2022-01-18 16:15
 **/
@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return  userMapper.getLoginUser(username,password);
    }
}

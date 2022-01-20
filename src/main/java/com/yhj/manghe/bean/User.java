package com.yhj.manghe.bean;

import lombok.Data;

/**
 * @package: com.yhj.manghe.bean
 * @ClassName: User 用户实体类
 * @author: yhj.
 * @date : 2022-01-18 15:53
 **/

@Data
public class User {
    private Integer id;  //用户id
    private String username;  //用户姓名
    private String password;  //用户密码
    private String email;  //用户邮箱
    private String inviteCode;  //邀请码
    private Integer integral;  //用户积分
    private String introduce;  //用户介绍
    private String photo;  //用户头像
    private String verificationCode;  //用户注册时的验证码

}

package com.yhj.manghe.controller;

import com.yhj.manghe.bean.User;
import com.yhj.manghe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @package: com.yhj.manghe.controller
 * @ClassName: UserController
 * @author: yhj.
 * @date : 2022-01-18 16:13
 **/

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    /**
     * 登录页面
     * @return
     */
    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @PostMapping("/login")
    public String main(@RequestParam(value = "username") String username,
                       @RequestParam(value = "password") String password,
                       HttpSession session, Model model){
        User user = userService.login(username,password);
        if(null!=user){
            //写入session
            session.setAttribute("userlogin",user);
            //登录成功
            return "redirect:/main";
        }else {
            model.addAttribute("msg", "用户名或者密码错误");
            return "login";
        }
    }


    @GetMapping("/main")
    public String main(HttpSession session,Model model){
        Object userlogin = session.getAttribute("userlogin");
        if(userlogin!=null){
            return "main";
        }else {
            model.addAttribute("msg", "请先登录");
            return "login";
        }
    }


    @GetMapping("/login1")
    public String login1(){
        return "login1";
    }
}

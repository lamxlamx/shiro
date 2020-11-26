package com.guo.shirotest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("UserController.hello()");
        return "Ok";
    }

    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        //将数据存入model
        model.addAttribute("name","thymeaf");
        //返回test.html   thymeleaf特点：以。html后缀名结尾
        return "test";

    }
}

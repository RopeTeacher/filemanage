package com.ztx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author rope
 * @Date 2020/7/27 1:08
 * @Version 1.0
 */
@Controller
public class IndexController {

    @GetMapping("index")
    public String toLogin(){
        return "login";
    }

}

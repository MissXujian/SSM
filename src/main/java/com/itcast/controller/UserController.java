package com.itcast.controller;

import com.itcast.domain.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("list",list);
        System.out.println(list);
        return "success";

    }
}

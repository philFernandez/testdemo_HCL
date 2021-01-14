package com.testauth.testdemo.controller;

import com.testauth.testdemo.dao.Dao;
import com.testauth.testdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
    @Autowired
    private Dao data;

    @GetMapping("/register")
    public ModelAndView addNewUser() {
        return new ModelAndView("registration", "user", new User());
    }

    @GetMapping("/users")
    public ModelAndView listUsers() {
        return new ModelAndView("listall", "users", data.users());
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        data.registerNewUser(user);
        return ("redirect:/users");
    }
}

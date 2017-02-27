package com.ibeifeng.jp.controller;

import com.ibeifeng.jp.model.User;
import com.ibeifeng.jp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zmzy on 2017/2/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public String list(){
        //
        return "user/list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "user/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){
        userService.add(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/{id}/show")
    public String show(@PathVariable int id){
        User user = userService.load(id);
        System.out.println(user);
        return "user/show";
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(User user){
        return "";
    }
}

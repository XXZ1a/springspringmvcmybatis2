package com.neusoft.springspringmvcmybatis.controller;

import com.neusoft.springspringmvcmybatis.pojo.User;
import com.neusoft.springspringmvcmybatis.service.UserService;
import com.neusoft.springspringmvcmybatis.vo.ResponseCode;
import com.neusoft.springspringmvcmybatis.vo.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryUserList")
    public ResponseModel queryUserList() throws Exception {
        return userService.findUserList();
    }

    @RequestMapping("/queryUserPage")
    public ResponseModel queryUserPage (@RequestBody Map<String,Object> map) throws Exception {
        System.out.println(map);
        return userService.findUserPage(map);
    }

    @RequestMapping("/deleteUser")
    public ResponseModel deleteUser(@RequestBody Map<String,Integer[]> map) throws Exception {
        return userService.deleteUser(map.get("ids"));
    }
}

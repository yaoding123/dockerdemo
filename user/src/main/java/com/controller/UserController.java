package com.controller;


import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yaoding
 * @since 2020-11-11
 */
@RestController
@RequestMapping("api/v1/dockerdemo/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUser(id);
    }
}


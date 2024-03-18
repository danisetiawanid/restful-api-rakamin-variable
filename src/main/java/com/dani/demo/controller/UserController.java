package com.dani.demo.controller;
import com.dani.demo.model.User;
import com.dani.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User creatUser(@RequestBody User user){
        return  userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id).orElse(null);
    }
}

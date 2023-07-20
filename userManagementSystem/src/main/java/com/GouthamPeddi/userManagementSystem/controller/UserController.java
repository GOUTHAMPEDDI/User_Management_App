package com.GouthamPeddi.userManagementSystem.controller;

import com.GouthamPeddi.userManagementSystem.model.User;
import com.GouthamPeddi.userManagementSystem.service.UserService;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("Users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("User")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("Users")
    public String addUsers(@RequestBody List<User> users){
        return userService.addUsers(users);
    }

    @DeleteMapping("User/{id}")
    public String removeUser(@PathVariable Integer id){
        return userService.removeUser(id);
    }

    @PutMapping("User/{id}/email/{email}")
    public String updateEmailById(@PathVariable Integer id, @PathVariable @Email String email){
        return userService.updateEmailById(id,email);
    }

    @GetMapping("User/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }


}

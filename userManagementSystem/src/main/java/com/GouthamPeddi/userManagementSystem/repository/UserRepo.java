package com.GouthamPeddi.userManagementSystem.repository;

import com.GouthamPeddi.userManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    public List<User> usersList;

    public List<User> getAllUsers(){
        return usersList;
    }
}

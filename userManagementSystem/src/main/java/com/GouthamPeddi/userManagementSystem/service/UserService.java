package com.GouthamPeddi.userManagementSystem.service;

import com.GouthamPeddi.userManagementSystem.model.User;
import com.GouthamPeddi.userManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }


    public String addUser(User user) {
        List<User> originalList=getAllUsers();
        originalList.add(user);
        return "user added";
    }


    public String addUsers(List<User> users) {
        List<User> originalList=getAllUsers();
        originalList.addAll(users);
        return "users added";
    }


    public String removeUser(Integer id) {
        List<User> originalList=getAllUsers();
        for(User u : originalList){
            if(u.getUserId().equals(id)){
                originalList.remove(u);
                return "user removed";
            }
        }
        return "id not found";
    }


    public String updateEmailById(Integer id, String email) {
        List<User> originalList=getAllUsers();
        for(User u : originalList){
            if(u.getUserId().equals(id)){
                u.setUserEmail(email);
                return "email updated successfully";
            }
        }
        return "id not found";
    }

    public User getUserById(Integer id) {
        List<User> originalList=getAllUsers();
        for(User u : originalList){
            if(u.getUserId().equals(id)){
                return u;
            }
        }
        throw new IllegalStateException("id not found");
    }
}

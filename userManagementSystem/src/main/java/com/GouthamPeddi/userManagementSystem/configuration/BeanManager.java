package com.GouthamPeddi.userManagementSystem.configuration;

import com.GouthamPeddi.userManagementSystem.model.Type;
import com.GouthamPeddi.userManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    public List<User> getInitializedList;

    @Bean
    public List<User> getAllUsers(){
        User initUser=new User(0,"goutham","peddigoutham93172@gmail.com","abcd","9876543210",23, LocalDate.of(2001,05,15), Type.CUSTOMER);
        List<User> initList=new ArrayList<>();
        initList.add(initUser);
        return initList;
    }
}

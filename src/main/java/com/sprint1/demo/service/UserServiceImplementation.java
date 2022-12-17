package com.sprint1.demo.service;

import com.sprint1.demo.data.UserData;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
@Service
public class UserServiceImplementation implements UserService{

    private HashMap<Integer, UserData> allUsers = new HashMap<>();


    @Override
    public UserData create(UserData user) {
        Integer id = user.getId();
        return allUsers.put(id,user);
    }

    @Override
    public UserData findById(Integer id) {
        return allUsers.get(id);
    }

    @Override
    public HashMap<Integer, UserData> all() {
        return allUsers;
    }

    @Override
    public void deleteById(Integer id) {
    allUsers.remove(id);
    }

    @Override
    public UserData upadate(UserData user, Integer id) {
        return allUsers.replace(id,user);
    }
}

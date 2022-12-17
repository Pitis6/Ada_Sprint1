package com.sprint1.demo.service;

import com.sprint1.demo.DTO.UserDTO;
import com.sprint1.demo.data.UserData;
import org.apache.catalina.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    UserData create(UserData user);
    UserData findById(Integer id);
    HashMap<Integer, UserData> all();
    void deleteById(Integer id);
    UserData upadate(UserData user, Integer Id);
}

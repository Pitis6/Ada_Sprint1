package com.sprint1.demo.service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User findById(String id);
    List<User> all();
    void deleteById(String id);
    User upadate(User user, String userId);
}

package com.sprint1.demo.userController;

import com.sprint1.demo.DTO.UserDTO;
import com.sprint1.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody User user){
        User userCreated = userService.create(user);
        return userCreated;
    }

    @GetMapping
    public User findById(String id){
        User userFound = userService.findById(id);
        return userFound;
    }

    @GetMapping
    public List<User> allUsers(){
        List<User> allUsers = userService.all();
        return allUsers;
    }

    @DeleteMapping
    public void deleteUser(String id){
        userService.deleteById(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user, String id){
        User updatedUser = userService.upadate(user,id );
        return updatedUser;
    }


}

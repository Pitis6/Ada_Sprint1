package com.sprint1.demo.userController;

import com.sprint1.demo.data.UserData;
import com.sprint1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public UserData create(@RequestBody UserData user){
        return userService.create(user);
    }

    @GetMapping("{id}")
    public UserData findById(@PathVariable Integer id){
        UserData userFound = userService.findById(id);
        return userFound;
    }

    @GetMapping
    public HashMap<Integer, UserData> allUsers(){
        return userService.all();
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteById(id);
    }

    @PutMapping
    public UserData updateUser(@RequestBody UserData user){
        Integer id = user.getId();
        return userService.upadate(user,id );
    }


}

package com.moisegui.citizenship.ws;

import com.moisegui.citizenship.entities.User;
import com.moisegui.citizenship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/id/{id}")
    public User findById(@PathVariable String id){
        try {
            return userService.findById(id);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/")
    public User save(@RequestBody User user){
        try {
            return userService.save(user);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/id/{id}")
    public int deleteById(@PathVariable String id) {
        try {
            userService.deleteById(id);
            return 1;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @PutMapping("/")
    public User update(@RequestBody User user){
        try {
            return userService.update(user);
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

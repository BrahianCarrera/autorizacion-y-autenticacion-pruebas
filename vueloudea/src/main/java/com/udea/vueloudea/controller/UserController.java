package com.udea.vueloudea.controller;

import com.udea.vueloudea.service.UserService;
import com.udea.vueloudea.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/search")
    public Optional<User> searchUser(@RequestParam (value = "id_user", required = false)int id_user
                                /* @RequestParam (value = "name", required = false)String name,
                                 @RequestParam (value = "email", required = false)String email,
                                 @RequestParam (value = "password", required = false)String password,
                                 @RequestParam (value = "address", required = false)String address,
                                 @RequestParam (value = "document_number", required = false)String document_number,
                                 @RequestParam (value = "role", required = false)String role*/) {


                                return userService.findUserById(id_user);
    }

    @PostMapping("/create")
    public User createUser(@RequestParam (value = "id_user")int id_user,
                                 @RequestParam (value = "name")String name,
                                 @RequestParam (value = "email")String email,
                                 @RequestParam (value = "password")String password,
                                 @RequestParam (value = "address")String address,
                                 @RequestParam (value = "document_number")String document_number,
                                 @RequestParam (value = "role")String role) {

        User user = new User(id_user, name, email, password, address, document_number, role);

        userService.createUser(user);
        return  user;
    }



}

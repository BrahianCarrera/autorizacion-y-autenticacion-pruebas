package com.udea.vueloudea.service;

import com.udea.vueloudea.repository.UserRepository;
import com.udea.vueloudea.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findUserById(Integer id_user) {

        if(id_user != null){

            long id_long = Long.valueOf(id_user);

            return  userRepository.findById(id_long);
        }
        return null;
    }

    public void createUser( User user) {
        userRepository.save(user);
    }
}

package com.educandoweb.workshopspringmongodb.services;

import com.educandoweb.workshopspringmongodb.domain.User;
import com.educandoweb.workshopspringmongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}

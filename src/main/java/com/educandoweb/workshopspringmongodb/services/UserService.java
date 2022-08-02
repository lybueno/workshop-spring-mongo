package com.educandoweb.workshopspringmongodb.services;

import com.educandoweb.workshopspringmongodb.domain.User;
import com.educandoweb.workshopspringmongodb.dto.UserDTO;
import com.educandoweb.workshopspringmongodb.repositories.UserRepository;
import com.educandoweb.workshopspringmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}

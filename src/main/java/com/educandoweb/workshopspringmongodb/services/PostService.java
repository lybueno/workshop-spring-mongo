package com.educandoweb.workshopspringmongodb.services;

import com.educandoweb.workshopspringmongodb.domain.Post;
import com.educandoweb.workshopspringmongodb.domain.User;
import com.educandoweb.workshopspringmongodb.repositories.PostRepository;
import com.educandoweb.workshopspringmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
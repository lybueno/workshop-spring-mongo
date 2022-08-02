package com.educandoweb.workshopspringmongodb.repositories;

import com.educandoweb.workshopspringmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}

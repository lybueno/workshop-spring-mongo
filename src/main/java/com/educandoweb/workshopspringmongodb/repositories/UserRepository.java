package com.educandoweb.workshopspringmongodb.repositories;

import com.educandoweb.workshopspringmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

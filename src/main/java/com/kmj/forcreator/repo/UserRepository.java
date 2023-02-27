package com.kmj.forcreator.repo;

import com.kmj.forcreator.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String>{
}

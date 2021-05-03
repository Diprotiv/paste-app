package com.diprotis.pasteapp.repository;

import com.diprotis.pasteapp.entity.UserEntity;
import com.diprotis.pasteapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for User, to store the
 * entity to MongoDB database.
 */
@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    /**
     * Method that finds the user-entity by the userName.
     * @param userName userName
     * @return user-entity
     */
    Optional<UserEntity> findByUserName(final String userName);



}

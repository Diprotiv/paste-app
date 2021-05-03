package com.diprotis.pasteapp.repository;

import com.diprotis.pasteapp.entity.PasteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Paste, to store the
 * entity to MongoDB database.
 */
@Repository
public interface PasteRepository extends MongoRepository<PasteEntity, String> {

    /**
     * Method that finds all pastes by the userId.
     * @param userId userId
     * @return user-entity
     */
    List<PasteEntity> findByUserId(final String userId);

}

package com.diprotis.pasteapp.bootstrap;

import com.diprotis.pasteapp.entity.PasteEntity;
import com.diprotis.pasteapp.entity.UserEntity;
import com.diprotis.pasteapp.repository.PasteRepository;
import com.diprotis.pasteapp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

/**
 * Bootstrap class to initialize the MongoDB database.
 */
@Slf4j
@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasteRepository pasteRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Creating a new user - diprotis");
        final String userId = UUID.randomUUID().toString();
        UserEntity userEntity = UserEntity.builder()
                .userName("diprotis")
                .password("12345").build();
        userRepository.save(userEntity);

        final Optional<UserEntity> savedUserOptional = userRepository.findByUserName("diprotis");

        if (savedUserOptional.isPresent()) {
            log.info("Getting back user: " + savedUserOptional.get());

            PasteEntity pasteEntity = PasteEntity.builder()
                    .data("This is a simple paste.")
                    .userId(savedUserOptional.get().getUserId()).build();

            pasteRepository.save(pasteEntity);
            log.info("All pastes by diprotis: " + pasteRepository.findByUserId(savedUserOptional.get().getUserId()));
        }
    }
}

package com.diprotis.pasteapp.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

/**
 * Configuration class for MongoDB client.
 */
@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration {

    private static final String DB_NAME = "test";
    private static final String DB_URL = "mongodb://localhost:27017/test";

    @Override
    protected String getDatabaseName() {
        return DB_NAME;
    }

    @Override
    public MongoClient mongoClient() {
        final ConnectionString connectionString = new ConnectionString(DB_URL);
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }


}

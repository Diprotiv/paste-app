package com.diprotis.pasteapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Entity class for Paste model.
 */
@Document(collection = "paste")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasteEntity {

    @Id
    private String pasteId;
    private String userId;
    private String data;

    @Version
    private Long version;

    @CreatedDate
    private LocalDateTime creationTimestamp;

    @LastModifiedDate
    private LocalDateTime updatedTimestamp;

    private LocalDateTime expirationTimestamp;
}

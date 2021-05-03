package com.diprotis.pasteapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Model that represents the "paste" data
 * that is stored by the user.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Paste {
    private String pasteId;
    private String userId;
    private String data;
    private LocalDateTime creationTimestamp;
    private LocalDateTime updatedTimestamp;
    private LocalDateTime expirationTimestamp;
}

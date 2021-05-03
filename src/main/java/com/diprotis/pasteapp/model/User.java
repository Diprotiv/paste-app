package com.diprotis.pasteapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model that represents
 * the user entity.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    private String password;
}

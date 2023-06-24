package com.tuts.security.dto;

import java.util.Set;

import com.tuts.security.models.Role;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private Set<Role> roles;
}
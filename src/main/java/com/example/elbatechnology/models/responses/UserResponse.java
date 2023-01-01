package com.example.elbatechnology.models.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;

    private String name;

    private String username;

    private String email;

    private String phone;

    private String address;

    private Boolean isActive;
}

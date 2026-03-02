package com.rehan.auth.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RegisterRequest {
        @Email
        private String email;
        private String username;
        private String password;

}

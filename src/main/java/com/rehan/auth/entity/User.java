package com.rehan.auth.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String email;

    private String userName;
    private String password;
    private boolean enabled=true;

    @Enumerated(EnumType.STRING)
    private Role role;
}

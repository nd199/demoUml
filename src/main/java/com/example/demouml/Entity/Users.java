package com.example.demouml.Entity;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long userId;

    @Column(name = "user_name", nullable = false)
    private String user_Name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;
}
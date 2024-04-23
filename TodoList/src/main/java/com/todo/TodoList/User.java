package com.todo.TodoList.models; // Package declaration, adjust according to your project structure


import jakarta.persistence.*;

@Entity
@Table(name = "U_r")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String passwordHash;

    @Column(unique = true, nullable = false)
    private String email;

    // Constructors, getters, and setters

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

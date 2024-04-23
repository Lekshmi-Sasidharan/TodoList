package com.todo.TodoList;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// Project.java
@Entity
@Table(name = "P_s")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private com.todo.TodoList.models.User user;

    @Column(nullable = false)
    private String title;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "finished_date")
    private LocalDateTime finishedDate;

    // Constructors, getters, and setters

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}

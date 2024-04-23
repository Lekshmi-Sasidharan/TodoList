package com.todo.TodoList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<com.todo.TodoList.models.User, Long> {
    com.todo.TodoList.models.User findByUsername(String username);
}
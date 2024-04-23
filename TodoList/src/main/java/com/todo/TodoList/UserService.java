package com.todo.TodoList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public com.todo.TodoList.models.User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}
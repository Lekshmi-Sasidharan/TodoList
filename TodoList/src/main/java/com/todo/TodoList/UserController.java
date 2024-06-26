package com.todo.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<com.todo.TodoList.models.User> getUserByUsername(@PathVariable String username) {
        com.todo.TodoList.models.User user = userService.findByUsername(username);
        return ResponseEntity.ok(user);
    }
}

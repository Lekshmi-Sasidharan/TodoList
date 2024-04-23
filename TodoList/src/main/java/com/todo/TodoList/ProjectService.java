package com.todo.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findByUser(com.todo.TodoList.models.User user) {
        return projectRepository.findByUser(user);
    }

    // Other methods for project management
}
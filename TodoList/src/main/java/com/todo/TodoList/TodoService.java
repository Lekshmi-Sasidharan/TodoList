package com.todo.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findByProject(Project project) {
        return todoRepository.findByProject(project);
    }
}
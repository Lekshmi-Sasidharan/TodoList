package com.todo.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/project/{projectId}")
    public ResponseEntity<List<Todo>> getTodosByProject(@PathVariable Long projectId) {
        Project project = new Project();
        project.setProjectId(projectId);
        List<Todo> todos = todoService.findByProject(project);
        return ResponseEntity.ok(todos);
    }
}
package com.todo.app.controller;

import com.todo.app.dto.CreateTodoDto;
import com.todo.app.entity.Todo;
import com.todo.app.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping("")
    public String healthCheck() {
        return "ok";
    }

    @GetMapping("/todo")
    public List<Todo> getAllTodo() {
        return todoService.findAllTodo();
    }

    @PostMapping("/todo")
    @ResponseBody
    public Todo createTodo(@RequestBody CreateTodoDto todoDto) {
        String text = todoDto.getText();
        return todoService.createTodo(text);
    }
}

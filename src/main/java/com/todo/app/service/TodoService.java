package com.todo.app.service;

import com.todo.app.entity.Todo;
import com.todo.app.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TodoService {
    private TodoRepository todoRepository;

    public List<Todo> findAllTodo() {
        return todoRepository.findAll();
    }

    public String findTodo(Long todoId) {
        return "";
    }

    public Todo createTodo(String todoItem) {
        Todo todo = new Todo();
        todo.setText(todoItem);
        todo.setIsCompleted(false);
        return todoRepository.save(todo);
    }
}

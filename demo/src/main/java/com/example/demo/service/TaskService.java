package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.model.TaskStatus;

import java.util.List;

public interface TaskService {

    Task addTask(Task task);

    List<Task> getAllTasks();

    List<Task> getTasksByStatus(TaskStatus status);

    Task updateTaskStatus(Long id, Task task);

    void deleteTask(Long id);
}
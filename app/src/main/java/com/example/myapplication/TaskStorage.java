package com.example.myapplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TaskStorage {

    private ArrayList<Task> tasks = new ArrayList<>();
    private static final TaskStorage Instance = new TaskStorage();

    public static TaskStorage getInstance() {

        return Instance;
    }

    private TaskStorage() {
        for (int i = 0; i < 100; i++) {
            Task task = new Task();
            task.setDone(i % 3 == 0);
            task.setName("Zadanie " + i);
            task.setDate(new Date());
            tasks.add(task);
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID id) {
        for (Task task : tasks) {
            if(task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}

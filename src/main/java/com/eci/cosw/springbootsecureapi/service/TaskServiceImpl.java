/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Responsible;
import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo Gomez
 */

@Service 
public class TaskServiceImpl implements TaskService {
    
    private Task sample = new Task (2,"sample data","In Progress",new Date(), new Responsible("test","test@mail.com"));
    private List<Task> tasks = new ArrayList<>();

     @Autowired
    public TaskServiceImpl() {
        tasks.add(sample);
    }
    
    @PostConstruct
    private void SampleData()
    {
        tasks.add(new Task(1,"secure-api","Ready",new Date(), new Responsible("test","test@mail.com")));
    } 
    @Override
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public Task getTaskById(int id) {
        Task result = null;
        for (Task task : tasks) {
            if (task.getId() == id) {
                result = task;
            }
        }
        return result;
    }

    @Override
    public Task createTask(Task task) {
        tasks.add(task);
        return tasks.get(0);
    }

    @Override
    public boolean DeleteTask(int id) {
        boolean result = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                result = true;
            }
        }
        return result;
    }

}

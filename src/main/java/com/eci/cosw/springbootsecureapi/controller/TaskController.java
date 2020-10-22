/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import com.eci.cosw.springbootsecureapi.service.UserService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo Gomez
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping( "task" )
public class TaskController {
    
    @Autowired
    private TaskService taskService;
    

     @GetMapping("/getTasks")
     public List <Task> getTasks(){ 
         return taskService.getTasks();
     }

    
     @GetMapping("/tasks/{id}")
     public Task getTaskById(@PathVariable("id")int id){
         return taskService.getTaskById(id);
     }
   
     @PostMapping("/creatTasks") 
     public Task addTask( @RequestBody Task newTask){
         
         return taskService.createTask(newTask);
     }

     @DeleteMapping("/tasks/{id}") 
     public boolean deleteTask(@PathVariable int id){
         return taskService.DeleteTask(id);
     }
    
}

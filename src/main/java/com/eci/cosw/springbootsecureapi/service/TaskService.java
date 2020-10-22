/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import java.util.List;

/**
 *
 * @author Jairo Gomez
 */

public interface TaskService {
    List<Task> getTasks();
    
    Task createTask (Task task );
    
    Task getTaskById (int id);
    
    public boolean DeleteTask (int id);

}

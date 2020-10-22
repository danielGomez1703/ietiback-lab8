/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

/**
 *
 * @author Jairo Gomez
 */
public class Task {
    
    private int id;
    private String descripcion;
    private String status;
    private Date dueDate;
    private  Responsible responsible;

    public Task(int id, String descripcion, String status, Date dueDate, Responsible responsible) {
        this.id = id;
        this.descripcion = descripcion;
        this.status = status;
        this.dueDate = dueDate;
        this.responsible = responsible;
    }
    
    

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }


    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
}

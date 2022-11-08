package com.example.myapplication;
import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }

    public String getName(){
        return name;
    }


    public void setName(String toString) {
        name = toString;
    }


    public Object getDate() {
        return date;
    }


    public boolean isDone() {
        return done;
    }


    public UUID getId() {
        return id;
    }


    public void setDone(boolean isChecked) {
        done = isChecked;
    }

    public void setDate(Date data) {
        date = data;
    }
}

package com.jktm.taksapp.taskappjava17;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.ComboBox;

import java.time.LocalDate;

public class Tasks {

    String task;

    public Tasks(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}

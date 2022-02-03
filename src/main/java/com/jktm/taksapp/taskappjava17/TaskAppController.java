package com.jktm.taksapp.taskappjava17;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class TaskAppController {

    FileChooser fileChooser = new FileChooser();

    @FXML
    private ListView<String> listOfTodo;

    @FXML
    private TextField txtTask;

    @FXML
    void btnAdd(MouseEvent event) {
        //Add label
        Label label = new Label();
        label.setText("-   ");

        listOfTodo.getItems().add(label.getText() + txtTask.getText());
    }

    @FXML
    void btnRemove(MouseEvent event) {
        int selectedID = listOfTodo.getSelectionModel().getSelectedIndex();
        listOfTodo.getItems().remove(selectedID);
    }

    @FXML
    void btnSave(MouseEvent event) {
        File file = fileChooser.showSaveDialog(new Stage());
        if (file != null) {
            saveSystem(file, String.valueOf(listOfTodo.getItems()));
        }
    }

    public void saveSystem(File file, String content) {
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package com.example.studentapp;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;

public class Date {
    @FXML
    private TextField birthdayStudentTextField;
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    String birthday = format.format(date);
}

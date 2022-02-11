package com.example.studentapp;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableView<Student> tableview;
    @FXML
    private TableColumn<Student, Integer> phoneStudentTableColumn;

    @FXML
    private TableColumn<Student, String> nameStudentTableColumn;

    @FXML
    private TableColumn<Student, Integer> idStudentTableColumn;

    @FXML
    private TableColumn<Student, String> birthdayStudentTableColumn;

    @FXML
    private TextField phoneStudentTextField;

    @FXML
    private TextField nameStudentTextField;

    @FXML
    private Button addStudent , clearStudent;

    @FXML
    private DatePicker birthdayStudentPicker;

    Student student;

    //ADD
    public String birthday(){
        LocalDate birthday = birthdayStudentPicker.getValue();
        return birthday.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

   public void add(){

       String name = nameStudentTextField.getText();
       String birthday= birthday();
       String phone= phoneStudentTextField.getText();
       if( name.equals("") && phone.equals("") ){
           System.out.println("Error");
           return;
       }
       student = new Student(name, birthday,phone);
       ObservableList<Student> list = tableview.getItems();
       list.add(student);
       tableview.setItems(list);
       nameStudentTextField.clear();
       phoneStudentTextField.clear();
   }

   //CLEAR
   public void clear() {
        if(tableview.getItems().isEmpty()) return;
        int id = tableview.getSelectionModel().getSelectedIndex();
        tableview.getItems().remove(id);

   }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameStudentTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        idStudentTableColumn.setCellValueFactory(new PropertyValueFactory<>("idStudent"));
        birthdayStudentTableColumn.setCellValueFactory(new PropertyValueFactory<>("birthday"));
        phoneStudentTableColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
   }


}
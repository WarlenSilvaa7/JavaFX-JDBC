package org.example.javafxjdbc.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.javafxjdbc.model.entities.Department;
import org.example.javafxjdbc.util.Constraints;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentFormController implements Initializable {


    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private Label labelErrorName;

    @FXML
    private Button btSave;

    @FXML
    private Button btCancel;

    private Department entity;

    @FXML
    public void onBtSaveAction(){
        System.out.println("OnBtSaveAction");
    }

    @FXML
    public void onBtCancelAction(){
        System.out.println("OnBtCancelAction");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
        initializeNode();
    }

    private void initializeNode(){
        Constraints.setTextFieldInteger(txtId);
        Constraints.setTextFieldMaxLength(txtName,30);
    }

    public void setDepartment(Department entity){
        this.entity = entity;
    }

    public void updateFormData(){
        if(entity == null){
            throw new IllegalStateException("Entity was null");
        }
        txtId.setText(String.valueOf(entity.getId()));
        txtName.setText(String.valueOf(entity.getName()));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uts_pbol_2020110052;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class InputKandangController implements Initializable {

    @FXML
    private Button btnSimpan;
    @FXML
    private Button btnKeluar;
    @FXML
    private TextField txtHarga;
    @FXML
    private TextField txtKandang;
    @FXML
    private TextField txtLuas;
    @FXML
    private Label lblKandang;
    @FXML
    private Button btnReset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void simpanKlik(ActionEvent event) {
    }


    @FXML
    private void keluarKlik(ActionEvent event) {
        btnKeluar.getScene().getWindow().hide();
    }

    @FXML
    private void ResetKlik(ActionEvent event) {
    }
    
}

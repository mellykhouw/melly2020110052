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
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class DisplayHewanController implements Initializable {

    @FXML
    private Button btnSesudah;
    @FXML
    private Button btnAkhir;
    @FXML
    private Button btnKeluar;
    @FXML
    private Button btnUbah;
    @FXML
    private Button btnTambah;
    @FXML
    private Button btnHapus;
    @FXML
    private Button btnSebelum;
    @FXML
    private Button btnAwal;
    @FXML
    private TableView<?> tbvHewan;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sesudahKlik(ActionEvent event) {
    }

    @FXML
    private void akhirKlik(ActionEvent event) {
    }

    @FXML
    private void keluarKlik(ActionEvent event) {
        btnKeluar.getScene().getWindow().hide();
    }

    @FXML
    private void ubahKlik(ActionEvent event) {
    }

    @FXML
    private void tambahKlik(ActionEvent event) {
    }

    @FXML
    private void habisKlik(ActionEvent event) {
    }

    @FXML
    private void sebelumKlik(ActionEvent event) {
    }

    @FXML
    private void awalKlik(ActionEvent event) {
    }
    
}

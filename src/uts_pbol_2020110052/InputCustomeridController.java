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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class InputCustomeridController implements Initializable {

    @FXML
    private Label lblCustomer;
    @FXML
    private TextField txtNamaCust;
    @FXML
    private TextField txtNoTelfon;
    @FXML
    private Button btnKeluar;
    @FXML
    private Button btnSimpan;
    @FXML
    private TextArea txtAlamat;
    @FXML
    private Button btnReset;

    /**
     * Initializes the controller clasmcust.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void keluarKlik(ActionEvent event) {
        btnKeluar.getScene().getWindow().hide();
    }


    @FXML
    private void simpanKlik(ActionEvent event) {
        modelCustomer mcust = new modelCustomer();
        mcust.setNamacust(txtNamaCust.getText());
        mcust.setNotelfon(txtNoTelfon.getText());
        mcust.setAlamat(txtAlamat.getText());
        FXMLDocumentController.dtcustomer.setmodelCustomer(mcust);
        if(FXMLDocumentController.dtcustomer.validasi(mcust.getNotelfon())<=0){
            
            if(FXMLDocumentController.dtcustomer.insert()){
               Alert a=new Alert(Alert.AlertType.INFORMATION,"Data berhasil disimpan",ButtonType.OK);
                a.showAndWait();
                keluarKlik(event);
                } 
            else {
               Alert a=new Alert(Alert.AlertType.ERROR,"Data gagal disimpan",ButtonType.OK);
               a.showAndWait();            
            }
        }
        else
        {
            Alert a=new Alert(Alert.AlertType.ERROR,"Data sudah ada",ButtonType.OK);
            a.showAndWait();
            txtNoTelfon.requestFocus();
    
        }
    }
        
    
    

    @FXML
    private void ResetKlik(ActionEvent event) {
        txtNamaCust.setText("");
        txtNoTelfon.setText("");
        txtAlamat.setText("");
        
        
        
    }

    void execute(modelCustomer mc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uts_pbol_2020110052;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class DisplayCustomerController implements Initializable {

    @FXML
    private Button btnSesudah;
    @FXML
    private Button btnAkhir;
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
    private TableView<modelCustomer> tbvCustomer;
    @FXML
    private Button btnKeluar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<modelCustomer> data=FXMLDocumentController.dtcustomer.Load();
        if(data!=null){            
            tbvCustomer.getColumns().clear();
            tbvCustomer.getItems().clear();
            TableColumn col=new TableColumn("CustomerId");
            col.setCellValueFactory(new PropertyValueFactory<modelCustomer, String>("Customerid"));
            tbvCustomer.getColumns().addAll(col);
            col=new TableColumn("Name");
            col.setCellValueFactory(new PropertyValueFactory<modelCustomer, String>("namacust"));
            tbvCustomer.getColumns().addAll(col);
            col=new TableColumn("NoTelpon");
            col.setCellValueFactory(new PropertyValueFactory<modelCustomer, String>("notelfon"));
            tbvCustomer.getColumns().addAll(col);
            col=new TableColumn("Alamat");
            col.setCellValueFactory(new PropertyValueFactory<modelCustomer, String>("Alamat"));
            tbvCustomer.getColumns().addAll(col);
            tbvCustomer.setItems(data);
        }else {
            Alert a=new Alert(Alert.AlertType.ERROR,"Data kosong",ButtonType.OK);
            a.showAndWait();
            tbvCustomer.getScene().getWindow().hide();;
    }    
    }
     

    @FXML
    private void sesudahKlik(ActionEvent event) {
        tbvCustomer.getSelectionModel().selectBelowCell();
        tbvCustomer.requestFocus();  
    
    }

    @FXML
    private void akhirKlik(ActionEvent event) {
        tbvCustomer.getSelectionModel().selectLast();
        tbvCustomer.requestFocus();  
        
    }


    @FXML
    private void ubahKlik(ActionEvent event) {
        modelCustomer mc = new modelCustomer();
        mc=tbvCustomer.getSelectionModel().getSelectedItem();
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("InputCustomer.fxml"));    
        Parent root = (Parent)loader.load();
        InputCustomeridController isidt=(InputCustomeridController)loader.getController();
        isidt.execute(mc);                
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.showAndWait();
        } catch (IOException e){   e.printStackTrace();   }
        showdata();
        awalKlik(event);
 
    }

    @FXML
    private void tambahKlik(ActionEvent event) {
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("InputCustomerid.fxml"));    
        Parent root = (Parent)loader.load();        
        Scene scene = new Scene(root);        
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);        
        stg.setIconified(false);        stg.setScene(scene);
        stg.showAndWait();
        } catch (IOException e){   
            e.printStackTrace();   }
        showdata();
        awalKlik(event);
    }
    

    

    @FXML
    private void sebelumKlik(ActionEvent event) {
        tbvCustomer.getSelectionModel().selectAboveCell();
        tbvCustomer.requestFocus();   
    }

    @FXML
    private void awalKlik(ActionEvent event) {
        tbvCustomer.getSelectionModel().selectFirst();
        tbvCustomer.requestFocus();   
    }

    @FXML
    private void keluarKlik(ActionEvent event) {
        btnKeluar.getScene().getWindow().hide();

    }

    @FXML
    private void hapusKlik(ActionEvent event) {
        modelCustomer mc = new modelCustomer();
        mc=(modelCustomer) tbvCustomer.getSelectionModel().getSelectedItem();
        Alert a = new Alert(Alert.AlertType.CONFIRMATION,"Apakah anda yakin?", ButtonType.YES,ButtonType.NO);
               a.showAndWait();
               if(a.getResult()==ButtonType.YES){
                   if(FXMLDocumentController.dtcustomer.delete(mc.getNotelfon())){
                    Alert b=new Alert(Alert.AlertType.INFORMATION, "Data berhasil dihapus", ButtonType.OK);
               b.showAndWait();
           } else {
               Alert b=new Alert(Alert.AlertType.ERROR,"Data gagal dihapus", ButtonType.OK);
               b.showAndWait();               
           }    
                showdata(); 
                awalKlik(event);      
               }  
            }

    private void showdata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
               
        
        
    }
    

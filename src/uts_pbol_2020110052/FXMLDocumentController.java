/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package uts_pbol_2020110052;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private MenuItem inputCustomer;
    @FXML
    private MenuItem inputHewan;
    @FXML
    private MenuItem inputKandang;
    @FXML
    private MenuItem inputPenitipan;
    @FXML
    private Menu data;
    @FXML
    private MenuItem dataCustomer;
    @FXML
    private MenuItem dataHewan;
    @FXML
    private MenuItem dataKandang;
    @FXML
    private MenuItem dataPenitipan;
    @FXML
    private Menu keluar;
    @FXML
    private Menu formPendaftaran;
    
   
    public static DBCustomer dtcustomer = new DBCustomer();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inputCustomerClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("InputCustomerid.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void inputHewanClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("InputHewan.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }
    

    @FXML
    private void inputKandangClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("InputKandang.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void inputPenitipanClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("InputPenitipanHewan.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void dataCustomerClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("DisplayCustomer.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void dataHewanClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("DisplayHewan.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void dataKandangClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("DisplayKandang.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void dataPenitipanClick(ActionEvent event) {
        try{  FXMLLoader loader=new FXMLLoader(getClass().getResource("DisplayPenitipan.fxml"));    
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();        
        } catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void keluarclick(ActionEvent event) {
        System.exit(0);
    }
    
}

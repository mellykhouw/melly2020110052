/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbol_2020110052;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author USER
 */
public class DBCustomer {
    private modelCustomer dt=new modelCustomer(); 
    
    public modelCustomer getmodelCustomer(){return(dt);}
    public void setmodelCustomer(modelCustomer mc){ dt=mc;}
    
    public ObservableList<modelCustomer>  Load() {
        try {
            ObservableList<modelCustomer> tableData=FXCollections.observableArrayList();
            Koneksi con = new Koneksi();
            con.bukaKoneksi();
            con.statement = con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery("Select * from customer");
            int i = 1;
            while (rs.next()) {
                modelCustomer mcust=new modelCustomer();
                mcust.setCustomerid(rs.getInt("CustomerId"));
                mcust.setNamacust(rs.getString("Name"));
                mcust.setNotelfon(rs.getString("NoTelpon"));
                mcust.setAlamat((rs.getString("Alamat")));
                
                tableData.add(mcust);
                i++;
            }
            con.tutupKoneksi();
            return tableData;
        }
        catch (Exception e) 
        {            
            e.printStackTrace();            
            return null;        
        } 
    
    }
   
    public int validasi(String NoTelpon) {
        int val = 0;
        try {Koneksi con = new Koneksi();
        con.bukaKoneksi();
        con.statement = con.dbKoneksi.createStatement();
        ResultSet rs = con.statement.executeQuery("select count(*) as jml from customer where NoTelpon = '"+ NoTelpon +"'");
            while (rs.next()) {
                val= rs.getInt("jml");
            }
            con.tutupKoneksi();
        }catch (SQLException e) {
            e.printStackTrace();
            
        }
        return val;
    }
    
    public boolean insert() {
        boolean berhasil = false;
        Koneksi con = new Koneksi();
        try { con.bukaKoneksi();
            con.preparedStatement = con.dbKoneksi.prepareStatement(
            "insert into customer (CustomerId,Name,NoTelpon,Alamat) values (?,?,?,?)");
            con.preparedStatement.setString(1, Integer.toString(getmodelCustomer().getCustomerid()));
            con.preparedStatement.setString(2, getmodelCustomer().getNamacust());
            con.preparedStatement.setString(3, getmodelCustomer().getNotelfon());
            con.preparedStatement.setString(4, getmodelCustomer().getAlamat());
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch (Exception e) {
            e.printStackTrace();
            berhasil = false;
        } finally {
                con.tutupKoneksi();
               
        }
        return berhasil;
    }      

    public boolean delete(String NoTelpon){
        boolean berhasil = false;
        Koneksi con = new Koneksi();
        try {
            con.bukaKoneksi();;
            con.preparedStatement = con.dbKoneksi.prepareStatement(
                "delete from customer where NomerTelpon = ?");
            con.preparedStatement.setString(1, NoTelpon);
            con.preparedStatement.executeUpdate();
            berhasil = true;}
            catch (Exception e) {
                e.printStackTrace();
                } finally {
                con.tutupKoneksi();
                 return berhasil;
        }
     }
    
    public boolean update () {
        boolean berhasil = false;
        Koneksi con = new Koneksi ();
        try{
            con.bukaKoneksi();
            con.preparedStatement = con.dbKoneksi.prepareStatement(
            "update customer set namae = ?, NoTelpon = ?, Alamat = ? where CustomerId = ?");
            con.preparedStatement.setString(1, getmodelCustomer().getNamacust());
            con.preparedStatement.setString(2, getmodelCustomer().getNotelfon());
            con.preparedStatement.setString(3, getmodelCustomer().getAlamat());
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch(Exception e){
        e.printStackTrace();
        berhasil = false;
        } finally{
        con.tutupKoneksi();
        return berhasil;}
    }
}



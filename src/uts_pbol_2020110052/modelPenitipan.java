/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbol_2020110052;

import java.util.Date;

/**
 *
 * @author USER
 */
public class modelPenitipan {
    
    Date dtTitip=new Date();
    Date dtAmbil=new Date();
    Date dtBayar=new Date();
    
    String kandang, namaCust, status;
    int total;
    
    public Date getDtTitip() {
        return dtTitip;
    }

    public void setDtTitip(Date dtTitip) {
        this.dtTitip = dtTitip;
    }

    public Date getDtAmbil() {
        return dtAmbil;
    }

    public void setDtAmbil(Date dtAmbil) {
        this.dtAmbil = dtAmbil;
    }

    public Date getDtBayar() {
        return dtBayar;
    }

    public void setDtBayar(Date dtBayar) {
        this.dtBayar = dtBayar;
    }

    public String getKandang() {
        return kandang;
    }

    public void setKandang(String kandang) {
        this.kandang = kandang;
    }

    public String getNamaCust() {
        return namaCust;
    }

    public void setNamaCust(String namaCust) {
        this.namaCust = namaCust;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}

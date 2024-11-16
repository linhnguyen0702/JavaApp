/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author linhy
 */
public class PhongInfo implements Serializable{
    private int id_phong;
    private int id_name;
    private String Loaitin;
    private String Loaiphong;
    private double Giaphong;
    private String Diaci;
    private String Dientich;
    private String Anh;

    public int getId_phong() {
        return id_phong;
    }

    public void setId_phong(int id_phong) {
        this.id_phong = id_phong;
    }

    public int getId_name() {
        return id_name;
    }

    public void setId_name(int id_name) {
        this.id_name = id_name;
    }

    public String getLoaitin() {
        return Loaitin;
    }

    public void setLoaitin(String Loaitin) {
        this.Loaitin = Loaitin;
    }

    public String getLoaiphong() {
        return Loaiphong;
    }

    public void setLoaiphong(String Loaiphong) {
        this.Loaiphong = Loaiphong;
    }

    public double getGiaphong() {
        return Giaphong;
    }

    public void setGiaphong(double Giaphong) {
        this.Giaphong = Giaphong;
    }

    public String getDiaci() {
        return Diaci;
    }

    public void setDiaci(String Diaci) {
        this.Diaci = Diaci;
    }

    public String getDientich() {
        return Dientich;
    }

    public void setDientich(String Dientich) {
        this.Dientich = Dientich;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public PhongInfo(int id_phong, int id_name, String Loaitin, String Loaiphong, double Giaphong, String Diaci, String Dientich, String Anh) {
        this.id_phong = id_phong;
        this.id_name = id_name;
        this.Loaitin = Loaitin;
        this.Loaiphong = Loaiphong;
        this.Giaphong = Giaphong;
        this.Diaci = Diaci;
        this.Dientich = Dientich;
        this.Anh = Anh;
    }

   

    public PhongInfo() 
    {
    }
    
    
    
}

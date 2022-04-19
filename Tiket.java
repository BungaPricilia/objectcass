/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancee;

/**
 *
 * @author Bunga Pricilia H
 */
public class Tiket extends Customer {
    private String Kode;
    private int HargaTiket;
    private String Jam;
    
    public String getKode(){
        return this.Kode;
    }
    public void setKode(String kd){
        this.Kode = kd;
    }
    
    public int getHarga(){
        return this.HargaTiket;
    }
    
    public void setHarga(int hrg){
        this.HargaTiket = hrg;
    }
    
    public String getWaktu(){
        return this.Jam;
    }
    public void setWaktu(String Waktu){
        this.Jam = Waktu;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritancee;

/**
 *
 * @author Bunga Pricilia H
 */

 public class Customer {
    protected String CustomerNama;
    protected String CustomerPhone;
    
    public String getNama(){
        return this.CustomerNama;
    }
    
    public void setNama(String n){
        this.CustomerNama = n;
    }
    
    public String getTelepone(){
        return this.CustomerPhone;
    }
   public void setTelepone(String t){
       this.CustomerPhone = t;
    }   
 }

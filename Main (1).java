package com.mycompany.polymorphismee;

class Aritmatika{
    void Penjumlahan (int a){
        System.out.println("a : "+a);
    }
    
    void Penjumlahan (int a, int b){
        System.out.println("a dan b :"+a+","+b);
    }
    
    double Penjumlahan (double a){
        return a+a;
    }
}

public class Main {
    public static void Main(String[] args){
        double hasil;
        Aritmatika objl = new Aritmatika ();
        
        objl.Penjumlahan(5);
        objl.Penjumlahan(5, 7);
        hasil = objl.Penjumlahan(4.5d);
        System.out.println("Nilai Hasil :"+hasil);   
    }
    
}

package inheritancee;


import java.util.Scanner;
/**
 *
 * @author Bunga Pricilia 
 */
public class Main {
    public static void main(String[] args){
        String Kode;
        String Jam;
        int Harga = 65000;
        Scanner input = new Scanner(System.in);
        Tiket user = new Tiket();
        System.out.println("Pemesanan Tiket Bioskop ");
        System.out.println("Masukkan Nama           :");
        String nama =input.next();
        System.out.println("Masukkan Nomor Telepone :");
        String nomor =input.next();
        
        user.setNama(nama);
        user.setTelepone(nomor);
        
        System.out.println("Piliha Film :");
        System.out.println("1. Film 1");
        System.out.println("2. Film 2");
        System.out.println("3. Film 3");
        System.out.print("Masukkan Pilihan :");  
        int a = input.nextInt();
        if(a==1){
            Kode = "A12";
        }else if (a==2){
            Kode = "A33"; 
        }else {
            Kode ="B31";
        }
        
        System.out.println("Pilihan Jam Film :");
        System.out.println("1. 14.30");
        System.out.println("2. 16.00");
        System.out.println("3. 18.30");
        System.out.println("Masukkan Pilihan :");
        int b = input.nextInt();
        if(b==1){
            Jam = "14.30";
        }else if(b==2){
            Jam = "16.00";
        }else {
            Jam = "18.30";
        }
        user.setKode(Kode);
        user.setWaktu(Jam);
        user.setHarga(Harga);
        
        System.out.println("'''''''''''''''''''PEMESANAN'''''''''''''''''''");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("Customer Nama/t/t: "+user.getNama());
        System.out.println("Customer Phone/t/t:"+user.getTelepone());
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("Kode Film/t/t:     "+user.getKode());
        System.out.println("Jam Film/t/t:      "+user.getWaktu());
        System.out.println("Harga Tiket/t/t:   "+user.getHarga()+"Rupiah");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("/n");
        
    }
}

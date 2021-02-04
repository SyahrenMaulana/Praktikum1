
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
        String pilih;
        
        System.out.println("Selamat Datang di Kelas Menghitung");
        System.out.println("==============");
        
        Persegi oke = new Persegi();
        Lingkaran iya = new Lingkaran();
        
        System.out.println("Pilih Persegi atau Lingkaran : ");        
        pilih = input.nextLine();
        
        switch(pilih){
            case "persegi":
                oke.hitung();
                break;
            case "lingkaran":
                iya.hitung();
                break;
            default:
                System.out.println("Maaf Hanya Dapat Menghitung Luas Persegi dan Lingkaran Saja");
            
        }
    }
    
}

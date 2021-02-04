
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
public class Lingkaran {
    void hitung(){
        Scanner input = new Scanner(System.in);
        //Deklarasi variabel
        double luas, phi = 3.14;
        int r;
        
        //Input nilai jari-jari
        System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();
        //Menghitung luas lingkaran
        luas = phi*r*r;

        //Tampilkan hasil
        System.out.println("Luas Lingkaran = "+luas);
    }
}

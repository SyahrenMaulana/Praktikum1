
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
public class Persegi {
    void hitung(){
        Scanner input = new Scanner (System.in);
        int sisi, luas;
        
        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = input.nextInt();
        
        luas = sisi * sisi;
        
        System.out.println("Luas Persegi adalah " + luas);
    }
}

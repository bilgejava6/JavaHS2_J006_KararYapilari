package com.muhammet;

import java.util.Scanner;

public class Runner_SwitchCase {
    public static void main(String[] args) {
        /**
         * switch(durum){
         *  case 1.durum: işlem; break;
         *  case 2.durum: diğer işlem; break;
         *  default: işlem ; break;
         *
         *}
         */
        System.out.println("""
                **** İŞLEMLER ******
                1- Toplama
                2- Çıkartma
                3- ÇArpma
                4- Bölme
                5- Mod Alma
                0- ÇIKIŞ                
                """);
        System.out.print("lütfen seçiniz...: ");
        int secim = new Scanner(System.in).nextInt();
        if(secim==1) System.out.println("Toplama yapıldı");
        else if(secim==2) System.out.println("Çıkartma yapıldı");
        else if(secim==3) System.out.println("Çarpma yapıldı");
        else if(secim==4) System.out.println("Bölme yapıldı");
        else if(secim==5) System.out.println("Mod alma yapıldı");
        else if(secim==0) System.out.println("ÇIKIŞ yapıldı");
        else System.out.println("Geçersiz seçim yaptınız");

        switch (secim){
            case 1: 
                System.out.println("Toplama yapıldı");
                int yenisayi = 5+9;
                int toplam = yenisayi * 9 + 988;
                System.out.println(toplam);
                break;
            case 2: System.out.println("Çıkartma yapıldı"); break;
            case 3: System.out.println("Çarpma yapıldı"); break;
            case 4: System.out.println("Bölme yapıldı"); break;
            case 5: System.out.println("Mod alma yapıldı"); break;
            case 0: System.out.println("ÇIKIŞ yapıldı"); break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız.");
        }
    }
}

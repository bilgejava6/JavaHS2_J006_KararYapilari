package com.muhammet;

import java.util.Scanner;

public class Runner_If_Ornek5 {
    public static void main(String[] args) {
        int s1,s2,sonuc,secim;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("""
                *******************
                **   İŞLEMLER    **
                1- Toplama
                2- Çıkartma
                3- Çarpma
                4- Bölme
                0- ÇIKIŞ
                """);
            System.out.print("Lütfen seçiniz.....: ");
            secim = sc.nextInt();
            if(secim == 1){
                System.out.println("** TOPLAMA İŞLEMİ **");
                System.out.print("1. sayıyı giriniz...: ");
                s1 = sc.nextInt();
                System.out.print("2. sayıyı giriniz...: ");
                s2 = sc.nextInt();
                sonuc = s1+s2;
                System.out.println("iki sayının toplamı...: "+ sonuc);
            }else if(secim == 2){
                System.out.println("** ÇIKIRTMA İŞLEMİ **");
                System.out.print("1. sayıyı giriniz...: ");
                s1 = sc.nextInt();
                System.out.print("2. sayıyı giriniz...: ");
                s2 = sc.nextInt();
                sonuc = s1-s2;
                System.out.println("iki sayının farkı...: "+ sonuc);
            }else if(secim == 3){

            }else if(secim == 4){

            }else if(secim == 0){
                System.out.println("ÇIKIŞ YAPILDI");
            }else{
                System.out.println("Lütfen geçerli bir seçim yapınız.[0-4]");
            }

        }while (secim!=0);




        System.out.println("UYGULAMA SONLANDI...");
    }
}

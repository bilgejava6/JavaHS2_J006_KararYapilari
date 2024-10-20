package com.muhammet;

import java.util.Scanner;

public class Runner_If_Ornek1 {
    public static void main(String[] args) {
        /**
         * kullanıcıdan alınan vize ve final notlarının ortalamasına göre öğrencinin
         * geç-kaldı sonucunu bulan kod - 65+
         */
        int vizeNotu, finalNotu, ortalama;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen vize notunuzu giriniz....: ");
        vizeNotu = sc.nextInt();
        System.out.print("Lütfen final notunuzu giriniz....: ");
        finalNotu = sc.nextInt();
        ortalama = (vizeNotu+finalNotu)/2;
        if(ortalama>=65){
            System.out.println("GEÇTİN");
        }else{
            System.out.println("KALDIN");
        }

    }
}

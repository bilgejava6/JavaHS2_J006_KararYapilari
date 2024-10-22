package com.muhammet;

import java.util.Scanner;

public class Runner_Switch_Ornek2 {
    public static void main(String[] args) {
        int secim;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("""
                **** Otel Otomayon ****
                1- Kayıt
                2- Müşteri Arama
                3- Oda Ekleme
                4- Oda Listesi
                5- Oda Arama
                6- Raporlama
                0- ÇIKIŞ
                """);
            System.out.print("Lütfen seçiniz......: ");
            secim = sc.nextInt();
            switch (secim) {
                case 1: System.out.println("");break;
                case 2: System.out.println("");break;
                case 3: System.out.println("");break;
                case 4: System.out.println("");break;
                case 5: System.out.println("");break;
                case 6: System.out.println("");break;
                case 0: System.out.println("");break;
                default: System.out.println("");break;
            }
        }while (secim!=0); // diyelim 1 seçtim -> 1 0 a eşit değil midir? EVET - true


    }
}

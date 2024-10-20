package com.muhammet;

import java.util.Scanner;

public class Runner_If_Ornek7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("pozitif bir sayı girinix....: ");
        int sayi = scanner.nextInt();

//        for (int i=0;i<sayi;i++){
//            for (int j=0;j<sayi;j++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }

        /**
         * Tek for ile nasıl çözülür?
         */
        /**
         * pozitif bir sayı giriniz...: 5
         *    i=1
         *      *  *  *  *  *
         *      *  *  *  *  *
         *      *  *  *  *  *
         *      *  *  *  *  *
         *      *  *  *  *  *
         * şeklinde çıktı veren kodu yazınız.
         */
        for (int i=1;i<=sayi*sayi;i++){
            System.out.print("*  ");
            if(i % sayi == 0) // i sayi ya tam bölünüyor ise
                System.out.println();
        }



    }
}

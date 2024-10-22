package com.muhammet;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        /**
         * 1- aşağıdaki şekli çizen kodu yazınız
         *   *  *  *  *  *
         *   *           *
         *   *           *
         *   *           *
         *   *  *  *  *  *
         *           System.out.print("bir sayı giriniz....: ");
         *         int x = new Scanner(System.in).nextInt();
         *         for(int i=1; i<=x*x;i++){
         *             if(i<=x|| i>(x-1)*x || i%x==1 || i%x==0)
         *                 System.out.print("*  ");
         *             else
         *                 System.out.print("   ");
         *
         *             if(i%x==0) System.out.println();
         *         }
         *
         * 2- x....n e kadar olan sayılar içindeki ASAL sayıları bulan kodu yazınız.
         *         int x = 40, n = 9_000_000;
         *         for(int i=x;i<=n;i++){ // i=40
         *             boolean bolunuyorMu = false;
         *             for(int j=2;j<=i/2;j++){ // j=2, i=40
         *                 if(i%j==0){
         *                     bolunuyorMu = true;
         *                     break; // döngüyü sonlandırır.
         *                 }
         *             }
         *             // ? i asal mıdır?
         *             if(!bolunuyorMu) System.out.println(i);
         *         }
         * 3- 4 basamaklı sayıların basamak değerlerini bulup ekrana yazdıran kodu yanız
         * ÖRN:
         * 4589 => binler: 4, yüzler: 5, onlar: 8 , birler: 9
         *         int sayi = 4589;
         *         int birler = sayi % 10;
         *         System.out.println("birler..: "+birler);
         *         int onlar = (sayi/10) % 10;
         *         System.out.println("onlar.: "+onlar);
         *         int yuzler = (sayi/100) % 10;
         *         System.out.println("yuzler..: "+yuzler);
         *         int binler = (sayi / 1000);
         *         System.out.println("binler..: "+binler);
         *
         * 4- aşağıdaki şekli çizen kodu yazınız.
         * bir sayı gir: 4
         *i=1          1
         *i=2         2 2
         *i=3        3 3 3
         *i=4       4 4 4 4
         *
             Scanner scanner = new Scanner(System.in);
             System.out.print("bir sayı giriniz...: ");
             int sayi = scanner.nextInt();

             for (int i=1; i<=sayi; i++) {  // değeri dönüyor 1....sayi
             for(int j=i; j<=sayi-1;j++){ // boşluk
             System.out.print(" ");
             }
             for (int k=1;k<=i;k++){
             System.out.print(i+" ");
             }
             System.out.println();
             }

         */



    }
}

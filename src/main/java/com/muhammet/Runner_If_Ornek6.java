package com.muhammet;

import java.util.Scanner;

public class Runner_If_Ornek6 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir sayı alarak aşağıdaki görseli elde edecek bir
         * kodlamayı yazpınız.
         * ÖRN;
         * 5-10 arası bir sayı giriniz...: 6
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 1 2 3 4 5 6
         *
         */
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz.[5-10]...: ");
        sayi = scanner.nextInt();
        for(int i = 1; i<=sayi; i++){ // i=3, 1....n
            for(int j=1; j<=i;j++){// j=4
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

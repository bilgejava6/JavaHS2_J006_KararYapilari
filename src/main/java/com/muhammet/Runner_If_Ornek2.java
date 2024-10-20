package com.muhammet;

import java.util.Scanner;

public class Runner_If_Ornek2 {
    public static void main(String[] args) {
        /**
         * kullanıcıdan alınan 2 sayıdan hangisinin büyük olduğunu bulan kodu yazınız.
         */
        int s1,s2,enb;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayı....: ");
        s1 = scanner.nextInt();
        System.out.print("2. sayı....: ");
        s2 = scanner.nextInt();
        enb = s1;
        if(enb<s2){
            enb = s2;
        }
        System.out.println("En büyük sayı...: "+ enb);

//        if(s1>s2){
//            System.out.println("Büyük sayı...: "+ s1);
//        }else{
//            System.out.println("Büyük sayı...: "+ s2);
//        }

    }
}

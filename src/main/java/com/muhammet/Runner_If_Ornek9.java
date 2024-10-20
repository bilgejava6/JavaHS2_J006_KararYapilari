package com.muhammet;

import java.util.Scanner;

public class Runner_If_Ornek9 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan 3 adet sayı alıyoruz ve bu sayıların en büyük ve en küçük olanlarını
         * buluyoruz, sonra en büyük sayı ile en küçük sayı arasındaki farkı bulup
         * ekrana;
         * EnBüyük sayı: X, EnKüçük sayı: Y, aralarındaki fark: Z
         * şeklinde çıktı yapan kodu yazınız.
         */
        //  5  1   9
        int s1,s2,s3, enk,enb,fark;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz....: ");
        s1 = sc.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz....: ");
        s2 = sc.nextInt();
        System.out.print("Lütfen 3. sayıyı giriniz....: ");
        s3 = sc.nextInt();
        enk = s1;
        enb = s1;
        if(enk>s2) enk = s2;
        if(enk>s3) enk = s3;
        if(enb<s2) enb = s2;
        if(enb<s3) enb = s3;
        fark = enb - enk;
        System.out.print("En büyük sayı....: "+ enb);
        System.out.print(" - En küçük sayı....: "+ enk);
        System.out.print(" - Enbüyük ile enküçük sayının farkı....: "+ fark);

    }
}

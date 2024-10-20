package com.muhammet;

public class Runner_If_Ornek8 {
    public static void main(String[] args) {
        /**
         * 1 ile 100 arasındaki tek sayıların adedini bulan kodu yazınız.
         * 1,3,5,7,9 => 5 adet
         */
        int sayac=0;
        for (int i = 1; i <= 10; i++) {
            if(i%2==1)
                sayac++;
        }
        System.out.println("Tek sayı adedi...: "+ sayac);
    }
}

package com.muhammet;

public class Runner_If_Ornek4 {
    public static void main(String[] args) {
        /**
         * 1 ile 100 arasındaki 5 veya 8 e bölünen sayıları bulunuz
         *
         */
        for (int i = 1; i <= 100; i++) {
            if(i % 5 == 0){ // i sayısı 5 e bölündüğünde kalan 0 ise
                System.out.println("5 bölünüyor...: "+ i);
            }
            if(i % 8 == 0 ){
                System.out.println("8 e bölünüyor....: "+ i);
            }
        }
        System.out.println("--------------------------------");
        for (int i = 1; i <= 100; i++) {
            if(i % 5 == 0 || i % 8 == 0){
                System.out.println("5 e veya 8 e bölünüyor...: "+ i);
            }

        }
        System.out.println("---------  8 ve 5 aynı anda bölünenler -----------------------");
        for (int i = 1; i <= 100; i++) {
            if(i % 5 == 0 && i % 8 == 0){
                System.out.println("5 e ve 8 e bölünüyor...: "+ i);
            }
        }

    }
}

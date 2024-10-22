package com.muhammet;

import java.util.Scanner;

public class Runner_Switch_Ornek1 {
    public static void main(String[] args) {
        /**
         * 1...12 yılın ayları vardır, kullanıcı bu aralıkta bir rakam seçtiğinde
         * o rakama karşılık gelen ayı yazdıran switch..case kodunu yazınız.
         */
        System.out.print("Lütfen ay giriniz...: ");
        int ay = new Scanner(System.in).nextInt();
        switch (ay) {
            case 1: System.out.println("OCAK");break;
            case 2: System.out.println("SUBAT");break;
            case 3: System.out.println("MART");break;
            default:
                System.out.println("LÜTFEN GEÇERLİ BİR SEÇİM YAPINIZ");
        }

        switch (ay){ // JavaSE 14+
            case 12,1,2 : System.out.println("KIŞ"); break;
            case 3,4,5 : System.out.println("İLK BAHAR"); break;
            case 6,7,8 : System.out.println("YAZ"); break;
            case 9,10,11 : System.out.println("SON BAHAR"); break;
            default: System.out.println("LÜTFEN GEÇERLİ BİR SEÇİM YAPINIZ");
        }

        String mevsim;

        mevsim = switch (ay){
            case 12,1,2 -> "KIŞ";
            case 3,4,5 -> "İLK BAHAR";
            case 6,7,8 -> "YAZ";
            case 9,10,11 -> "SON BAHAR";
            default -> "";
        };
        System.out.println("return type....: "+ mevsim);
    }
}

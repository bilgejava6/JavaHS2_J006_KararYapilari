package com.muhammet;

public class Runner_If_Ornek3 {
    public static void main(String[] args) {
        /**
         * öğrencilerin ortalama notlarının harf karşılıklarını bulan kodu yazınız
         * for -> {} kullanmaz isek ; e kadar olan ksıım for a dahildir.
         */
        int ort = 76;
        if(ort<=10)         System.out.println("FF");
        else if(ort<=20)    System.out.println("FD");
        else if(ort<=30)    System.out.println("DD");
        else if(ort<=40)    System.out.println("DC");
        else if(ort<=50)    System.out.println("CC");
        else if(ort<=60)    System.out.println("CB");
        else if(ort<=70)    System.out.println("BB");
        else if(ort<=80)    System.out.println("BA");
        else                System.out.println("AA");

    }
}

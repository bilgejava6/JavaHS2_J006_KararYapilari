package com.muhammet;

import java.util.Random;

public class Runner_If_Ornek10 {
    public static void main(String[] args) {
        /**
         * rastgele olarak sayı üretmek için Random sınıfı kullanılır.
         * Random rd = new Random(100) ya da
         * rd.next(100); şeklinde
         * Buna göre bir oyun tasarlıyoruz. Rastgele bir sayı seçiyoruz
         * kullanıcının seçtğimiz sayıyı tahmin edebilmesi için
         * ona yukarı ya da aşağı diye yönlendirme yapmamız gerekiyor.
         * kullanıcı sayıyı bulana kadar böyle devam ediyoruz.
         * ÖRN:
         * pc -> 57
         * bir sayı tahmin edin: 40
         * bilmediniz YUKARI
         * bir sayı tahmin edin: 76
         * bilmediniz AŞAĞI
         * bir sayı tahmin deiniz: 57
         * TEBRİKLER BİLDİNİZ.
         *
         */
        Random random =  new Random();
        int Pc_Sayisi = random.nextInt(100);

    }
}

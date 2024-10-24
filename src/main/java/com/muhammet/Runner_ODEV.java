package com.muhammet;

import java.util.Scanner;

public class Runner_ODEV {
    public static void main(String[] args) {
        /**
         *
         *  . . . . .
         *  . . . . .
         *  . . * . .
         *  . . . . .
         *  . . . . .
         *      8
         *   4     6
         *      2
         *  yön seçiniz: 2
         *  . . . . .
         *  . . . . .
         *  . . . . .
         *  . . * . .
         *  . . . . .
         *  yön seçiniz: 2
         *  . . . . .
         *  . . . . .
         *  . . . . .
         *  . . . . .
         *  . . * . .
         * yön seçiniz: 2
         *  . . * . .
         *  . . . . .
         *  . . . . .
         *  . . . . .
         *  . . . . .
         *
         * yön seçiniz: 6
         *    1 2 3 4 5
         *  1 . . . . .
         *  2 . . . . .
         *  3 . . * . .
         *  4 . . . . .
         *  5 . . . . .
         */
        int noktaSayisi= 5;
        int x=noktaSayisi/2+1, y=noktaSayisi/2+1;
        Scanner sc = new Scanner(System.in);
        int secim;
        do{
            for(int j=1;j<=noktaSayisi;j++){
                for(int i=1; i<=noktaSayisi;i++){
                    if(x==i && y==j)
                        System.out.print("*  ");
                    else
                        System.out.print(".  ");
                }
                System.out.println();
            }
            System.out.print("""
                        8
                      4   6
                        2 
                    Çıkış: 0    
                    Lütfen hareket etmek için seçiniz...:      
                    """);
            secim = sc.nextInt();
            switch (secim){
                case 6: x = x==noktaSayisi ? 1 : x+1;  break;
                case 4: x = x==1 ? noktaSayisi : x-1; break;
                case 8: y = y==1 ? noktaSayisi : y-1; break;
                case 2: y = y==noktaSayisi ? 1 : y+1; break;
            }
        }while (secim!=0);

        /**
         *  ternary operator ?
         *  durum[true/false] ? doğru ise bunu yap : değil ise bunu yap
         *
         */




    }
}

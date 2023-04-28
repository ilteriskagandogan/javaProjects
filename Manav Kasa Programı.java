/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        double armut = 2.14 ,elma = 3.67,domates =1.11 ,muz =0.95 ,patlican =5 ,toplam, arm,elm,dom,mz,pat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen armut (kilogram cinsinden) miktarı giriniz: ");
        arm = inp.nextDouble();
        System.out.print("Lütfen elma (kilogram cinsinden) miktarı giriniz: ");
        elm = inp.nextDouble();
        System.out.print("Lütfen domates (kilogram cinsinden) miktarı giriniz: ");
        dom = inp.nextDouble();
        System.out.print("Lütfen muz (kilogram cinsinden) miktarı giriniz: ");
        mz = inp.nextDouble();
        System.out.print("Lütfen patlıcan (kilogram cinsinden) miktarı giriniz: ");
        pat = inp.nextDouble();

        toplam = (arm*armut)+(elm*elma)+(dom*domates)+(mz*muz)+(pat*patlican);

        System.out.println("Ödenmesi gereken tutar: " + toplam + " ₺");
    }
}

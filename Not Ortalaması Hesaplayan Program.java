/*
Not Ortalaması Hesaplayan Program

Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        double mat, fiz, kim, tur, trh, muz,ort,top;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu gir lutfen: ");
        mat = inp.nextDouble();
        System.out.print("Fizik notunu gir lutfen: ");
        fiz = inp.nextDouble();
        System.out.print("Kimya notunu gir lutfen: ");
        kim = inp.nextDouble();
        System.out.print("Turkce notunu gir lutfen: ");
        tur = inp.nextDouble();
        System.out.print("Tarih notunu gir lutfen: ");
        trh = inp.nextDouble();
        System.out.print("Muzik notunu gir lutfen: ");
        muz = inp.nextDouble();

        top = (mat+fiz+kim+tur+trh+muz);
        ort = top/6;
        System.out.println("Ortalamaniz :" + Math.ceil(ort));
        System.out.println(ort>=60? "Gectiniz" : "Kaldiniz");
    }
}

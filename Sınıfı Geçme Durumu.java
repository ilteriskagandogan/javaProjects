/*
Pratik - Sınıfı Geçme Durumu

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat, fiz, tur, kim, muz;
        double ort;

        System.out.println("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fiz = inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        tur = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kim = inp.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muz = inp.nextInt();

        ort = (mat + fiz + tur + kim + muz) / 5;

        if (mat > 0 && fiz > 0 && tur > 0 && kim > 0 && muz > 0 && mat < 100 && fiz < 100 && tur < 100 && kim < 100 && muz < 100) {
            if (ort > 55) {
                System.out.println("Sınıfı geçtiniz, tebrikler.");
            } else {
                System.out.println("Sınıfta kaldınız.");
            }
            System.out.println("Ortalamanız: " + ort);
        } else {
            System.out.println("Yanlış not girdiniz.");
        }
    }
}
/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        double boy,kilo,kitleIndex;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        kitleIndex = kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz: " + kitleIndex);
    }
}

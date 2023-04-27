/*
Dik Üçgende Hipotenüs Bulan Program

Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        double a, b,c,cevre,alan;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dik a kenarının uzunluğunu giriniz: ");
        a = inp.nextDouble();
        System.out.print("Dik b kenarının uzunluğunu giriniz: ");
        b = inp.nextDouble();

        c = Math.sqrt(a*a+b*b);
        cevre = (a+b+c);
        alan = (a*b)/2;

        System.out.println("Hipotenüs uzunluğu: " + c);
        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);

    }
}

// Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

/*
import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        double a, b, c,d, cevre,alan;
        Scanner inp = new Scanner(System.in);

        System.out.print("a kenarının uzunluğunu giriniz: ");
        a = inp.nextDouble();
        System.out.print("b kenarının uzunluğunu giriniz: ");
        b = inp.nextDouble();
        System.out.print("c kenarının uzunluğunu giriniz: ");
        c= inp.nextDouble();

        cevre = (a+b+c);
        d = cevre/2;
        alan = Math.sqrt(d*(d-a)*(d-b)*(d-c));

        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
*/

/*
Pratik - Sayıları Büyükten Küçüğe Sıralama

Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a, b, c;

        System.out.println("İlk sayı giriniz: ");
        a = inp.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        b = inp.nextDouble();
        System.out.println("Üçüncü sayıyı giriniz: ");
        c = inp.nextDouble();

        if (a < b && a < c && b < c) {
            System.out.println("Küçükten büyüğe doğru şu şekilde sıralanır: " + a + "," + b + "," + c);
        } else if (a < b && a < c && c < b) {
            System.out.println("Küçükten büyüğe doğru şu şekilde sıralanır: " + a + "," + c + "," + b);
        } else if (b < a && b < c && c < a) {
            System.out.println("Küçükten büyüğe doğru şu şekilde sıralanır: " + b + "," + c + "," + a);
        } else if (b < a && b < c && a < c) {
            System.out.println("Küçükten büyüğe doğru şu şekilde sıralanır: " + b + "," + a + "," + c);
        } else if (b < a && c < b && c < a) {
            System.out.println("Küçükten büyüğe doğru şu şekilde sıralanır: " + c + "," + b + "," + a);
        } else if (a < b && c < a && c < b) {
            System.out.println("Küçükten büyüğe doğru şu şekilde sıralanır: " + c + "," + a + "," + b);
        }
    }
}
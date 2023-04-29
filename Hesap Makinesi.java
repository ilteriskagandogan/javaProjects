/*
Pratik - Hesap Makinesi

Hesap makinesini switch-case kullanarak yapınız.
*/
import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a,b,sonuc = 0;
        int op;

        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextDouble();

        System.out.println("Toplama için 1 seçiniz.");
        System.out.println("Çıkarma için 2 seçiniz.");
        System.out.println("Bölme için 3 seçiniz.");
        System.out.println("Çarpma için 4 seçiniz.");

        System.out.print("İşlem seçiniz: ");
        op = inp.nextInt();

        switch (op) {
            case 1:
                sonuc = (a+b);
                break;
            case 2:
                sonuc = (a-b);
                break;
            case 3:
                sonuc = (a/b);
                break;
            case 4:
                sonuc = (a*b);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }

        System.out.println("Sonucunuz: " + sonuc);
    }
}
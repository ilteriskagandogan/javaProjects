/*
Pratik - Hava Sıcaklığına Göre Etkinlik Önerme
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sec;

        System.out.println("Sıcaklık 5'ten küçük ise lütfen 1 yazın.");
        System.out.println("Sıcaklık 5 ile 15 arasında ise lütfen 2 yazın.");
        System.out.println("Sıcaklık 15 ile 25 arasında ise lütfen 3 yazın.");
        System.out.println("Sıcaklık 25'ten büyük ise lütfen 4 yazın.");
        sec = inp.nextInt();

        switch (sec) {
            case 1:
                System.out.println("Bu havada kayak yapabilirsiniz.");
                break;
            case 2:
                System.out.println("Bu havada sinemaya gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Bu havada pikniğe gidebilirsiniz.");
                break;
            case 4:
                System.out.println("Bu havada yüzmeye gidebilirsiniz.");
                break;
            default:
                System.out.println("Yanlış değer girdiniz.");
        }
    }
}
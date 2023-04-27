/*
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;

Proje
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %80 olarak KDV tutarı hesaplayan programı yazınız.
*/
import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        double para, kdvtut, kdvli;
        Scanner inp = new Scanner(System.in);

        System.out.print("Para miktarını gir lütfen: ");
        para = inp.nextDouble();

        if (0<para && para<1000) {
            kdvtut = (para * 0.18);
            kdvli = (kdvtut + para);

            System.out.println("KDV tutarı = " + kdvtut + "₺");
            System.out.println("KDVli toplam = " + kdvli + "₺");
        } else if (1000<=para) {
            kdvtut = (para * 0.8);
            kdvli = (kdvtut + para);

            System.out.println("KDV tutarı = " + kdvtut + "₺");
            System.out.println("KDVli toplam = " + kdvli + "₺");
        } else {
            System.out.println("Yanlış tutar girdiniz");
        }
    }
}

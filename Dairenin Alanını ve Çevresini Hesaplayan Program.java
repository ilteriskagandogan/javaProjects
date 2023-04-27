/*
Dairenin Alanını ve Çevresini Hesaplayan Program

Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanını ve çevresini bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.
*/

import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        double r,cevre,alan, pi = 3.14,aci;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextDouble();
        System.out.print("Merkez açının ölçüsü: ");
        aci = inp.nextDouble();

        if (aci==360){
            cevre =2*pi*r;
            System.out.println("Dairenin çevresi: " + cevre);
        } else if (aci<360 && aci>0){
            cevre =((aci/360)*2*pi*r)+2*r;
            System.out.println("Dairenin çevresi: " + cevre);
        } else {
            System.out.println("Yanlış açı girdiniz");
        }

        alan = (r*r*pi)*aci/360;
        System.out.println("Dairenin alanı: " + alan);
    }
}

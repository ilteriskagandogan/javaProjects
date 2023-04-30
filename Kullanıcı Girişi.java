/*
Pratik - Kullanıcı Girişi

Kullanıcı adı ve şifrenin istendiği bir program.
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,  lütfen başkaşifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

*/
import java.util.Scanner;

public class PatikaTest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String user, passw, yeniPassw, yeniUser;
        int secim;

        System.out.print("Kullanıcı adınızı giriniz: ");
        user = inp.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        passw = inp.nextLine();

        if (user.equals("deneme") && passw.equals("deneme123")) {
            System.out.println("Doğru giriş yaptınız.");
        } else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış!");

            System.out.println("Ne yapmak istedinizi girin: ");
            System.out.println("Şifrenizi sıfırlamak için 1");
            System.out.println("Kullanıcı adınızı değiştirmek için 2");
            secim = inp.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Lütfen yeni şifrenizi giriniz: ");
                    yeniPassw = inp.next();
                    if (yeniPassw.equals("deneme123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.print("Yeni kullanıcı adınızı giriniz: ");
                    yeniUser = inp.next();
                    if (yeniUser.equals("deneme")) {
                        System.out.println("Kullanıcı adınız oluşturulamadı, lütfen başka kullanıcı adı giriniz.");
                    } else {
                        System.out.println("Kullanıcı adınız oluşturuldu.");
                    }
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }
    }
}


import java.util.Scanner;


public class vücütKitleİndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kg,boy,vki,boyMetre,yas;
        System.out.println("Lütfen Boyunuzu (Santimetre Cinsinden) giriniz");
        boy = input.nextDouble();
        boyMetre = (boy / 100);
        System.out.println("Lütfen Kilonuz Giriniz");
        kg = input.nextDouble();
        System.out.println("Lütfen yaşınızı giriniz");
        yas = input.nextDouble();
        System.out.println("Vücut kitle indeksiniz=\t");
        vki = (kg / (boyMetre * boyMetre));
        System.out.println(vki);

        System.out.println("Sağlıklı Günler Dileriz");





    }
}

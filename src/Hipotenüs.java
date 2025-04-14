import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */
        System.out.println("Dik Üçgende Hipotenüs Hesaplayıcıya Hoş Geldiniz");
        // a = yatay uzunluk , b = dikey uzunluk , c = Hipotenüs , cevre = 2u , u = (a+b+c)/2
        double a,b,c,cevre,alan;
        System.out.println("Yatay kenar uzunluğunu giriniz:");
        a = input.nextDouble();

        System.out.println("Dikey kenar uzunluğunu giriniz:");
        b = input.nextDouble();

        System.out.println("Hipotenüs");
        c = Math.sqrt((a * a) + (b * b));
        System.out.println(c);

        System.out.println("Üçgenin Çevre uzunluğu");
        cevre = (a+b+c);
        System.out.println(cevre);

        System.out.println("Alan Hesaplayalım");
        alan = (a*b) /2 ;
        System.out.println("Üçgenin alanı\t" +alan);
        System.out.println("TEŞEKKÜRLER");





    }
}

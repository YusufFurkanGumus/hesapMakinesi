import java.util.Scanner;


public class daireninAlanıVeÇevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Yarıçapı r, merkez açısının ölçüsü a
        //Alan Formülü : π * r * r;
        //Çevre Formülü : 2 * π * r;

        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        //Bir merkez açıya karşılık gelen taralı kısmın alanı

        double π = 3.14, r , a , alan , cevre , taraliAlan;
        System.out.println("Dairenin yarı çap uzunluğu nedir?");
        r = input.nextDouble();

        System.out.println("Dairenin merkez açı ölçüsü nedir?");
        a = input.nextDouble();

       System.out.print("Dairenin Alanı=\t");
       alan = (π * (r * r));
       System.out.println(alan);

       System.out.print("Dairenin çevresi=\t");
       cevre = (2 * (π * r));
       System.out.println(cevre);

       System.out.println("Taralı Bölgenin alanı=\t");
       taraliAlan = ((π * (r * r)) * a) / 360;
       System.out.println(taraliAlan);









    }
}

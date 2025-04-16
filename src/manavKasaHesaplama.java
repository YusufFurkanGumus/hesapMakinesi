import java.text.DecimalFormat;

import java.util.Scanner;



public class manavKasaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //
        //Meyveler ve KG Fiyatları
        //
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        double armutToplam,elmaToplam,domatesToplam,muzToplam,patlıcanToplam,toplam;

        System.out.println("Kaç kilo aldığınızı yazınız");
        System.out.println("Armut kaç KG aldınız?");
        armutToplam = input.nextDouble();
        System.out.println("Elma kaç KG aldınız?");
        elmaToplam = input.nextDouble();

        System.out.println("Domates kaç KG aldınız?");
        domatesToplam = input.nextDouble();
        System.out.println("Muz kaç KG aldınız?");
        muzToplam = input.nextDouble();
        System.out.println("Patlıcan kaç KG aldınız?");
        patlıcanToplam = input.nextDouble();

        toplam = ((armutToplam * 2.14) + (elmaToplam * 3.67) + (domatesToplam * 1.11) + (muzToplam * 0.95) + (patlıcanToplam * 5.00));

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("Toplam Tutar: " + df.format(toplam) + " TL");
        System.out.println("Alışveriş için teşekkürler");



    }
}

import java.util.Scanner;


public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taksimetre Programı
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
        System.out.println("Taksiye hoş geldiniz");

        int km;
        double perKm = 2.20, total = 0  ,startPrice = 10;
        System.out.println("Mesafeyi KM cinsinden yazınız");
        km = input.nextInt();

        total += (startPrice + (km * perKm));

        System.out.println(total);






    }
}

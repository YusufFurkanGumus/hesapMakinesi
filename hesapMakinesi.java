import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int no1, no2, select;

        System.out.println("İlk sayıyı gir:");
        no1 = input.nextInt();

        System.out.println("İkinci sayıyı gir:");
        no2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İşlem seçiniz:");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (no1 + no2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (no1 - no2));
                break;
            case 3:
                System.out.println("Çarpma: " + (no1 * no2));
                break;
            case 4:
                if (no2 != 0) {
                    System.out.println("Bölme: " + ((double) no1 / no2));
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }

        input.close();
    }
}

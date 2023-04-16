import java.util.Scanner;
public class Ders {
    public static void main(String[] args) {

        int liyakat, adalet, egitim, sanat, ekonomi;
        Scanner input = new Scanner(System.in);

        System.out.print("Liyakat Notunuzu Giriniz : ");
        liyakat = input.nextInt();

        System.out.print("Adalet Notunuzu Giriniz : ");
        adalet = input.nextInt();

        System.out.print("Eğitim Notunuzu Giriniz : ");
        egitim = input.nextInt();

        System.out.print("Sanat Notunuzu Giriniz : ");
        sanat = input.nextInt();

        System.out.print("Ekonomi Notunuzu Giriniz : ");
        ekonomi = input.nextInt();

        int toplam = (liyakat + adalet + egitim + sanat + ekonomi);
        double sonuc = toplam / 5;
        System.out.println("Ortalamanız = " + sonuc);



        boolean kosul = sonuc >= 60;
        String str  = kosul ? "Geçti" : "Kaldı";
        System.out.println(str);

        /**
         * @author Erdem AYDEMİR
          */










    }
}

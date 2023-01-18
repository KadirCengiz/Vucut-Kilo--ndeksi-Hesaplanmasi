import java.util.Scanner;
public class indeks {
    public static void main(String[] args) {

        //Değişkenlerin girilmesi.

        double kilo,boy,vucutIndeks;

        //Kilo ve boy'un girilmesi.

        Scanner input=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        kilo= input.nextDouble();

        System.out.print("Boyunuzu giriniz: ");
        boy= input.nextDouble();

        //Vücut kilo indeksinin hesaplanması.

        vucutIndeks=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + vucutIndeks);
    }
}
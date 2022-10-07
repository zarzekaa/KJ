import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbe zjedzonych ciasteczek: ");
        int ciastka;
        ciastka = skaner.nextInt();

        int kalorie = 300;
        int porcja = 4;

        double lacznie = ciastka * kalorie / porcja;

        System.out.println("Lacznie zjadles " + lacznie + " kalorii");

    }
}

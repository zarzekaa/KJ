import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj cene detaliczna plyty:");
        int cena;
        cena = skaner.nextInt();

        double zysk = cena * 0.4;

        double caly = cena - zysk;

        System.out.println("Zysk ze sprzedazy: " + caly + "zl");

    }
}
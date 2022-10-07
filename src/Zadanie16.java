import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj cene posilku:");
        int cena;
        cena = skaner.nextInt();

        double podatek = cena * 0.06;
        double podatek_po = cena - podatek;

        int napiwek = 20;
        double napiwek_po = cena * 0.2;
        double cena_napiwek = cena - napiwek_po;

        double ogolna = podatek_po + napiwek_po;
        
        System.out.println("Cena posilku: " + cena);
        System.out.println("Cena z podatkiem: " + podatek_po);
        System.out.println("Cena z napiwkiem: " + cena_napiwek);
        System.out.println("Kwota do zaplaty: " + ogolna);

    }
}
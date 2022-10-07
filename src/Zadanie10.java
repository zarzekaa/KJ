import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj cene zakupu: ");
        int cena;
        cena = skaner.nextInt();

        double p_stanowy = cena * 0.04;
        double p_lokalny = cena * 0.02;

        double cena_po = cena * 0.06;

        System.out.println("Cena produktu: " + cena + "zl");
        System.out.println("Podatek stanowy: " + p_stanowy);
        System.out.println("Podatek lokalny: " + p_lokalny);

        double ostatnia_cena = cena + cena_po;

        System.out.println("Ostateczna cena: " + ostatnia_cena + "zl");


    }
}

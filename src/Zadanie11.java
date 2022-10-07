import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Wprowadz liczbe przejechanych kilometrow: ");
        int km;
        km = skaner.nextInt();

        System.out.println("Wprowadz liczbe zuzytych litrow paliwa: ");
        int litr;
        litr = skaner.nextInt();

        double kilometry = km / litr;

        System.out.println("Liczba kilometrow przejechanych na litrze: " + kilometry + "km");



    }
}

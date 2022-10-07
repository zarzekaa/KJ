import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj ulubione miasto:");
        String miasto;
        miasto = skaner.nextLine();

        System.out.println("Dlugosc znakow: " + miasto.length());
        System.out.println("Wielkimi literami: " + miasto.toUpperCase());
        System.out.println("Dlugosc znakow: " + miasto.toLowerCase());
        System.out.println("Pierwsza litera miasta: " + miasto.charAt(0));

    }
}
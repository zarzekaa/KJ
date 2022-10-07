import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj wyniki pierwszego testu");
        int pierwszy;
        pierwszy = skaner.nextInt();

        System.out.println("Podaj wyniki drugiego testu");
        int drugi;
        drugi = skaner.nextInt();

        System.out.println("Podaj wyniki trzeciego testu");
        int trzeci;
        trzeci = skaner.nextInt();

        double srednia = (pierwszy + drugi + trzeci) / 3;

        System.out.println("Twoje wyniki: " + pierwszy + "pkt, " + drugi + "pkt, " + trzeci + "pkt");
        System.out.println("Srednia twoich trzech testow: " + srednia);

    }
}

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String firstName;
        firstName = skaner.nextLine();

        System.out.println("Podaj drugie imie: ");
        String midName;
        midName = skaner.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastName;
        lastName = skaner.nextLine();

        String fullName = firstName + " " + midName + " " + lastName;

        char firstInitial = firstName.charAt(0);
        char midInitial = midName.charAt(0);
        char lastInitial = lastName.charAt(0);

        String inicjaly = firstInitial + "." + midInitial + "." + lastInitial;

        System.out.println("Nazywasz się: " + fullName + "\nTwoje inicjały to: " +  inicjaly);

    }
}

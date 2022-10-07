public class Zadanie5 {
    public static void main(String[] args) {

        int pierwsze_pomieszczenie, drugie_pomieszczenie, trzecie_pomieszczenie, czwarte_pomieszczenie, powierzchnia_całkowita, powierzchnia_jedna_osoba;

        pierwsze_pomieszczenie = 3 * 4;
        drugie_pomieszczenie = 3 * 4;
        trzecie_pomieszczenie = 2 * 3;
        czwarte_pomieszczenie = 2 * 2;

        powierzchnia_całkowita = pierwsze_pomieszczenie + drugie_pomieszczenie + trzecie_pomieszczenie + czwarte_pomieszczenie;
        powierzchnia_jedna_osoba = powierzchnia_całkowita / 4;

        System.out.println("--------------------------\nPowierzchnia pierwszego pomieszczenia: " + pierwsze_pomieszczenie + " m^2");
        System.out.println("Powierzchnia drugiego pomieszczenia: " + drugie_pomieszczenie + " m^2");
        System.out.println("Powierzchnia trzeciego pomieszczenia: " + trzecie_pomieszczenie + " m^2");
        System.out.println("Powierzchnia czwartego pomieszczenia: " + czwarte_pomieszczenie + " m^2");
        System.out.println("Powierzchnia całkowita: " + powierzchnia_całkowita + " m^2");
        System.out.println("Powierzchnia przypadająca na jedną osobę: " + powierzchnia_jedna_osoba + " m^2\n-----------------------------");
    }
}

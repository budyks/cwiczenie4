public class main {


    public static void main(String[] args) {
        SystemRezerwacji systemRezerwacji = new SystemRezerwacji();
        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);
        Klient klient = new Klient("Jan", "Pawel", "jp2@buziaczek.pl");
        systemRezerwacji.dodajWydarzenie(koncert);
        systemRezerwacji.dodajWydarzenie(teatr);
        systemRezerwacji.dodajRezerwacje(klient,koncert);
    }

}


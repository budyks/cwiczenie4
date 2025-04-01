import java.util.ArrayList;

public class SystemRezerwacji {

    private ArrayList<Wydarzenie> listaWydarzen = new ArrayList<>();

    private ArrayList<Klient> listaKlientów = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzen.add(wydarzenie);
        System.out.println(listaWydarzen.toString());
    }

    public void dodajWydarzenie() {
        Wydarzenie wydarzenie = new Wydarzenie("Wydarzenie-domyślne", 10);
        listaWydarzen.add(wydarzenie);
        System.out.println(listaWydarzen.toString());
    }

    public void dodajKlineta() {
        Klient klient = new Klient("Jan", "Kowalski", "kowalskijan@gmail.com");
        listaKlientów.add(klient);
        System.out.println(listaKlientów.toString());

    }

        public void dodajRezerwacje (Klient klient, Wydarzenie wydarzenie){
            klient.dodajRezerwację(wydarzenie);
        }


}

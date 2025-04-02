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

    public void dodajKlienta(Klient klient) {
            listaKlientów.add(klient);
            System.out.println("Dodano klienta: " + klient.getImię() + " " + klient.getNazwisko());
        }



        public void dokonajRezerwacji (Klient klient, Wydarzenie wydarzenie){
            klient.dodajRezerwacje(wydarzenie);
        }
        public Wydarzenie znajdzWydarzenie(String nazwa){
            for (int i = 0; i < listaWydarzen.size(); i++) {
                Wydarzenie wydarzenie = listaWydarzen.get(i);

                if (wydarzenie.getNazwa().equals(nazwa)) {
                    System.out.println("Znaleziono wydarzenie:");
                    System.out.println(wydarzenie);
                    return wydarzenie;
                }
            }
            return null;
        }
        public void znajdzKlineta(String nazwisko){
            for (int i = 0; i < listaKlientów.size(); i++) {
                Klient klient = listaKlientów.get(i);

                if (klient.getNazwisko().equals(nazwisko)) {
                    System.out.println("Znaleziono Klienta:");
                    System.out.println(klient);
                }
            }
        }
        public void zmienCeneWydarzenia(String nazwa, double nowaCena){
            for (int i = 0; i < listaWydarzen.size(); i++) {
                Wydarzenie wydarzenie = listaWydarzen.get(i);

                if (wydarzenie.getNazwa().equals(nazwa)) {
                    wydarzenie.setCena(nowaCena);
                    System.out.println("Cena wydarzenia " + nazwa + "została zmieniona na " + nowaCena + " zł.");
                    return;

                }
            }
        }



}

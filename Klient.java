import java.util.ArrayList;

    public class Klient {
        private String imię;
        private String nazwisko;
        private String email;
        private ArrayList<Wydarzenie> listaRezerwacji;

        public Klient(String imię, String nazwisko, String email, ArrayList<Wydarzenie> listaRezerwacji) {
            this.email = email;
            this.imię = imię;
            this.nazwisko = nazwisko;
            this.listaRezerwacji = listaRezerwacji;
        }

        public Klient(String imię, String nazwisko, String email) {
            this.email = email;
            this.imię = imię;
            this.nazwisko = nazwisko;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public ArrayList<Wydarzenie> getListaRezerwacji() {
            return listaRezerwacji;
        }

        public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
            this.listaRezerwacji = listaRezerwacji;
        }

        public String getImię() {
            return imię;
        }

        public void setImię(String imię) {
            this.imię = imię;
        }

        public void dodajRezerwację(Wydarzenie wydarzenie) {
            if (this.listaRezerwacji == null) {
                this.listaRezerwacji = new ArrayList<>();
            }
            this.listaRezerwacji.add(wydarzenie);
        }
        public void wyświetlRezerwacje(){
            System.out.println("Klinet: " + imię + " " + nazwisko +  " Wszystkie Rezerwacje: " + listaRezerwacji);
        }
        public void anulujRezerwację(Wydarzenie wydarzenie) {
            listaRezerwacji.remove(wydarzenie);
            System.out.println("Rezerwacja została anulowana.");
        }

    }



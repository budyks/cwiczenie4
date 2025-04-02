public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 0;
    private double cena;

    public Wydarzenie( String nazwa, double cena) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public Wydarzenie( String nazwa, double cena, String data) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.data = data;
    }

    public Wydarzenie( String nazwa, double cena, String data, String miejsce) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;

    }

    public double getCena() {
        return cena;

    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDostępneMiejsca() {
        return dostępneMiejsca;
    }

    public void setDostępneMiejsca(int dostępneMiejsca) {
        this.dostępneMiejsca = dostępneMiejsca;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String toString() {
        return "Wydarzenie: " + nazwa + ", data " + data + " , miejsce:" + miejsce + ", cena" + cena;

    }

    public void zarezerwujMiejsce() {
        if (dostępneMiejsca > 0) {
           dostępneMiejsca = dostępneMiejsca -1;
           System.out.println( "Twoje miejsce zostało zarezerwowane");
        } else {
            System.out.println("Brak dostępnych miejsc");

        }

    }

}


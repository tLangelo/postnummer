public class Postinfo {
    private int postnummer;
    private String bynavn;

    public Postinfo(int postnummer, String bynavn) {
        this.postnummer = postnummer;
        this.bynavn = bynavn;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public String getBynavn() {
        return bynavn;
    }

    @Override
    public String toString() {
        return "Postinfo | " +
                "Postnummer: '" + postnummer + '\'' +
                ", Bynavn: '" + bynavn + '\'' +
                '}';
    }
}

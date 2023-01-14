package SonstigeServices;

public class Mietwagen {

    int preisProTag;
    int buchungsdauer;  // in Tagen
    int preis;          // Gesamtpreis
    EMarke EMarke;

    public Mietwagen(int preisProTag, int buchungsdauer, SonstigeServices.EMarke EMarke) {
        this.preisProTag = preisProTag;
        this.buchungsdauer = buchungsdauer;
        this.EMarke = EMarke;
    }

    int berechnePreis(int preisProTag, int buchungsdauer) {
        preis = preisProTag * buchungsdauer;
        return preis;
    }

}

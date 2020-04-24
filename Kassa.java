package winkel;

import org.w3c.dom.ls.LSOutput;

public class Kassa {
    private int kassanummer;
    private Klant klant;
    private Medewerker medewerker;
    private Product product;
    private int totaalprijs;

    public Kassa(int kasNr){
        kassanummer = kasNr;
    }

    public Klant getKlant(){
        return klant;
    }

    public void setKlant(Klant k){
        klant = k;
    }

    public Medewerker getMedewerker(){
        return medewerker;
    }

    public void setMedewerker(Medewerker m){
        medewerker = m;
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product p){
        product = p;
    }


    @Override
    public String toString(){
        String result = "\n";
        try {
            result += "Bij kassa " + this.kassanummer + " heeft " + klant.getNaam() + " bij medewerker " + medewerker.getNaam() + " de volgende producten gekocht en op rekeningnummer " + klant.getRekeningnummer() + " betaald:";
        }catch (NullPointerException e){
            result += "Er is niet voldoende informatie aanwezig";
        }
        result += "\n";
        return result;
    }

}

package winkel;

public class Medewerker {
    private String naam;

    public Medewerker(String nm){
        naam = nm;
    }

    public String getNaam(){
        return naam;
    }

    @Override
    public String toString(){
        return naam;
    }


}

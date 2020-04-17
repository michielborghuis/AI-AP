package formatieveopdracht1a;

public class Klant {
   private String naam;
   private double kortingsPercentage;

   public Klant(String naam){
       this.naam = naam;
   }
   public void setKortingsPercentage(double kortingsPercentage){
      this.kortingsPercentage = kortingsPercentage;}

   public double getKortingsPercentage(){
      return kortingsPercentage;
   }
   public String toString(){
      return "Naam: "+naam+"\nKorting: "+kortingsPercentage;
   }

}

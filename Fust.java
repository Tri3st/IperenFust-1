public class Fust{
  private String datum; //ddmmyy
  private int stapel;
  private int laag14;
  private int kk20;
  private int vat;
  private int ibc;
  private int euroPall;
  private int cp9Pall;
  
  public Fust(String datum){
    this.datum = datum;
  }
  
  public void verrKannen (int mut){
    this.kk20 += mut;
  }
  
  public void verrVaten (int mut){
    this.vat += mut;
  }
  
  public void verrEuroPall (int mut){
    this.euroPall += mut;
  }
  
  public void verrCP9Pall (int mut){
    this.cp9Pall += mut;
  }
  
  public void verrIbcs (int mut){
    this.ibc += mut;
  }
  
  public void printData(){
    System.out.printf("====== OVERZICHT ======%n");
    System.out.printf("Datum : %s%n",this.datum);
    System.out.printf("europallets : %10d%n",this.euroPall);
    System.out.printf("CP9         : %10d%n",this.cp9Pall);
    System.out.printf("kk20        : %10d%n",this.kk20);
    System.out.printf("VAT         : %10d%n", this.vat);
    System.out.printf("IBC's       : %10d%n",this.ibc);
    
  }
}
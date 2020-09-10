import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner sca= new Scanner(System.in);
    String datum2 = mainScreen(sca);
    Fust fu = new Fust(datum2);
    kanScreen(fu, sca);
    vatScreen(fu, sca);
    ibcScreen(fu, sca);
    fu.printData();
  }
  
  private static String mainScreen(Scanner sc){
    System.out.println("Hallo en welkom bij de van Iperen fust calculator!");
    System.out.println("---------------------------------------------");
    System.out.println("Voer datum in (ddmmyy)");
    String temp = null;
    while (true){
      temp = sc.nextLine();
      if (checkDatum(temp)) break;
      System.out.println("INCORRECT. voer een geldige datum in (ddmmyy)");
    }
    return temp;
  }
  
  private static void kanScreen(Fust fust, Scanner sc){
    int diffKan=0;
    int k70=0;
    int diffPall=0;
    System.out.println("Hoeveel stapels (5 * 14)");
    k70 = sc.nextInt();
    fust.verrKannen(k70 * 70);
    fust.verrEuroPall(k70 * 2);
    System.out.println("Verrekening? (j/n)");
    char verr = sc.next().charAt(0);
    if (verr == 'j' || verr == 'J'){
      System.out.println("verrekening kannen (mag negatief zijn)");
      diffKan = sc.nextInt();
      System.out.println("verrekening europall (mag negatief zijn)");
      diffPall =sc.nextInt();
      fust.verrKannen(diffKan);
      fust.verrEuroPall(diffPall);
    } 
  }
  
  private static void vatScreen(Fust fust, Scanner sc){
    int vat=0;
    int diffVat=0;
    int diffCP9=0;
    System.out.println("Hoeveel stapels vaten?");
    vat = sc.nextInt();
    fust.verrVaten(8*vat);
    fust.verrCP9Pall(2*vat);
    System.out.println("Verrekening vaten of CP9? (j/n)");
    char verr2 = sc.next().charAt(0);
    if (verr2 == 'j' || verr2 == 'J'){
      System.out.println("verrekening vaten (mag negatief zijn");
      diffVat = sc.nextInt();
      fust.verrVaten(diffVat);
      System.out.println("verrekening CP9 (mag negatief zijn)");
      diffCP9 = sc.nextInt();
      fust.verrCP9Pall(diffCP9);
    }
  }
  
  private static void ibcScreen(Fust fust, Scanner sc){
    int ibcs=0;
    System.out.println("Verrekening IBC? (j/n)");
     char verr3 = sc.next().charAt(0);
    if (verr3 == 'j' || verr3 == 'J'){
      System.out.println("verrekening IBC's");
      ibcs = sc.nextInt();
      fust.verrIbcs(ibcs);
    }
  }
  
  private static boolean checkDatum(String dt){
    int count=0;
    boolean correct = true;
    boolean dagCorrect = false;
    boolean maandCorrect = false;
    boolean jaarCorrect = false;
    int dag = 0;
    int maand = 0;
    int jaar = 0;
    for (int i=0;i<dt.length();i++){
      char c = dt.charAt(i);
      if (!(c<='9' && c>='0') && correct) correct = false;
     else {
      correct = true;
      count++;
     }
    }
    
    dag=Integer.parseInt(dt.substring(0,2));
    maand=Integer.parseInt(dt.substring(2,4));
    jaar=Integer.parseInt(dt.substring(4));

    switch (maand) {
      case 1:
        if(dag>=01 && dag<=31 ) dagCorrect=true;
      break;
      case 2:
        if(dag>=01 && dag<=29 ) dagCorrect=true;
      break;
      case 3:
        if(dag>=01 && dag<=31 ) dagCorrect=true;
      break;
      case 4:
        if(dag>=01 && dag<=30 ) dagCorrect=true;
      break;
      case 5:
        if(dag>=01 && dag<=31 ) dagCorrect=true;
      break;
      case 6:
        if(dag>=01 && dag<=30 ) dagCorrect=true;
      break;
      case 7:
        if(dag>=01 && dag<=31 ) dagCorrect=true;
      break;
      case 8:
        if(dag>=01 && dag<=31 ) dagCorrect=true;
      break;
      case 9:
        if(dag>=01 && dag<=30 ) dagCorrect=true;
      break;
      case 10:
        if(dag>=01 && dag<=31 ) dagCorrect=true;
      break;
      case 11:
        if(dag>=01 && dag<=30 ) dagCorrect=true;
      break;
      case 12:
        if(dag>=01 && dag<=31 ) dagCorrect=true;
      break;
      default:
          dagCorrect=false;
      break;
    }
    // TODO maanden 01-12
    if (maand>=01 && maand<=12) maandCorrect=true;
    // TODO jaren 00-99
    if(jaar>=01 && jaar<=99) jaarCorrect=true;
    // TODO maak er ook een 'gewone datum' van
    return (correct && dagCorrect && maandCorrect && jaarCorrect);
  }

 
}
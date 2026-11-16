import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner skaner = new Scanner(System.in);
    System.out.print("Podaj tekst : ");
    String tekst = skaner.nextLine();

    for(int i = 0; i < tekst.length(); i++){
      char znak = tekst.charAt(i);
      if(Character.isUpperCase(znak)){
        znak = Character.toLowerCase(znak);
        System.out.print(znak);
      }
      else{
        znak = Character.toUpperCase(znak);
        System.out.print(znak);
      }
    }
  }
}
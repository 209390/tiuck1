import java.util.Scanner;

/***
 * Klasa, przy pomocy której jest pobierane imię użytkownika, a następnie wyświetlana wiadomość powitalna z jego imieniem.
 */
public class Hello_world {

  /***
   *  Scanner umożliwiający pobranie danych z wejścia.
   */
  static Scanner inputScanner = new Scanner(System.in);

  /***
   * Główna metoda w programie.
   * @param arg Argumenty przekazywane z linii poleceń
   */
  public static void main(String[] arg) {
    printHello();
  }

  /***
   * Metoda pobierająca i wyświetlająca imię użytkownika.
   */
  private static void printHello(){
    System.out.println("Please, give me your name");
    if (inputScanner.hasNext()) {
      String input = inputScanner.nextLine();
      System.out.println("Hello, " + input);
    } else {
      System.out.println("Incorrect input");
    }
  }
}

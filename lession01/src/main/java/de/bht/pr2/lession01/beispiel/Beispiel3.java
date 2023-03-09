package de.bht.pr2.lession01.beispiel;

public class Beispiel3 {

  // Die Ausnahme (ArithmeticException) fangen
  // und behandeln

  public static void main(String[] args) {
    double division = 0d; // Schon Platz reservieren

    try {
      int zaehler = 100;
      int nenner = ((7 * 21) - 56) % 13; // Am Ende erreichen wir Null
      division = zaehler / nenner;
    } catch (ArithmeticException e) {
      System.out.println("!!! Ausnahme:");
      System.out.println(e + "exception wird mit e geprintet");
      division = 0; // Default-Wert zuweisen
    }

    System.out.println("Ergebnis: " + division);
  }
}

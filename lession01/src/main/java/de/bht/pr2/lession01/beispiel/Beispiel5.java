package de.bht.pr2.lession01.beispiel;

public class Beispiel5 {

  // Ein catch-Block, mehrere Ausnahmen

  public static void main(String[] args) {
    double division = 0d; // Schon Platz reservieren

    try {
      int zaehler = 100;
      int nenner = 0; // Am Ende erreichen wir Eins
      division = zaehler / nenner;

      int[] array = {1, 2, 3, 4, 5};
      array[5] = 100;
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println("!!! Ausnahme:");
      System.out.println(e);
    }

    System.out.println("Ergebnis: " + division);
  }
}

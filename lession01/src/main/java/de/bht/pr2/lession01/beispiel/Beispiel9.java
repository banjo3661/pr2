package de.bht.pr2.lession01.beispiel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Beispiel9 {

  // Ungepruefte Ausnahme beim Compiler ignoriert

  public static void dateiUndDivision(int zaehler, String dateiName) throws ArithmeticException, // Ungeprueft /* TODO: Nimm 'ArithmeticException' weg und schau, dass es noch kompiliert.
      FileNotFoundException

  { // Geprueft
    int nenner = 0;

    /* TODO: Tausche die nächsten zwei Zeilen aus um den Effekt zu sehen, dass eine andere Exception zuerst geworfen wird. */
    int division = zaehler / nenner;
    FileInputStream file = new FileInputStream(dateiName);
  }

  public static void main(String[] args) {
    double division = 0d; // Schon Platz reservieren

    try {
      dateiUndDivision(100, "Beispiel123.java");
    } catch (FileNotFoundException e) {
      System.out.println("Datei nicht gefunden");
      System.out.println(e);
      System.out.println("-----");
    }
    // Kein catch-Block fuer ArithmeticException erforderlich,
    // weil sie ungeprueft ist
  }
}

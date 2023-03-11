package de.bht.pr2.lession01.beispiel;

import java.util.Scanner;

public class Beispiel15 {

  // Benutzung von selber definierte Ausnahme-Klasse

  public static void main(String[] args) {
    Scanner tastatur = new Scanner(System.in);
    System.out.println("Haben wir Spass gemacht?");
    System.out.println("Antworten Sie bitte \"ja\" oder \"nein\"");

    try {
      String antwort = tastatur.nextLine();
      if (!antwort.equalsIgnoreCase("ja") &&
              !antwort.equalsIgnoreCase("nein")) {



        throw new NeitherYesOrNoException("Benutzer hat eingetippt: " + antwort);
      }
    } catch (NeitherYesOrNoException e) {
      System.out.println("-----");
      System.out.println("Falsche Antwort von Benutzer");
      System.out.println(e);
    }

    tastatur.close();
  }
}
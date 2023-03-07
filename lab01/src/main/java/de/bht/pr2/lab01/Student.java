package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) {
    // pRINTEN "data"  Arryalist mit den ganzen Inofs im String Format
    System.out.println(dataRow);


    // Pruefe ob die Sturktur stimmt (name, reg.nummer, Studiengang, Rueckmeldegeb�hr)
    try {
      // dataRow wird bei jedem "," geeteilt
      String[] trennung = dataRow.split(",");

      // lokale rueckmeldegebuher, weil global = static final (einmal zuweisbar und  immerdeselbe wert=312) ist
      int rueckmeldegebuehr = 0;

      name = trennung[0];
      registrationNumber = Integer.parseInt(trennung[1]);
      courseOfStudies =  trennung[2];
      rueckmeldegebuehr = Integer.parseInt(trennung[3]);
    }
    // Ausgabe, wenn die Struktur nicht stimmt.
    catch (Exception e) {

      System.out.println("StudentParseException");

    }

    try {
      String[] trennung = dataRow.split(",");



      registrationNumber = Integer.parseInt(trennung[1]);


      int length = String.valueOf(registrationNumber).length();
      if (length>=5){

      }
    }

    catch (Exception e) {

      System.out.println("am");

    }


  }
}

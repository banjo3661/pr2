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

      System.out.println("StudentParseException "  + e + " " + dataRow);

    }

    // Prüfe ob die Martikelnummerstimm (mind 5 Ziffern und Int)

    try {
      // dataRow wird bei jedem "," geeteilt
      String[] trennung = dataRow.split(",");

      registrationNumber = Integer.parseInt(trennung[1]);

      //Notwendig damit man den Datentyp von elemenatrenDatentypen überprüfen kann
      ((Object)registrationNumber).getClass().getSimpleName();
      boolean datentypcheck = Integer.class.isInstance(registrationNumber);

      int length = String.valueOf(registrationNumber).length();

      if (length>=5 && datentypcheck){

      }


    }

    catch (Exception e) {

      System.out.println("RegistrationNumberException " + registrationNumber);

    }
    // Prüfe ob der Studiengang stimmt

    try {

      String[] trennung = dataRow.split(",");

      courseOfStudies =  trennung[2];

      if(courseOfStudies.equals("Technische Informatik") || courseOfStudies.equals("Druck- und Medientechnik") || courseOfStudies.equals("Screen Based Media") || courseOfStudies.equals("Medieninformatik")) {


      }

    }

    catch (Exception e) {

      System.out.println("RegistrationNumberException " + courseOfStudies);


    }

    //Prüfe ob Rueckmeldegebuehr stimmt

    try {

      String[] trennung = dataRow.split(",");
      // lokale rueckmeldegebuher, weil global = static final (einmal zuweisbar und  immerdeselbe wert=312) ist
      int rueckmeldegebuehr = 0;
      rueckmeldegebuehr = Integer.parseInt(trennung[3]);

      if (rueckmeldegebuehr==TUITION_FEE){

      }



    } catch (Exception e){

      //int restbetrag = rueckmeldegebuehr-TUITION_FEE;
      System.out.println("NotPaidTuitionFeeException " );


    }


  }
}


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
  public Student(String dataRow) throws StudentParseException, RegistrationNumberException, NotPaidTuitionFeeException, WrongCourseOfStudiesException {
    // pRINTEN "data"  Arryalist mit den ganzen Inofs im String Format
    // System.out.println(dataRow);
    String[] trennung = dataRow.split(",");


    // Strukturcheck
    if (trennung.length != 4) {
       throw new StudentParseException("Not enough parts in data: " + dataRow + ".");
    }


    name = trennung[0];

    // Matrikelüberprüfung
    int length = 0;

    // Prüfe ob die Martikelnummerstimm (mind 5 Ziffern und Int)
    try {
      registrationNumber = Integer.parseInt(trennung[1]);         // (Bedingung 1) Umwandlung / Ziel: Check ob String ein Integer ...
      length = String.valueOf(registrationNumber).length();       //Ziffer Berechnung der Martikelnummer
    } catch (Exception e) {
      throw new RegistrationNumberException("Falsche Martikelnummer: " + trennung[1] + ".");
    }

    if (length < 5){                                              // (Bedingung 2) Anzahl der Zifferncheck
      throw new RegistrationNumberException("Falsche Martikelnummer: " + trennung[1]);
    }


    // Kursüberprüfung
    courseOfStudies = trennung[2];
    if(     !courseOfStudies.equals("Technische Informatik") &&
            !courseOfStudies.equals("Druck- und Medientechnik") &&
            !courseOfStudies.equals("Screen Based Media") &&
            !courseOfStudies.equals("Medieninformatik")) {
      throw new WrongCourseOfStudiesException(" RegistrationNumberException Falscher Kurs" + courseOfStudies);
    }


    int rueckmeldegebuehr = 0;

    //Prüfe ob Rueckmeldegebuehr stimmt
    try {
      rueckmeldegebuehr = Integer.parseInt(trennung[3]);
    } catch (Exception e){
      throw new RegistrationNumberException("Falsche Rückmeldung");
    }

    if (rueckmeldegebuehr != TUITION_FEE){
      rueckmeldegebuehr = TUITION_FEE - rueckmeldegebuehr;
      throw new NotPaidTuitionFeeException("Fehlende Summe" + rueckmeldegebuehr);
    }
  }

  public String toString() {
    return "Student [" +
            "name='" + name +
            ", registrationNumber=" + registrationNumber +
            ", courseOfStudies='" + courseOfStudies +
            ']';
  }
}


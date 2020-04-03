package main.java;

import java.util.Scanner;

public class Programmierkurs {

  private static Scanner scanner; // Deklaration - Erschafft

  public static void main(String[] args) {
    scanner = new Scanner(System.in); // Initialisierung - weist Wert zu

    // TODO Datenschutzabfrage

    methodeBegruessung();
    double zahl = methodeLieblingszahl();
    System.out.println("Zahl " + zahl);
  }

  private static String methodeBegruessung() {
    System.out.println("Wie ist Dein Name?");

    String text;
    text = scanner.nextLine();

    System.out.println("Hallo " + text + " :)");
    return text;
  }

  private static double methodeLieblingszahl() {

    System.out.println("Was ist Deine Lieblingszahl?");

    String strLieblingszahl = scanner.nextLine();
    System.out.println("Eingabe: " + strLieblingszahl); // ausgeben der Zahl als Text

    double lieblingszahl = 0;

    if (strLieblingszahl.equals("pi") || strLieblingszahl.equals("Pi")) {
      lieblingszahl = Math.PI;
    } else if (strLieblingszahl.equals("e") || strLieblingszahl.equals("E")) {
      lieblingszahl = Math.E;
    } else {
      lieblingszahl = Double.parseDouble(strLieblingszahl);
    }

    System.out.println("Haha ich bin besser, meine Lieblingszahl ist " + lieblingszahl * 2);

    return lieblingszahl;
  }
}

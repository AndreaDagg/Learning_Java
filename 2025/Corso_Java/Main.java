package Corso_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * FINAL:   Creazione di un menu per selezionare l'argomento da visualizzare con keyword FINAL ovvero non modificabile
         * STATIC:  
         */
        final String[] argomenti = { "Array Bidimensionali", "Wrapper Classes", "Array List", "Classe Persona" };
        Scanner scannerArgomento = new Scanner(System.in);

        System.out.println("Argomenti: \n");
        for (int i = 0; i < argomenti.length; i++) {
            System.out.println((i + 1) + " : " + argomenti[i]);
        }

        System.out.println("\nInserisci il numero dell'argomento di cui vuoi vedere l'output: ");
        scannerArgomento = new Scanner(System.in);

        switch (scannerArgomento.nextInt() - 1) {
            case 0:
                array_bidimensionali();
                break;
            case 1:
                wrapper_classes();
                break;
            case 2:
                array_list();
                break;
            case 3:
                classe_persona();
                break;

            default:
                System.out.println("SELEZIONE NON CORRETTA");
                break;
        }

    }

    private static void array_bidimensionali() {

        int[][] matrice = new int[3][3];
        String[][] matriceString = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };

        System.out.println("\nGestione di un array bidimensionale");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                matrice[i][j] = Math.random() > 0.5 ? 1 : 0;
            }
        }

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * For each loop in java di un array bidimensionale
         * nota come il primo è di timpo array mentre il secondo è di tipo string
         */
        System.out.println("\nFor each loop in java di un array bidimensionale");
        for (String[] stringa : matriceString) {
            for (String string2 : stringa) {
                System.out.print(string2 + " ");
            }
            System.out.println();
        }
    }

    private static void wrapper_classes() {

        /*
         * Le classi wrapper sono delle classi che permettono di incapsulare i tipi
         * primitivi in oggetti
         * Questo permette di avere metodi utili per la gestione di questi tipi
         * Sono più lente dei tipi primitivi ma permettono di avere metodi utili
         * 
         */

        Boolean vero = true;
        boolean True = true; // Questo è un tipo primitivo

        Character carattere = 'a';
        char carattere2 = 'a'; // Questo è un tipo primitivo

        Integer intero = 10;
        int intero2 = 10; // Questo è un tipo primitivo

        Double decimale = 10.5;
        double decimale2 = 10.5; // Questo è un tipo primitivo

        String stringa = "Ciao";
        String stringa2 = new String("Ciao");

        /*
         * A questo punto possiamo ottenre dei metodi utili per le varie classi wrapper
         */

        if ((vero == True) && (intero == intero2) && (decimale == decimale2) && (stringa.equals(stringa2))) {
            System.out.println("Le due tipologie di variabili sono uguali");
        } else {
            System.out.println("Le due tipologie di variabili sono diverse");
        }

    }

    private static void array_list() {
        

        /*
         * ArrayList è una classe che permette di gestire un array di oggetti
         * Accettano solo oggetti e non tipi primitivi
         */

        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Mario");
        persone.add("Luigi");
        persone.add("Giovanni");

        for (String persona : persone) {
            System.out.println("Persona: " + persona);
        }

        persone.set(2, "Paola");
        persone.remove(0);

        for (int i = 0; i < persone.size(); i++) {
            System.out.println("Persona: " + persone.get(i));
        }

        ArrayList<String> persone2 = new ArrayList<String>();
        persone2.add("Drake");
        persone2.add("Kendrick Lamar");

        ArrayList<ArrayList<String>> bidimensionale = new ArrayList<ArrayList<String>>();
        bidimensionale.add(persone);
        bidimensionale.add(persone2);

        for (ArrayList<String> arrayList : bidimensionale) {
            System.out.println("\n");
            for (String string : arrayList) {
                System.out.print("Bi: " + string + " ");
            }

        }

        persone.clear();
        persone2.clear();
        System.out.println("\nPersones Size after clear: " + persone.size() + " and " + persone2.size() + "\n");

    }

    private static void classe_persona() {

        /*
         * Creazione di classi Persona con attributi e metodi associati
         */

        Persona persona1 = new Persona("Mario", "Rossi", 25, "Blu");
        Persona persona2 = new Persona("Luigi", "Verdi", 30, "Verde");
        Persona personaOverload = new Persona("Giovanni", "Bianchi");
        
        persona1.stampaDati(false);
        persona2.stampaDati(false);
        personaOverload.stampaDati(true);

        System.out.println("\nPosizione in memoria di persona1: " + persona1);

        /*
         * Creazione di un array di OGGETTI di tipo Persona 
         */
        Persona[] arrayDiPersone = new Persona[3];
        arrayDiPersone[0] = persona1;
        arrayDiPersone[1] = persona2;
        arrayDiPersone[2] = personaOverload;

        //Sfruttiamo gli array di oggetti per il passaggio diun ogetto come parametro +
        arrayDiPersone[0].collega(arrayDiPersone[1]);

        // Utilizzo di variabili statiche. Si accede non con l'istanza ma con la classe. 
        System.out.println("\nNumero di persone create: " + Persona.personeCounter);
        
    }


}

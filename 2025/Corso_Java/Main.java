package Corso_Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] argomenti = {"Array Bidimensionali", "Wrapper Classes"};
        Scanner scannerArgomento = new Scanner(System.in);



        System.out.println("Argomenti: \n");
        for (int i = 0; i < argomenti.length; i++) {
            System.out.println((i+1) + " : " +argomenti[i]);
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
        
            default:
                System.out.println("SELEZIONE NON CORRETTA");
                break;
        }

    }

   

    private static void array_bidimensionali(){

        int[][] matrice = new int[3][3];
        String[][] matriceString = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

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
        for(String[] stringa: matriceString){
            for(String string2: stringa){
                System.out.print(string2 + " ");
            }
            System.out.println();
        }
    }


    private static void wrapper_classes(){

        /*
         * Le classi wrapper sono delle classi che permettono di incapsulare i tipi primitivi in oggetti
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

         if ((vero == True) && (intero == intero2) && (decimale == decimale2) && (stringa.equals(stringa2))){
                System.out.println("Le due tipologie di variabili sono uguali");
         } else {
             System.out.println("Le due tipologie di variabili sono diverse");
         }

    }

}

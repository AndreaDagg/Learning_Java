package Corso_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

import Corso_Java.Interfaccie.Gazzella;
import Corso_Java.Interfaccie.Leone;
import Corso_Java.Interfaccie.Pesce;
import Corso_Java.classi_astratte.auto_ClasseNonAstratta;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
         * FINAL: Creazione di un menu per selezionare l'argomento da visualizzare con
         * keyword FINAL ovvero non modificabile
         * STATIC:
         */
        final String[] argomenti = { "Array Bidimensionali", "Wrapper Classes", "Array List", "Classe Persona",
                "Ereditarietà ed Overrride", "Classe Astratta", "Interfacce", "Polimoorfismo", "Files", "HashMap", "Iteratore" };
        Scanner scannerArgomento = new Scanner(System.in);
        int selezionato = -1;

        try {
            System.out.println("Argomenti: \n");
            for (int i = 0; i < argomenti.length; i++) {
                System.out.println((i + 1) + " : " + argomenti[i]);
            }

            System.out.println("\nInserisci il numero dell'argomento di cui vuoi vedere l'output: ");
            scannerArgomento = new Scanner(System.in);
            selezionato = scannerArgomento.nextInt();
            switch (selezionato - 1) {
                case 0:
                System.out.println("\n\n");
                    array_bidimensionali();
                    break;
                case 1:
                System.out.println("\n\n");
                    wrapper_classes();
                    break;
                case 2:
                System.out.println("\n\n");
                    array_list();
                    break;
                case 3:
                System.out.println("\n\n");
                    classe_persona();
                    break;
                case 4:
                System.out.println("\n\n");
                    Ereditarietà();
                    break;
                case 5:
                System.out.println("\n\n");
                    classe_astratta();
                    break;
                case 6:
                System.out.println("\n\n");
                    interfaccia();
                    break;
                case 7:
                System.out.println("\n\n");
                    polimorfismo();
                    break;
                case 8:
                System.out.println("\n\n");
                    Files();
                    break;
                case 9:
                System.out.println("\n\n");
                    Hashmap();
                    break;
                case 10:
                System.out.println("\n\n");
                    Iteratore();
                    break;

                default:
                    System.out.println("SELEZIONE NON CORRETTA");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e);
        } finally {
            // A prescindere di quello che succede chiudo lo scanner e continua l'eseuzione
             try {
                String nomeFile = "file/log" + LocalDate.now().toString() + ".txt";
                PrintStream fileStream = new PrintStream(new FileOutputStream(nomeFile, true));
                fileStream.append("\n\n" + LocalDate.now().toString() + " AT " + LocalTime.now().toString()+ " || ");
                fileStream.print("Argomento selezionato: " + (selezionato) + " ");
                fileStream.append(System.out.toString());
                fileStream.close();
                System.out.println("Fine Esecuzione");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            scannerArgomento.close();
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

        // Sfruttiamo gli array di oggetti per il passaggio diun ogetto come parametro +
        arrayDiPersone[0].collega(arrayDiPersone[1]);

        // Utilizzo di variabili statiche. Si accede non con l'istanza ma con la classe.
        System.out.println("\nNumero di persone create: " + Persona.personeCounter);

    }

    private static void Ereditarietà() {

        /*
         * Ereditarietà: Studente eredita da Persona
         * 
         * Dato che studente estende persona ha accesso a utte le sue fuonzioni come
         * stampaDati
         */
        Persona persona1 = new Persona("Luca", "Rossi");
        Studente studente1 = new Studente("Luca", "Rossi", "Matematica", "3A");
        Insegnante insegnante1 = new Insegnante("Luca", "Rossi", "Matematica", "3A", "3B");
        studente1.stampaDati(true);

        /*
         * L'override di un metodo permette di sovrascrivere il metodo della classe
         * padre
         */
        persona1.saluta();
        studente1.saluta();
        insegnante1.saluta();

    }

    private static void classe_astratta() {
        auto_ClasseNonAstratta auto = new auto_ClasseNonAstratta();
        System.out.println("\n-- Classe Astratta --");
        auto.muovi();
        auto.frena();
    }

    private static void interfaccia() {
        /*
         * Interfaccia: Un'interfaccia java è un contratto che definisce i metodi che
         * una classe deve implementare
         * Siminili alle classi astratte ma con la differenza che possono essere
         * implementate da più classi.
         * Una classe può estedere una sola classe astratta ma può implementare più
         * interfacce
         */

        // implementa solo una interfaccia
        Leone leone = new Leone();
        Gazzella gazzella = new Gazzella();
        // implementa due interfacce
        Pesce pesce = new Pesce();

        gazzella.scappa();
        leone.caccia();
        pesce.caccia();
        pesce.scappa();
    }

    private static void polimorfismo() {
        System.out.println("\n-- Polimorfismo --");
        /*
         * un oggetto può assumere più forme. Colegarsi a più tipi di dato
         */

        Studente studente1 = new Studente("Luca", "Rossi", "Matematica", "3A");
        Insegnante insegnante1 = new Insegnante("MArco", "Toppa", "Matematica", "3A", "3B");

        /*
         * Polimorfismo: Questi due oggetti possono cambiare forma ed identificarsi in
         * una nuova forma che lia ccetti entrami
         * 
         * Ad esempio Studente e Insegnante estedono entrambi perosna e quindi possono
         * essere inseriti in un array di persona
         */
        // Studente[] classe = { studente1, insegnante1 };
        // Insegnante[] clsse = { studente1, insegnante1 };
        Persona[] classe = { studente1, insegnante1 };

        // Possiamo utilizzare i metodi in comune tra le tre classi
        for (Persona persona : classe) {
            persona.saluta();
        }

    }

    private static void Files() throws IOException {
        File file = new File("file\\prova.txt");
        FileWriter fileWriter = new FileWriter("file\\log.txt");

        if (file.exists()) {
            System.out.println("Il file esiste. Path: " + file.getPath());
            System.out.println("Il file esiste. Path Absolute: " + file.getAbsolutePath());
            System.out.println("è una directory: " + file.isDirectory());
            System.out.println("è un file: " + file.isFile());
        } else {
            System.out.println("Il file non esiste");
        }

        fileWriter.write("Ciao - ");
        fileWriter.append(LocalDate.now().toString());
        fileWriter.close();

    }

    private static void Hashmap() {
        /*
         * HashMap: è una collezione che permette di memorizzare coppie chiave-valore
         * 
         * HashMap<Chiave, Valore>
         */

         HashMap<String, String> capitali = new HashMap<String, String>();
            capitali.put("Italia", "Roma");
            capitali.put("Francia", "Parigi");
            capitali.put("Germania", "Berlino");
            capitali.put("Spagna", "Madrid");
            capitali.put("Inghilterra", "Londra");


            for (String key : capitali.keySet()) {
                System.out.println(key + " : " + capitali.get(key));
            }



    }

    private static void Iteratore(){
        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Mario");
        persone.add("Luigi");
        persone.add("Giovanni");
        
        Iterator<String> iterator = persone.iterator();
        System.out.println("\nIteratore: ");
        while(iterator.hasNext()){
            String persona = iterator.next();
            System.out.println(persona);
            if(persona.equals("Luigi")){
                try { 
                     iterator.remove();
                     System.out.println("Persona "+ persona + " rimossa");
                } catch (Exception e) {
                    System.out.println("Errore: " + e);
                } 
            }
        }

    }
}

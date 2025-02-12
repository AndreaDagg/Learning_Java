package Corso_Java.classi_astratte;

/*
 * Auto estende Veicolo_ClasseAstratta e quindi eredita tutte le caratteristiche della classe astratta
 * 
 * Andiamo a fare l'override delle clasi dichiarate nella classe astratta.  
 */
public class auto_ClasseNonAstratta extends Veicolo_ClasseAstratta {

    @Override
    public void muovi() {
        System.out.println("L'auto si muove");
    }

    @Override
    public void frena() {
        System.out.println("L'auto frena");
    }

}

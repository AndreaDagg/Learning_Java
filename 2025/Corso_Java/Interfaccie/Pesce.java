package Corso_Java.Interfaccie;

/*
 * In questo caso la classe Pesce implementa sia l'interfaccia Preda che l'interfaccia Predatore.
 * 
 * E' obbligatorio implementare tutti i metodi delle interfacce che si vogliono implementare.
 */
public class Pesce implements Preda, Predatore{
    @Override
    public void scappa() {
        System.out.println("Il pesce scappa");
    }

    @Override
    public void caccia() {
        System.out.println("Il pesce caccia");
    }

}

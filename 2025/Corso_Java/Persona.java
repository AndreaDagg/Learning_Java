package Corso_Java;

public class Persona {

    String nome;
    String cognome;
    int eta;
    String colorePreferito;
    // Attraverso l'utilizzo di static, la variabile è condivisa tra tutte le istanze della classe che vengono create non è legata a nessuna istanza, infatti nel costruttore all'incremento non c'è la key this
    static int personeCounter;

    // Costruttore della classe Persona
    public Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
        personeCounter++;
    }

    // Overloading del costruttore
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        personeCounter++;
    }

    // Metodo per stampare i dati della persona
    public void stampaDati(boolean isOverloaded) {
        if (isOverloaded) {
            System.out.println("\nid:" + personeCounter + " Nome: " + nome + "\nCognome: " + cognome);
        } else {
            System.out.println("\nid:" + personeCounter + " Nome: " + nome + "\nCognome: " + cognome + "\nEtà: " + eta + "\nColore Preferito: "
                    + colorePreferito);
        }
    }

    // passaggio di un oggetto come parametro
    void collega(Persona persona) {
        System.out.println("La persona " + this.nome + " " + this.cognome + " è collegata con " + persona.nome + " "
                + persona.cognome);
    }

    void saluta() {
        System.out.println("Ciao sono la persona " + this.nome + " " + this.cognome);
    }
}

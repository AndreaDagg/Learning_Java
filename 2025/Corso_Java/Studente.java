package Corso_Java;

/*
 * Ereditarietà: Studente eredita da Persona
 */
public class Studente extends Persona{

    String materiaPreferita; 
    String classe;
    int voto[] = new int[2];  

    public Studente(String nome, String cognome, String materiaPreferita, String classe) {
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;
        this.classe = classe;
        //TODO Auto-generated constructor stub, ha gli stessi paramentri di Persona
    
    }

    /*
     * Overriding del metodo saluta() della classe Persona 
     * L'ovverride permette di sovrascrivere il metodo della classe padre
     * Non è un metodo proprietario ma dertica dalla calsse padre Persona e viene sovrascritto nella classe figlia Studente 
     */
    @Override
    void saluta(){
        System.out.println("Ciao sono lo studente " + this.nome + " " + this.cognome);
    }   

}

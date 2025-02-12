package Corso_Java;

public class Insegnante extends Persona {

    String materiaInsegnata;
    String[] classi = new String[2];

    public Insegnante(String nome, String cognome, String materiaInsegnata, String classe1, String classe2) {
        super(nome, cognome);
        this.materiaInsegnata = materiaInsegnata;
        this.classi[0] = classe1;
        this.classi[1] = classe2;
        //TODO Auto-generated constructor stub
    }

    @Override
    void saluta(){
        System.out.println("Ciao sono l'insegnante " + this.nome + " " + this.cognome);
    }

}

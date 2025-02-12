package Corso_Java.classi_astratte;

/*
 * Le classi astratte sono delle classi che non possono essere istanziate, quidni non possono diventare oggetti ma possono essere estese
 * ovvero, una classe astratta può essere estesa da una classe figlia e serve quindi a definire delle caratteristiche comuni a più classi
 */

/*
 * aggiungiamo la key word abstract per definire una classe astratta
 * 
 * Le classi astratte possono avere metodi astratti, ovvero metodi che non hanno un corpo e che devono essere implementati dalle classi figlie. 
 */
public abstract class Veicolo_ClasseAstratta {
  
  abstract void muovi();

  abstract void frena();

}

package RegistroStudenti;
import java.util.ArrayList;
public class Registro {
	ArrayList <Studente> studenti= new ArrayList <Studente>();
	
	// Metodo per aggiungere uno studente
    public void aggiungiStudente(String nome, String cognome, String matricola) {
        for (Studente s : studenti) {
            if (s.getMatricola().equals(matricola)) {//controllo se già presente la stessa matricola (univoca)
                System.out.println("La matricola è già presente.");
                return;//termina il metodo evitando la ripetizione
            }
        }//se il controllo di unicità della matricola viene superato:
        studenti.add(new Studente(nome, cognome, matricola));//aggiunge nuovo studente alla lista
        System.out.println("Lo studente è stato aggiunto.");
    }
	
	//metodo elenco studenti
    public void elencoStudenti() {
    		if (studenti.isEmpty()) {//metodo per vedere se la lista è vuota
    			System.out.println("La lista è vuota.");
    		}else {
    			System.out.println("Elenco studenti: ");//se non è vuota mi stampa ciò che c'è all'interno
    			for (Studente s : studenti) {
    				System.out.println(s);
    			}
    		}
    }
	
	//metodo ricerca studente tramite matricola
    public void ricercaMatricola(String matricola) {
    	for (Studente s : studenti) {
    		if (s.getMatricola().equals(matricola)) {
    			System.out.println(s + " è presente");
    			return;//termina il metodo evitando la ripetizione
    		}else {
    			System.out.println("Matricola studente inesistente.");
    		}
    	}
    }

}

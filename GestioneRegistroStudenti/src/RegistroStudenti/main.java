package RegistroStudenti;
import java.util.Scanner;
/*Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma
*/
public class main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	String risposta="";
	boolean uscita = false;//condizione ripetizione ciclo
	Registro a= new Registro();//nuovo ogetto istanza della classe Registro
	
	
	//menù           //Se uscita=false, !uscita è true e il ciclo continua
	while (!uscita) {//Quando uscita diventa true,!uscita è false e il ciclo si interrompe.
		// mantiene il programma attivo finché l'utente non sceglie volontariamentedi uscire.
        System.out.println("Menù: \r1) Aggiungere uno studente. \r2) Visualizza lista studenti. \r3) Ricerca studente tramite matricola. \r4)Uscita dal programma");
        risposta = scanner.nextLine().toLowerCase();

         switch (risposta){
             case "1":
            	 System.out.println("Inserisci nome studente:");
            	 String nome=scanner.nextLine();
            	 System.out.println("Inserisci cognome studente:");
            	 String cognome=scanner.nextLine();
            	 System.out.println("Inserisci matricola studente:");
            	 String matricola=scanner.nextLine();
            	 a.aggiungiStudente(nome,cognome,matricola);
             break;
             case "2":
            	 a.elencoStudenti();
             break;
             case "3":
            	 System.out.print("Inserisci matricola studente da cercare: ");
                 String matricolaRicerca = scanner.nextLine();
            	 a.ricercaMatricola(matricolaRicerca);
             break;
             case "4":
                 System.out.println("Uscita in corso...");
                 uscita = true; //uscita diventa true,!uscita è false e il ciclo si interrompe.
                 break;
             default:
                 System.out.println("Risposta non valida, riprova;");
                 break;
         }
     }
	 scanner.close();
 }

}
